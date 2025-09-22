
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PigBasemodMod.MODID);
	public static final RegistryObject<SoundEvent> MINIONAMBIENT = REGISTRY.register("minionambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pig_basemod", "minionambient")));
	public static final RegistryObject<SoundEvent> MINIONDIE = REGISTRY.register("miniondie", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pig_basemod", "miniondie")));
	public static final RegistryObject<SoundEvent> MINIONHURT = REGISTRY.register("minionhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pig_basemod", "minionhurt")));
	public static final RegistryObject<SoundEvent> BZDIN = REGISTRY.register("bzdin", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("pig_basemod", "bzdin")));
}
