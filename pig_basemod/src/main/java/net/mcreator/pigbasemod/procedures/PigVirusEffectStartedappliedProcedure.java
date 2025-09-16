package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PigVirusEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("PigVirusStage", 1);
		entity.getPersistentData().putDouble("TTNS", (Mth.nextInt(RandomSource.create(), 2400, 6000)));
	}
}
