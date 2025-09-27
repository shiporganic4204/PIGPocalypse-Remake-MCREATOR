package net.mcreator.pigbasemod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class Rifle1EntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("accuracy", 5);
	}
}
