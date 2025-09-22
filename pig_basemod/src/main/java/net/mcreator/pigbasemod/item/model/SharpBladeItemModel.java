package net.mcreator.pigbasemod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.item.SharpBladeItem;

public class SharpBladeItemModel extends GeoModel<SharpBladeItem> {
	@Override
	public ResourceLocation getAnimationResource(SharpBladeItem animatable) {
		return new ResourceLocation("pig_basemod", "animations/bladecool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SharpBladeItem animatable) {
		return new ResourceLocation("pig_basemod", "geo/bladecool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SharpBladeItem animatable) {
		return new ResourceLocation("pig_basemod", "textures/item/swordtexture1.png");
	}
}
