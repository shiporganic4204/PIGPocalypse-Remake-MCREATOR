package net.mcreator.pigbasemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.pigbasemod.init.PigBasemodModMobEffects;
import net.mcreator.pigbasemod.init.PigBasemodModEntities;
import net.mcreator.pigbasemod.PigBasemodMod;

import java.util.List;
import java.util.Comparator;

public class GreenInfectionOnEffectTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("TTNS", (entity.getPersistentData().getDouble("TTNS") - 1));
		if (entity.getPersistentData().getDouble("GreenInfectionStage") == 1) {
			if (5 == Mth.nextInt(RandomSource.create(), 1, 500)) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 15, 0, 0, 0, 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pig_basemod:minionambient")), SoundSource.MASTER, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("pig_basemod:minionambient")), SoundSource.MASTER, 1, 1, false);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(PigBasemodModMobEffects.GREEN_INFECTION.get()))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(PigBasemodModMobEffects.GREEN_INFECTION.get(), 99999999, 1, false, false));
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("GreenInfectionStage") == 2) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALLING_ANVIL)), 1000);
			PigBasemodMod.queueServerWork(5, () -> {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALLING_ANVIL)), 1000);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = PigBasemodModEntities.MINION.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			});
		}
		if (entity.getPersistentData().getDouble("TTNS") <= 1) {
			entity.getPersistentData().putDouble("TTNS", (Mth.nextInt(RandomSource.create(), 2400, 6000)));
			entity.getPersistentData().putDouble("GreenInfectionStage", (entity.getPersistentData().getDouble("GreenInfectionStage") + 1));
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("TTNS: " + entity.getPersistentData().getDouble("TTNS"))), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("GreenInfectionStage: " + entity.getPersistentData().getDouble("GreenInfectionStage"))), false);
	}
}
