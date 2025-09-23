
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.pigbasemod.potion.PigVirusMobEffect;
import net.mcreator.pigbasemod.potion.GreenInfectionMobEffect;
import net.mcreator.pigbasemod.PigBasemodMod;

public class PigBasemodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PigBasemodMod.MODID);
	public static final RegistryObject<MobEffect> PIG_VIRUS = REGISTRY.register("pig_virus", () -> new PigVirusMobEffect());
	public static final RegistryObject<MobEffect> GREEN_INFECTION = REGISTRY.register("green_infection", () -> new GreenInfectionMobEffect());
}
