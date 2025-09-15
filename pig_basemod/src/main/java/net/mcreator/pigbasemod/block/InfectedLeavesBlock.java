
package net.mcreator.pigbasemod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class InfectedLeavesBlock extends LeavesBlock {
	public InfectedLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(2f, 10f).noCollission().friction(0.8f).speedFactor(0.9f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
