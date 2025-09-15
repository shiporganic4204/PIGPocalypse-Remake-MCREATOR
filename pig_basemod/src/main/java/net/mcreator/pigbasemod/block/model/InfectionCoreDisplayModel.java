package net.mcreator.pigbasemod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.block.display.InfectionCoreDisplayItem;

public class InfectionCoreDisplayModel extends GeoModel<InfectionCoreDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InfectionCoreDisplayItem animatable) {
		return new ResourceLocation("pig_basemod", "animations/core.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfectionCoreDisplayItem animatable) {
		return new ResourceLocation("pig_basemod", "geo/core.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfectionCoreDisplayItem entity) {
		return new ResourceLocation("pig_basemod", "textures/block/eblan2.png");
	}
}
