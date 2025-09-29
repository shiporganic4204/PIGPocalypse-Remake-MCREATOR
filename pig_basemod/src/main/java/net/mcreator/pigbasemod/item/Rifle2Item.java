
package net.mcreator.pigbasemod.item;

import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.pigbasemod.procedures.Rifle2rightclickedProcedure;
import net.mcreator.pigbasemod.procedures.Rifle2ItemInInvProcedure;
import net.mcreator.pigbasemod.procedures.Rifle2ItemInHandProcedure;
import net.mcreator.pigbasemod.procedures.Rifle2EntitySwingsProcedure;
import net.mcreator.pigbasemod.item.renderer.Rifle2ItemRenderer;

import java.util.function.Consumer;

import com.mojang.blaze3d.vertex.PoseStack;

public class Rifle2Item extends Item implements GeoItem {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	public String animationprocedure = "empty";

	public Rifle2Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return false;
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		super.initializeClient(consumer);
		consumer.accept(new IClientItemExtensions() {
			private final BlockEntityWithoutLevelRenderer renderer = new Rifle2ItemRenderer();

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				return renderer;
			}

			private static final HumanoidModel.ArmPose Rifle2Pose = HumanoidModel.ArmPose.create("Rifle2", false, (model, entity, arm) -> {
				if (arm == HumanoidArm.LEFT) {
					model.leftArm.xRot = -0.5F + model.head.xRot;
				} else {
					model.rightArm.xRot = -1.6F + model.head.xRot;
					model.leftArm.xRot = -1.6F + model.head.xRot;
					model.rightArm.yRot = 0F + model.head.yRot;
					model.leftArm.yRot = 0.8F + model.head.yRot;
					model.leftArm.zRot = 0F + model.head.zRot;
					model.rightArm.zRot = 0F + model.head.zRot;
				}
			});

			@Override
			public HumanoidModel.ArmPose getArmPose(LivingEntity entityLiving, InteractionHand hand, ItemStack itemStack) {
				if (!itemStack.isEmpty()) {
					if (entityLiving.getUsedItemHand() == hand) {
						return Rifle2Pose;
					}
				}
				return HumanoidModel.ArmPose.EMPTY;
			}

			public boolean applyForgeHandTransform(PoseStack poseStack, LocalPlayer player, HumanoidArm arm, ItemStack itemInHand, float partialTick, float equipProcess, float swingProcess) {
				int i = arm == HumanoidArm.RIGHT ? 1 : -1;
				poseStack.translate(i * 0.56F, -0.52F, -0.72F);
				if (player.getUseItem() == itemInHand) {
					poseStack.translate(0.05, 0.05, 0.05);
				}
				return true;
			}
		});
	}

	private PlayState idlePredicate(AnimationState event) {
		if (this.animationprocedure.equals("empty")) {
			event.getController().setAnimation(RawAnimation.begin().thenLoop("idle"));
			return PlayState.CONTINUE;
		}
		return PlayState.STOP;
	}

	String prevAnim = "empty";

	private PlayState procedurePredicate(AnimationState event) {
		if (!this.animationprocedure.equals("empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED || (!this.animationprocedure.equals(prevAnim) && !this.animationprocedure.equals("empty"))) {
			if (!this.animationprocedure.equals(prevAnim))
				event.getController().forceAnimationReset();
			event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
			if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
				this.animationprocedure = "empty";
				event.getController().forceAnimationReset();
			}
		} else if (this.animationprocedure.equals("empty")) {
			prevAnim = "empty";
			return PlayState.STOP;
		}
		prevAnim = this.animationprocedure;
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar data) {
		AnimationController procedureController = new AnimationController(this, "procedureController", 0, this::procedurePredicate);
		data.add(procedureController);
		AnimationController idleController = new AnimationController(this, "idleController", 0, this::idlePredicate);
		data.add(idleController);
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Rifle2rightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Rifle2EntitySwingsProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			Rifle2ItemInHandProcedure.execute(entity);
		Rifle2ItemInInvProcedure.execute(entity);
	}
}
