package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class Rifle1ItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) > 15) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 3));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 40, 3));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) > 8) {
			if (entity.getDeltaMovement().y() > 0) {
			} else if (entity.getDeltaMovement().y() < 0) {
				if (!(entity.fallDistance > 1)) {
					Vec3 motion = entity.getDeltaMovement().scale(0.8);
					entity.setDeltaMovement(motion);
				}
			} else {
				Vec3 motion = entity.getDeltaMovement().scale(0.4);
				entity.setDeltaMovement(motion);
			}
		} else {
		}
	}
}
