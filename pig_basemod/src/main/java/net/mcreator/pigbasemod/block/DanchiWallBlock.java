
package net.mcreator.pigbasemod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class DanchiWallBlock extends WallBlock {
	public DanchiWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POLISHED_DEEPSLATE).strength(1f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}
