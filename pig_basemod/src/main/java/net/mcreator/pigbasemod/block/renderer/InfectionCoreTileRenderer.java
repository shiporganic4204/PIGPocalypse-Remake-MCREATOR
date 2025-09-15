package net.mcreator.pigbasemod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pigbasemod.block.model.InfectionCoreBlockModel;
import net.mcreator.pigbasemod.block.entity.InfectionCoreTileEntity;

public class InfectionCoreTileRenderer extends GeoBlockRenderer<InfectionCoreTileEntity> {
	public InfectionCoreTileRenderer() {
		super(new InfectionCoreBlockModel());
	}

	@Override
	public RenderType getRenderType(InfectionCoreTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
