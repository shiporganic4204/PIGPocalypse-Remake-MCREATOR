package net.mcreator.pigbasemod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.item.SwordBaseItem;

public class SwordBaseItemModel extends GeoModel<SwordBaseItem> {
	@Override
	public ResourceLocation getAnimationResource(SwordBaseItem animatable) {
		return new ResourceLocation("pig_basemod", "animations/swordbase.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SwordBaseItem animatable) {
		return new ResourceLocation("pig_basemod", "geo/swordbase.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SwordBaseItem animatable) {
		return new ResourceLocation("pig_basemod", "textures/item/swordtexture1.png");
	}
}
