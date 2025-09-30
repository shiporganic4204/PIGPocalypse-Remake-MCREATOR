package net.mcreator.pigbasemod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.item.BhelmetItem;

public class BhelmetModel extends GeoModel<BhelmetItem> {
	@Override
	public ResourceLocation getAnimationResource(BhelmetItem object) {
		return new ResourceLocation("pig_basemod", "animations/bhelm1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BhelmetItem object) {
		return new ResourceLocation("pig_basemod", "geo/bhelm1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BhelmetItem object) {
		return new ResourceLocation("pig_basemod", "textures/item/helm1.png");
	}
}
