package com.funguyman10.expandedequipment.custom;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class CustomSmithingTemplateItem extends Item {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;

    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;

    private static final Text INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.of(ExpandedEquipment.MOD_ID, "smithing_template.ingredients")))
            .formatted(TITLE_FORMATTING);

    private static final Text APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.of(ExpandedEquipment.MOD_ID, "smithing_template.applies_to")))
            .formatted(TITLE_FORMATTING);

    private static final Text CHORUNDUM_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.of(ExpandedEquipment.MOD_ID, "chorundum_upgrade")))
            .formatted(TITLE_FORMATTING);

    private static final Text CHORUNDUM_UPGRADE_APPLIES_TO_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.of(ExpandedEquipment.MOD_ID, "smithing_template.chorundum_upgrade.applies_to"))
            )
            .formatted(DESCRIPTION_FORMATTING);

    private static final Text CHORUNDUM_UPGRADE_INGREDIENTS_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.of(ExpandedEquipment.MOD_ID, "smithing_template.chorundum_upgrade.ingredients"))
            )
            .formatted(DESCRIPTION_FORMATTING);

    private static final Text CHORUNDUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.of(ExpandedEquipment.MOD_ID, "smithing_template.chorundum_upgrade.base_slot_description"))
    );

    private static final Text CHORUNDUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.of(ExpandedEquipment.MOD_ID, "smithing_template.chorundum_upgrade.additions_slot_description"))
    );

    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.ofVanilla("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.ofVanilla("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.ofVanilla("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = Identifier.ofVanilla("item/empty_slot_ingot");

    private final Text appliesToText;
    private final Text ingredientsText;
    private final Text titleText;
    private final Text baseSlotDescriptionText;
    private final Text additionsSlotDescriptionText;
    private final List<Identifier> emptyBaseSlotTextures;
    private final List<Identifier> emptyAdditionsSlotTextures;

    public CustomSmithingTemplateItem(
            Text appliesToText,
            Text ingredientsText,
            Text titleText,
            Text baseSlotDescriptionText,
            Text additionsSlotDescriptionText,
            List<Identifier> emptyBaseSlotTextures,
            List<Identifier> emptyAdditionsSlotTextures,
            FeatureFlag... requiredFeatures
    ) {
        super(new Item.Settings().requires(requiredFeatures));
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.titleText = titleText;
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    private static List<Identifier> getChorundumUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_SLOT_SWORD_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_SLOT_PICKAXE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_SLOT_AXE_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE,
                EMPTY_SLOT_HOE_TEXTURE,
                EMPTY_SLOT_SHOVEL_TEXTURE
        );
    }

    public static CustomSmithingTemplateItem createChorundumUpgradeTemplate() {
        return new CustomSmithingTemplateItem(
                CHORUNDUM_UPGRADE_APPLIES_TO_TEXT,
                CHORUNDUM_UPGRADE_INGREDIENTS_TEXT,
                CHORUNDUM_UPGRADE_TEXT,
                CHORUNDUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                CHORUNDUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getChorundumUpgradeEmptyBaseSlotTextures(),
                getChorundumUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getChorundumUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(this.titleText);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(APPLIES_TO_TEXT);
        tooltip.add(ScreenTexts.space().append(this.appliesToText));
        tooltip.add(INGREDIENTS_TEXT);
        tooltip.add(ScreenTexts.space().append(this.ingredientsText));
    }

    public Text getBaseSlotDescription() {
        return this.baseSlotDescriptionText;
    }

    public Text getAdditionsSlotDescription() {
        return this.additionsSlotDescriptionText;
    }

    public List<Identifier> getEmptyBaseSlotTextures() {
        return this.emptyBaseSlotTextures;
    }

    public List<Identifier> getEmptyAdditionsSlotTextures() {
        return this.emptyAdditionsSlotTextures;
    }
}