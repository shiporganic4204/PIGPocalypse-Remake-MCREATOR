package net.mcreator.pigbasemod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.item.Rifle2Item;

public class Rifle2ItemModel extends GeoModel<Rifle2Item> {
	@Override
	public ResourceLocation getAnimationResource(Rifle2Item animatable) {
		return new ResourceLocation("pig_basemod", "animations/pulyala.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Rifle2Item animatable) {
		return new ResourceLocation("pig_basemod", "geo/pulyala.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Rifle2Item animatable) {
		return new ResourceLocation("pig_basemod", "textures/item/textura.png");
	}
}
