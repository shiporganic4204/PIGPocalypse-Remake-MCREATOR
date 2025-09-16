package net.mcreator.pigbasemod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.entity.TriplaneEntity;

public class TriplaneModel extends GeoModel<TriplaneEntity> {
	@Override
	public ResourceLocation getAnimationResource(TriplaneEntity entity) {
		return new ResourceLocation("pig_basemod", "animations/triplane.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TriplaneEntity entity) {
		return new ResourceLocation("pig_basemod", "geo/triplane.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TriplaneEntity entity) {
		return new ResourceLocation("pig_basemod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
