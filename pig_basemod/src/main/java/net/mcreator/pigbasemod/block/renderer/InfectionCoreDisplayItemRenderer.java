package net.mcreator.pigbasemod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pigbasemod.block.model.InfectionCoreDisplayModel;
import net.mcreator.pigbasemod.block.display.InfectionCoreDisplayItem;

public class InfectionCoreDisplayItemRenderer extends GeoItemRenderer<InfectionCoreDisplayItem> {
	public InfectionCoreDisplayItemRenderer() {
		super(new InfectionCoreDisplayModel());
	}

	@Override
	public RenderType getRenderType(InfectionCoreDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
