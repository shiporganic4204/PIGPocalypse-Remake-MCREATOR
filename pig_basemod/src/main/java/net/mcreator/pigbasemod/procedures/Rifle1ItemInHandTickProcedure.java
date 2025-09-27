package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class Rifle1ItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("accuracy") > 5) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("accuracy", 5);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("accuracy") > 0) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("accuracy",
					Math.round(Math.pow(10, 2) * ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("accuracy") - 0.1)) / Math.pow(10, 2));
			if (entity.isSprinting()) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("accuracy",
						Math.round(Math.pow(10, 2) * ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("accuracy") + 0.3)) / Math.pow(10, 2));
			}
		}
		if (entity.getDeltaMovement().y() > 0) {
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("accuracy",
					Math.round(Math.pow(10, 2) * ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("accuracy") + 0.8)) / Math.pow(10, 2));
		} else if (entity.getDeltaMovement().y() < 0) {
			if (!(entity.fallDistance > 1)) {
				Vec3 motion = entity.getDeltaMovement().scale(0.85);
				entity.setDeltaMovement(motion);
			}
		} else {
			Vec3 motion = entity.getDeltaMovement().scale(0.7);
			entity.setDeltaMovement(motion);
		}
	}
}
