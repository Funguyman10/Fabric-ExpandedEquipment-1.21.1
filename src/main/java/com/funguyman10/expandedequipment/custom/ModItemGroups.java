package com.funguyman10.expandedequipment.custom;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import com.funguyman10.expandedequipment.block.ModBlocks;
import com.funguyman10.expandedequipment.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup EXPANDED_EQUIPMENT_ITEMS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExpandedEquipment.MOD_ID, "expanded_equipment_items_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHORUNDUM))
                    .displayName(Text.translatable("itemgroup.expandedequipment.expanded_equipment_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.CHORUNDUM);
                      entries.add(ModItems.RAW_CHORUNDUM);
                      entries.add(ModItems.ENERGETIC_ROCK);
                      entries.add(ModItems.CHORUNDUM_UPGRADE_TEMPLATE);
                    }).build());

    public static final ItemGroup EXPANDED_EQUIPMENT_BLOCKS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExpandedEquipment.MOD_ID, "expanded_equipment_blocks_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHORUNUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.expandedequipment.expanded_equipment_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.CHORUNUM_BLOCK);
                      entries.add(ModBlocks.RAW_CHORUNUM_BLOCK);
                      entries.add(ModBlocks.END_CHORUNUM_ORE);
                      entries.add(ModBlocks.ENERGETIC_DEEPSLATE_ORE);
                    }).build());

    public static final ItemGroup EXPANDED_EQUIPMENT_TOOLS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExpandedEquipment.MOD_ID, "expanded_equipment_tools_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHORUNDUM_PAXEL))
                    .displayName(Text.translatable("itemgroup.expandedequipment.expanded_equipment_tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_PAXEL);
                        entries.add(ModItems.STONE_PAXEL);
                        entries.add(ModItems.GOLDEN_PAXEL);
                        entries.add(ModItems.IRON_PAXEL);
                        entries.add(ModItems.DIAMOND_PAXEL);
                        entries.add(ModItems.NETHERITE_PAXEL);

                        entries.add(ModItems.CHORUNDUM_SWORD);
                        entries.add(ModItems.CHORUNDUM_PICKAXE);
                        entries.add(ModItems.CHORUNDUM_AXE);
                        entries.add(ModItems.CHORUNDUM_SHOVEL);
                        entries.add(ModItems.CHORUNDUM_HOE);
                        entries.add(ModItems.CHORUNDUM_PAXEL);

                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_PAXEL);
                    }).build());

    public static final ItemGroup EXPANDED_EQUIPMENT_ARMOR_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExpandedEquipment.MOD_ID, "expanded_equipment_armor_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHORUNDUM_HELMET))
                    .displayName(Text.translatable("itemgroup.expandedequipment.expanded_equipment_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHORUNDUM_HELMET);
                        entries.add(ModItems.CHORUNDUM_CHESTPLATE);
                        entries.add(ModItems.CHORUNDUM_LEGGINGS);
                        entries.add(ModItems.CHORUNDUM_BOOTS);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                    }).build());

    public static void registerItemGroups() {
        ExpandedEquipment.LOGGER.info("Registering Item Groups for " + ExpandedEquipment.MOD_ID);
    }
}
