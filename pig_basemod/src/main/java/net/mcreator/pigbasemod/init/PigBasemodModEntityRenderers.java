
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigbasemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.pigbasemod.client.renderer.MinionRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PigBasemodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PigBasemodModEntities.MINION.get(), MinionRenderer::new);
		event.registerEntityRenderer(PigBasemodModEntities.SPORE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PigBasemodModEntities.SPORE_2.get(), ThrownItemRenderer::new);
	}
}
