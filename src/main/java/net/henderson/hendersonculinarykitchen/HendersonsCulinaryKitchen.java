package net.henderson.hendersonculinarykitchen;

import net.fabricmc.api.ModInitializer;

import net.henderson.hendersonculinarykitchen.item.ModItemGroups;
import net.henderson.hendersonculinarykitchen.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HendersonsCulinaryKitchen implements ModInitializer {
	public static final String MOD_ID = "hendersonculinarykitchen";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}