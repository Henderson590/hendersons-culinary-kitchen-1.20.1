package net.henderson.hendersonculinarykitchen;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.henderson.hendersonculinarykitchen.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class HendersonsCulinaryKitchenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());

    }
}
