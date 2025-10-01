package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.pigbasemod.init.PigBasemodModEntities;
import net.mcreator.pigbasemod.entity.Spore2Entity;

public class InfectionCoreOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
					AbstractArrow entityToSpawn = new Spore2Entity(PigBasemodModEntities.SPORE_2.get(), level);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.setPierceLevel(piercing);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, 10, 0, (byte) 1);
			_entityToSpawn.setPos(x, y, z);
			_entityToSpawn.shoot(0, 1, 0, 1, 45);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
