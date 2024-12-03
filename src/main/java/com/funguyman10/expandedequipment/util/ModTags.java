package com.funguyman10.expandedequipment.util;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_CHORUNDUM_TOOL = createTag("needs_chorundum_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHORUNDUM_TOOL = createTag("incorrect_for_chorundum_tool");

        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExpandedEquipment.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ExpandedEquipment.MOD_ID));
        }
    }
}
