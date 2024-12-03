package com.funguyman10.expandedequipment;

import com.funguyman10.expandedequipment.block.ModBlocks;
import com.funguyman10.expandedequipment.custom.ModItemGroups;
import com.funguyman10.expandedequipment.item.ModItems;
import com.funguyman10.expandedequipment.util.ModLootTableModifiers;
import com.funguyman10.expandedequipment.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpandedEquipment implements ModInitializer {
	public static final String MOD_ID = "expandedequipment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();
	}
}