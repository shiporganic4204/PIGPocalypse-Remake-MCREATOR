
package net.mcreator.pigbasemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CircuitItem extends Item {
	public CircuitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
