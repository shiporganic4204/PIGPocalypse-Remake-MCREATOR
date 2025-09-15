
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.pigbasemod.block.InfectorBlock;
import net.mcreator.pigbasemod.block.InfectedfountainBlock;
import net.mcreator.pigbasemod.block.InfectedBlockBlock;
import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PigBasemodMod.MODID);
	public static final RegistryObject<Block> INFECTED_BLOCK = REGISTRY.register("infected_block", () -> new InfectedBlockBlock());
	public static final RegistryObject<Block> INFECTEDFOUNTAIN = REGISTRY.register("infectedfountain", () -> new InfectedfountainBlock());
	public static final RegistryObject<Block> INFECTOR = REGISTRY.register("infector", () -> new InfectorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
