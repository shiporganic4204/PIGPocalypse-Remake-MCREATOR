package net.mcreator.pigbasemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.pigbasemod.init.PigBasemodModMobEffects;
import net.mcreator.pigbasemod.init.PigBasemodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PigVirusDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PigBasemodModMobEffects.PIG_VIRUS.get())) {
			if (entity.getPersistentData().getDouble("PigVirusStage") >= 1) {
				world.setBlock(BlockPos.containing(x, y, z), PigBasemodModBlocks.INFECTION_CORE.get().defaultBlockState(), 3);
			}
		}
	}
}
