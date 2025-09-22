package net.mcreator.pigbasemod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.item.SwordSharpItem;

public class SwordSharpItemModel extends GeoModel<SwordSharpItem> {
	@Override
	public ResourceLocation getAnimationResource(SwordSharpItem animatable) {
		return new ResourceLocation("pig_basemod", "animations/swordcool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SwordSharpItem animatable) {
		return new ResourceLocation("pig_basemod", "geo/swordcool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SwordSharpItem animatable) {
		return new ResourceLocation("pig_basemod", "textures/item/swordtexture1.png");
	}
}
