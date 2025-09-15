package net.mcreator.pigbasemod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pigbasemod.block.entity.InfectionCoreTileEntity;

public class InfectionCoreBlockModel extends GeoModel<InfectionCoreTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfectionCoreTileEntity animatable) {
		return new ResourceLocation("pig_basemod", "animations/core.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfectionCoreTileEntity animatable) {
		return new ResourceLocation("pig_basemod", "geo/core.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfectionCoreTileEntity animatable) {
		return new ResourceLocation("pig_basemod", "textures/block/eblan2.png");
	}
}
