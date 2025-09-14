
package net.mcreator.pigbasemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.pigbasemod.entity.MinionEntity;

public class MinionRenderer extends MobRenderer<MinionEntity, PigModel<MinionEntity>> {
	public MinionRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel<MinionEntity>(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinionEntity entity) {
		return new ResourceLocation("pig_basemod:textures/entities/pigminion.png");
	}
}
