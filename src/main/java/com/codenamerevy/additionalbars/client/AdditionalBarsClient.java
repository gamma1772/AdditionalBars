package com.codenamerevy.additionalbars.client;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class AdditionalBarsClient
{
    public AdditionalBarsClient()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        AdditionalBars.LOGGER.debug("[ADDITIONAL BARS] Doing client stuff...");
        //Vanilla
        RenderTypeLookup.setRenderLayer(ABBlocks.TEST.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ABBlocks.GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.WARPED_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_IRON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.CROSSED_WARPED_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_IRON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_WARPED_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_IRON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_WARPED_BARS.get(), RenderType.getCutout());
    }
}
