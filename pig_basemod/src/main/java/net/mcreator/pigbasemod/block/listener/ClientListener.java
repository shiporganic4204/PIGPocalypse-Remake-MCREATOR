package net.mcreator.pigbasemod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pigbasemod.init.PigBasemodModBlockEntities;
import net.mcreator.pigbasemod.block.renderer.InfectionCoreTileRenderer;
import net.mcreator.pigbasemod.PigBasemodMod;

@Mod.EventBusSubscriber(modid = PigBasemodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(PigBasemodModBlockEntities.INFECTION_CORE.get(), context -> new InfectionCoreTileRenderer());
	}
}
