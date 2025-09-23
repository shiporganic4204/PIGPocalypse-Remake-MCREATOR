
package net.mcreator.pigbasemod.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.pigbasemod.procedures.GreenInfectionOnEffectTickProcedure;
import net.mcreator.pigbasemod.procedures.GreenInfectionEffestAppliedProcedure;

import java.util.List;
import java.util.ArrayList;

public class GreenInfectionMobEffect extends MobEffect {
	public GreenInfectionMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408768);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		GreenInfectionEffestAppliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GreenInfectionOnEffectTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
