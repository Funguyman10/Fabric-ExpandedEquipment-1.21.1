package com.funguyman10.expandedequipment.datagen;

import com.funguyman10.expandedequipment.block.ModBlocks;
import com.funguyman10.expandedequipment.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHORUNUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_CHORUNUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_CHORUNUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENERGETIC_DEEPSLATE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.CHORUNDUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CHORUNDUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENERGETIC_ROCK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUNDUM_UPGRADE_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CHORUNDUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUNDUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUNDUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUNDUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUNDUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUNDUM_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHORUNDUM_SPEAR, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SPEAR, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WOODEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_PAXEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WOODEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SPEAR, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHORUNDUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHORUNDUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHORUNDUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHORUNDUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_BOOTS));

    }
}
