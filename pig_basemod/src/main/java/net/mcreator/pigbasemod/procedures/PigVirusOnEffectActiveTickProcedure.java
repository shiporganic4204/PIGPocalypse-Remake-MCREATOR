package net.mcreator.pigbasemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.pigbasemod.PigBasemodMod;

public class PigVirusOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("TTNS", (entity.getPersistentData().getDouble("TTNS") - 1));
		if (entity.getPersistentData().getDouble("PigVirusStage") == 2) {
			if (5 == Mth.nextInt(RandomSource.create(), 1, 500)) {
				if (world instanceof Level _level) {
					if (_level.isClientSide()) {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pig_basemod:minionambient")), SoundSource.MASTER, 1, 1, false);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("PigVirusStage") == 3) {
			if (5 == Mth.nextInt(RandomSource.create(), 1, 100)) {
				if (world instanceof Level _level) {
					if (_level.isClientSide()) {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pig_basemod:minionambient")), SoundSource.MASTER, 1, 1, false);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("PigVirusStage") == 4) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALLING_ANVIL)), 1000);
			PigBasemodMod.queueServerWork(5, () -> {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALLING_ANVIL)), 1000);
			});
		}
		if (entity.getPersistentData().getDouble("TTNS") <= 1) {
			entity.getPersistentData().putDouble("TTNS", (Mth.nextInt(RandomSource.create(), 2400, 6000)));
			entity.getPersistentData().putDouble("PigVirusStage", (entity.getPersistentData().getDouble("PigVirusStage") + 1));
		}
	}
}
