package net.henderson.hendersonculinarykitchen.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.henderson.hendersonculinarykitchen.HendersonsCulinaryKitchen;
import net.henderson.hendersonculinarykitchen.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CHEEZIT = registerItem("cheez_it",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEEZIT)));

    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));

    public static final Item SALT = registerItem("salt",
            new Item(new FabricItemSettings().food(ModFoodComponents.SALT)));

    public static final Item VINEGAR = registerItem("vinegar",
            new Item(new FabricItemSettings().food(ModFoodComponents.VINEGAR)));

    public static final Item FLOUR = registerItem("flour",
            new Item(new FabricItemSettings().food(ModFoodComponents.FLOUR)));

    public static final Item BREAD_DOUGH = registerItem("bread_dough",
            new Item(new FabricItemSettings().food(ModFoodComponents.BREAD_DOUGH)));

    public static final Item BUTTER = registerItem("butter",
            new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER)));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item CLEAVER_KNIFE = registerItem("cleaver_knife",
            new SwordItem(ModToolMaterial.CLEAVER_KNIFE, 2, 2f, new FabricItemSettings()));

    public static final Item SPATULA = registerItem("spatula",
            new SwordItem(ModToolMaterial.SPATULA, 2, 2f, new FabricItemSettings()));

    public static final Item GRINDER = registerItem("grinder",
            new SwordItem(ModToolMaterial.GRINDER, 2, 2f, new FabricItemSettings()));

    private static void addItemsToSearchItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHEEZIT);
        entries.add(CHEESE);
        entries.add(SALT);
        entries.add(VINEGAR);
        entries.add(FLOUR);
        entries.add(BREAD_DOUGH);
        entries.add(BUTTER);
        entries.add(TOMATO);
        entries.add(TOMATO_SEEDS);
        entries.add(CLEAVER_KNIFE);
        entries.add(SPATULA);
        entries.add(GRINDER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HendersonsCulinaryKitchen.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HendersonsCulinaryKitchen.LOGGER.info("Registering Mod Items for " + HendersonsCulinaryKitchen.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(ModItems::addItemsToSearchItemGroup);
    }
}
