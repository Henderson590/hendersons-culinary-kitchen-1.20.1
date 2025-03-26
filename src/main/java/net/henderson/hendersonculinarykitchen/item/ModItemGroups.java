package net.henderson.hendersonculinarykitchen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.henderson.hendersonculinarykitchen.HendersonsCulinaryKitchen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HATS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HendersonsCulinaryKitchen.MOD_ID, "spatula"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spatula")).icon(() -> new ItemStack(ModItems.SPATULA)).entries((displayContext, entries) -> {
                entries.add(ModItems.CHEEZIT);
                entries.add(ModItems.CHEESE);
                entries.add(ModItems.SALT);
                entries.add(ModItems.VINEGAR);
                entries.add(ModItems.FLOUR);
                entries.add(ModItems.BREAD_DOUGH);
                entries.add(ModItems.BUTTER);
                entries.add(ModItems.TOMATO);
                entries.add(ModItems.TOMATO_SEEDS);
                entries.add(ModItems.CLEAVER_KNIFE);
                entries.add(ModItems.SPATULA);
                entries.add(ModItems.GRINDER);



            }).build());

    public static void registerItemGroups() {
        HendersonsCulinaryKitchen.LOGGER.info("Registering Item Groups for " + HendersonsCulinaryKitchen.MOD_ID);
    }
}
