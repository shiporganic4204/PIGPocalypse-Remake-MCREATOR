
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.pigbasemod.PigBasemodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PigBasemodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PigBasemodMod.MODID);
	public static final RegistryObject<CreativeModeTab> PIG_RESOURCES = REGISTRY.register("pig_resources",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pig_basemod.pig_resources")).icon(() -> new ItemStack(PigBasemodModItems.GREEN_PORKCHOP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PigBasemodModItems.GREEN_PORKCHOP.get());
				tabData.accept(PigBasemodModBlocks.FOSSIL_ORE.get().asItem());
				tabData.accept(PigBasemodModItems.FOSSIL.get());
				tabData.accept(PigBasemodModBlocks.PLATINUM_ORE.get().asItem());
				tabData.accept(PigBasemodModItems.PLATINUM.get());
				tabData.accept(PigBasemodModItems.CIRCUIT.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> PIGBLOCKS = REGISTRY.register("pigblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pig_basemod.pigblocks")).icon(() -> new ItemStack(PigBasemodModBlocks.INFECTED_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PigBasemodModBlocks.INFECTED_BLOCK.get().asItem());
				tabData.accept(PigBasemodModBlocks.INFECTEDFOUNTAIN.get().asItem());
				tabData.accept(PigBasemodModBlocks.INFECTOR.get().asItem());
				tabData.accept(PigBasemodModBlocks.DANCHI_BLOCK.get().asItem());
				tabData.accept(PigBasemodModBlocks.DANCHI_STAIRS.get().asItem());
				tabData.accept(PigBasemodModBlocks.DANCHI_SLAB.get().asItem());
				tabData.accept(PigBasemodModBlocks.DANCHI_WALL.get().asItem());
				tabData.accept(PigBasemodModBlocks.INFECTION_CORE.get().asItem());
				tabData.accept(PigBasemodModBlocks.INFECTED_LEAVES.get().asItem());
				tabData.accept(PigBasemodModBlocks.INFECTED_LOG.get().asItem());
				tabData.accept(PigBasemodModBlocks.INFECTED_GRASS.get().asItem());
			}).withTabsBefore(PIG_RESOURCES.getId()).build());
	public static final RegistryObject<CreativeModeTab> PIG_WARFARE = REGISTRY.register("pig_warfare",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pig_basemod.pig_warfare")).icon(() -> new ItemStack(PigBasemodModItems.SWORD_SHARP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PigBasemodModItems.SWORD_SHARP.get());
				tabData.accept(PigBasemodModItems.SWORD_BASE.get());
				tabData.accept(PigBasemodModItems.SHARP_BLADE.get());
				tabData.accept(PigBasemodModBlocks.ANTI_AIR_PROTOTYPE.get().asItem());
				tabData.accept(PigBasemodModItems.RIFLE.get());
				tabData.accept(PigBasemodModItems.RIFLEBOLT.get());
				tabData.accept(PigBasemodModItems.BHELMET_HELMET.get());
			}).withTabsBefore(PIGBLOCKS.getId()).build());
	public static final RegistryObject<CreativeModeTab> PIG_ITEMS = REGISTRY.register("pig_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pig_basemod.pig_items")).icon(() -> new ItemStack(Items.COOKED_PORKCHOP)).displayItems((parameters, tabData) -> {
				tabData.accept(PigBasemodModItems.SWORD_BASE.get());
				tabData.accept(PigBasemodModItems.SHARP_BLADE.get());
			}).withTabsBefore(PIG_WARFARE.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PigBasemodModItems.MINION_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PigBasemodModBlocks.INFECTED_GRASS.get().asItem());
		}
	}
}
