package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.pigbasemod.init.PigBasemodModBlocks;

public class SporeProjectile22222Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PigBasemodModBlocks.INFECTEDFOUNTAIN.get().defaultBlockState(), 3);
	}
}
