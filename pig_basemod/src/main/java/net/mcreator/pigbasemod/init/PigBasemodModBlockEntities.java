
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.pigbasemod.block.entity.InfectorBlockEntity;
import net.mcreator.pigbasemod.block.entity.InfectionCoreTileEntity;
import net.mcreator.pigbasemod.block.entity.InfectedfountainBlockEntity;
import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PigBasemodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> INFECTEDFOUNTAIN = register("infectedfountain", PigBasemodModBlocks.INFECTEDFOUNTAIN, InfectedfountainBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INFECTOR = register("infector", PigBasemodModBlocks.INFECTOR, InfectorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<InfectionCoreTileEntity>> INFECTION_CORE = REGISTRY.register("infection_core",
			() -> BlockEntityType.Builder.of(InfectionCoreTileEntity::new, PigBasemodModBlocks.INFECTION_CORE.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
