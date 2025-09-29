package net.mcreator.pigbasemod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.item.Rifle1Item;

public class Rifle1ItemModel extends GeoModel<Rifle1Item> {
	@Override
	public ResourceLocation getAnimationResource(Rifle1Item animatable) {
		return new ResourceLocation("pig_basemod", "animations/vgolovu.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Rifle1Item animatable) {
		return new ResourceLocation("pig_basemod", "geo/vgolovu.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Rifle1Item animatable) {
		return new ResourceLocation("pig_basemod", "textures/item/texturesdafagggs.png");
	}
}
