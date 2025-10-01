package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.pigbasemod.init.PigBasemodModBlocks;

public class SporeProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PigBasemodModBlocks.INFECTEDFOUNTAIN.get()) && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PigBasemodModBlocks.INFECTION_CORE.get())
				&& !((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER)) {
			world.setBlock(BlockPos.containing(x, y, z), PigBasemodModBlocks.INFECTOR.get().defaultBlockState(), 3);
		}
	}
}
