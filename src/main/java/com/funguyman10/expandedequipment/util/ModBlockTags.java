package com.funguyman10.expandedequipment.util;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final TagKey<Block> MINEABLE_WITH_PAXEL = create("mineable/paxel");

    public static TagKey<Block> create(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExpandedEquipment.MOD_ID, name));
    }
}
