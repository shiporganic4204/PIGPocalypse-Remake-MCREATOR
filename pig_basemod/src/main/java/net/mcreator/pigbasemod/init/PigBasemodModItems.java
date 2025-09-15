
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pigbasemod.item.IndusiumItem;
import net.mcreator.pigbasemod.item.GreenPorkchopItem;
import net.mcreator.pigbasemod.block.display.InfectionCoreDisplayItem;
import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PigBasemodMod.MODID);
	public static final RegistryObject<Item> GREEN_PORKCHOP = REGISTRY.register("green_porkchop", () -> new GreenPorkchopItem());
	public static final RegistryObject<Item> MINION_SPAWN_EGG = REGISTRY.register("minion_spawn_egg", () -> new ForgeSpawnEggItem(PigBasemodModEntities.MINION, -13408768, -10066432, new Item.Properties()));
	public static final RegistryObject<Item> INDUSIUM = REGISTRY.register("indusium", () -> new IndusiumItem());
	public static final RegistryObject<Item> INFECTED_BLOCK = block(PigBasemodModBlocks.INFECTED_BLOCK);
	public static final RegistryObject<Item> INFECTEDFOUNTAIN = block(PigBasemodModBlocks.INFECTEDFOUNTAIN);
	public static final RegistryObject<Item> INFECTOR = block(PigBasemodModBlocks.INFECTOR);
	public static final RegistryObject<Item> DANCHI_BLOCK = block(PigBasemodModBlocks.DANCHI_BLOCK);
	public static final RegistryObject<Item> DANCHI_STAIRS = block(PigBasemodModBlocks.DANCHI_STAIRS);
	public static final RegistryObject<Item> DANCHI_SLAB = block(PigBasemodModBlocks.DANCHI_SLAB);
	public static final RegistryObject<Item> DANCHI_WALL = block(PigBasemodModBlocks.DANCHI_WALL);
	public static final RegistryObject<Item> INFECTION_CORE = REGISTRY.register(PigBasemodModBlocks.INFECTION_CORE.getId().getPath(), () -> new InfectionCoreDisplayItem(PigBasemodModBlocks.INFECTION_CORE.get(), new Item.Properties()));
	public static final RegistryObject<Item> INFECTED_LEAVES = block(PigBasemodModBlocks.INFECTED_LEAVES);
	public static final RegistryObject<Item> INFECTED_LOG = block(PigBasemodModBlocks.INFECTED_LOG);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
