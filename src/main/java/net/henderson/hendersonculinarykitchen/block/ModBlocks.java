package net.henderson.hendersonculinarykitchen.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.henderson.hendersonculinarykitchen.HendersonsCulinaryKitchen;
import net.henderson.hendersonculinarykitchen.block.custom.TomatoCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(HendersonsCulinaryKitchen.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));




    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HendersonsCulinaryKitchen.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(HendersonsCulinaryKitchen.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        HendersonsCulinaryKitchen.LOGGER.info("Registering ModBlocks for " + HendersonsCulinaryKitchen.MOD_ID);
    }
}
