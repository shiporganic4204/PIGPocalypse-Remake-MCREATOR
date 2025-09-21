
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.pigbasemod.block.InfectorBlock;
import net.mcreator.pigbasemod.block.InfectionCoreBlock;
import net.mcreator.pigbasemod.block.InfectedfountainBlock;
import net.mcreator.pigbasemod.block.InfectedLogBlock;
import net.mcreator.pigbasemod.block.InfectedLeavesBlock;
import net.mcreator.pigbasemod.block.InfectedGrassBlock;
import net.mcreator.pigbasemod.block.InfectedBlockBlock;
import net.mcreator.pigbasemod.block.FossilOreBlock;
import net.mcreator.pigbasemod.block.DanchiWallBlock;
import net.mcreator.pigbasemod.block.DanchiStairsBlock;
import net.mcreator.pigbasemod.block.DanchiSlabBlock;
import net.mcreator.pigbasemod.block.DanchiBlockBlock;
import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PigBasemodMod.MODID);
	public static final RegistryObject<Block> INFECTED_BLOCK = REGISTRY.register("infected_block", () -> new InfectedBlockBlock());
	public static final RegistryObject<Block> INFECTEDFOUNTAIN = REGISTRY.register("infectedfountain", () -> new InfectedfountainBlock());
	public static final RegistryObject<Block> INFECTOR = REGISTRY.register("infector", () -> new InfectorBlock());
	public static final RegistryObject<Block> DANCHI_BLOCK = REGISTRY.register("danchi_block", () -> new DanchiBlockBlock());
	public static final RegistryObject<Block> DANCHI_STAIRS = REGISTRY.register("danchi_stairs", () -> new DanchiStairsBlock());
	public static final RegistryObject<Block> DANCHI_SLAB = REGISTRY.register("danchi_slab", () -> new DanchiSlabBlock());
	public static final RegistryObject<Block> DANCHI_WALL = REGISTRY.register("danchi_wall", () -> new DanchiWallBlock());
	public static final RegistryObject<Block> INFECTION_CORE = REGISTRY.register("infection_core", () -> new InfectionCoreBlock());
	public static final RegistryObject<Block> INFECTED_LEAVES = REGISTRY.register("infected_leaves", () -> new InfectedLeavesBlock());
	public static final RegistryObject<Block> INFECTED_LOG = REGISTRY.register("infected_log", () -> new InfectedLogBlock());
	public static final RegistryObject<Block> INFECTED_GRASS = REGISTRY.register("infected_grass", () -> new InfectedGrassBlock());
	public static final RegistryObject<Block> FOSSIL_ORE = REGISTRY.register("fossil_ore", () -> new FossilOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
