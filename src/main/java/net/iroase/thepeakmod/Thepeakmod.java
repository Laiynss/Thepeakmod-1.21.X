package net.iroase.thepeakmod;

import net.fabricmc.api.ModInitializer;

import net.iroase.thepeakmod.block.ModBlocks;
import net.iroase.thepeakmod.item.ModItemGroups;
import net.iroase.thepeakmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thepeakmod implements ModInitializer {
	public static final String MOD_ID = "thepeakmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registeredModBlocks();
	}
}