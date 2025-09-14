
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pigbasemod.item.GreenPorkchopItem;
import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PigBasemodMod.MODID);
	public static final RegistryObject<Item> GREEN_PORKCHOP = REGISTRY.register("green_porkchop", () -> new GreenPorkchopItem());
	public static final RegistryObject<Item> MINION_SPAWN_EGG = REGISTRY.register("minion_spawn_egg", () -> new ForgeSpawnEggItem(PigBasemodModEntities.MINION, -13408768, -10066432, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
