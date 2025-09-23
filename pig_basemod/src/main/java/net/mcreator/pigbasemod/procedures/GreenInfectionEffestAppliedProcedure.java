package net.mcreator.pigbasemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.pigbasemod.init.PigBasemodModMobEffects;

public class GreenInfectionEffestAppliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).equals("minecraft:pig")) {
			entity.getPersistentData().putDouble("GreenInfectionStage", 1);
			entity.getPersistentData().putDouble("TTNS", (Mth.nextInt(RandomSource.create(), 2400, 6000)));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(PigBasemodModMobEffects.GREEN_INFECTION.get());
		}
	}
}
