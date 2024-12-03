package com.funguyman10.expandedequipment.block;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHORUNUM_BLOCK = registerBlock("chorundum_block",
            new Block(AbstractBlock.Settings.create().strength(8f).requiresTool()));

    public static final Block RAW_CHORUNUM_BLOCK = registerBlock("raw_chorundum_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block END_CHORUNUM_ORE = registerBlock("end_chorundum_ore",
            new Block(AbstractBlock.Settings.create().strength(8f, 200f).requiresTool()));

    public static final Block ENERGETIC_DEEPSLATE_ORE = registerBlock("energetic_deepslate_ore",
            new Block(AbstractBlock.Settings.create().strength(8f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ExpandedEquipment.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ExpandedEquipment.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ExpandedEquipment.LOGGER.info("Registering Mod Blocks for " +ExpandedEquipment.MOD_ID);
    }
}
