
package net.mcreator.pigbasemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class DanchiSlabBlock extends SlabBlock {
	public DanchiSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}
