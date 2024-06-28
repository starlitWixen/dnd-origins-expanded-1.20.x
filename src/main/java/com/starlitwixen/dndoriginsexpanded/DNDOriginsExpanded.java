package com.starlitwixen.dndoriginsexpanded;

import com.starlitwixen.dndoriginsexpanded.item.ModItemGroups;
import com.starlitwixen.dndoriginsexpanded.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DNDOriginsExpanded implements ModInitializer {
	public static final String MOD_ID = "dndoriginsexpanded";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}