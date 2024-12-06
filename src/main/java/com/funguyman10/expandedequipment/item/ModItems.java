package com.funguyman10.expandedequipment.item;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import com.funguyman10.expandedequipment.custom.*;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHORUNDUM = registerItem("chorundum", new Item(new Item.Settings()));
    public static final Item RAW_CHORUNDUM = registerItem("raw_chorundum", new Item(new Item.Settings()));
    public static final Item ENERGETIC_ROCK = registerItem("energetic_rock", new Item(new Item.Settings()));

    public static final Item CHORUNDUM_UPGRADE_TEMPLATE = registerItem("chorundum_upgrade_template", CustomSmithingTemplateItem.createChorundumUpgradeTemplate());

    public static final Item WOODEN_SPEAR = registerItem("wooden_spear", new SpearItem(ToolMaterials.WOOD,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.WOOD, 2, -2.1f, 1))));
    public static final Item STONE_SPEAR = registerItem("stone_spear", new SpearItem(ToolMaterials.STONE,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.STONE, 2, -2.1f, 1))));
    public static final Item GOLDEN_SPEAR = registerItem("golden_spear", new SpearItem(ToolMaterials.GOLD,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.GOLD, 2, -2.1f, 1))));
    public static final Item IRON_SPEAR = registerItem("iron_spear", new SpearItem(ToolMaterials.IRON,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.IRON, 2, -2.1f, 1))));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear", new SpearItem(ToolMaterials.DIAMOND,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.DIAMOND, 2, -2.1f, 1))));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear", new SpearItem(ToolMaterials.NETHERITE,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ToolMaterials.NETHERITE, 2, -2.1f, 1))));

    public static final Item WOODEN_PAXEL = registerItem("wooden_paxel", new PaxelItem(ToolMaterials.WOOD, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.WOOD, 3, -3.0f))));
    public static final Item STONE_PAXEL = registerItem("stone_paxel", new PaxelItem(ToolMaterials.STONE, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.STONE, 3, -3.0f))));
    public static final Item GOLDEN_PAXEL = registerItem("golden_paxel", new PaxelItem(ToolMaterials.GOLD, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.GOLD, 3, -3.0f))));
    public static final Item IRON_PAXEL = registerItem("iron_paxel", new PaxelItem(ToolMaterials.IRON, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.IRON, 3, -3.0f))));
    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel", new PaxelItem(ToolMaterials.DIAMOND, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -3.0f))));
    public static final Item NETHERITE_PAXEL = registerItem("netherite_paxel", new PaxelItem(ToolMaterials.NETHERITE, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -3.0f))));

    public static final Item CHORUNDUM_SWORD = registerItem("chorundum_sword", new SwordItem(ModToolMaterials.CHORUNDUM, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, 3, -2.4f))));
    public static final Item CHORUNDUM_PICKAXE = registerItem("chorundum_pickaxe", new PickaxeItem(ModToolMaterials.CHORUNDUM, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, 1, -2.8f))));
    public static final Item CHORUNDUM_AXE = registerItem("chorundum_axe", new AxeItem(ModToolMaterials.CHORUNDUM, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, 5, -3.0f))));
    public static final Item CHORUNDUM_SHOVEL = registerItem("chorundum_shovel", new ShovelItem(ModToolMaterials.CHORUNDUM, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, 0.5f, 0f))));
    public static final Item CHORUNDUM_HOE = registerItem("chorundum_hoe", new HoeItem(ModToolMaterials.CHORUNDUM, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, -5, 0))));
    public static final Item CHORUNDUM_PAXEL = registerItem("chorundum_paxel", new PaxelItem(ModToolMaterials.CHORUNDUM, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, 3, -3.0f))));
    public static final Item CHORUNDUM_SPEAR = registerItem("chorundum_spear", new SpearItem(ModToolMaterials.CHORUNDUM,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ModToolMaterials.CHORUNDUM, 2, -2.1f, 1))));

    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.4f))));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 1, -2.8f))));
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 5, -3.0f))));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER, 0.5f, 0f))));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER, -2, 0))));
    public static final Item COPPER_PAXEL = registerItem("copper_paxel", new PaxelItem(ModToolMaterials.COPPER, new Item.Settings()
            .attributeModifiers(PaxelItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -3.0f))));
    public static final Item COPPER_SPEAR = registerItem("copper_spear", new SpearItem(ModToolMaterials.COPPER,
            new Item.Settings().attributeModifiers(SpearItem.createAttributeModifiers(ModToolMaterials.COPPER, 2, -2.1f, 1))));

    public static final Item CHORUNDUM_HELMET = registerItem("chorundum_helmet", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item CHORUNDUM_CHESTPLATE = registerItem("chorundum_chestplate", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item CHORUNDUM_LEGGINGS = registerItem("chorundum_leggings", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item CHORUNDUM_BOOTS = registerItem("chorundum_boots", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterials.CHORUNDUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExpandedEquipment.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExpandedEquipment.LOGGER.info("Registering Mod Items for " + ExpandedEquipment.MOD_ID);
    }
}