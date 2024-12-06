package com.funguyman10.expandedequipment.datagen;

import com.funguyman10.expandedequipment.block.ModBlocks;
import com.funguyman10.expandedequipment.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> CHORUNDUM_SMELTABLES = List.of(ModItems.RAW_CHORUNDUM, ModBlocks.END_CHORUNUM_ORE);
        List<ItemConvertible> ENERGETIC_SMELTABLES = List.of(ModBlocks.ENERGETIC_DEEPSLATE_ORE);

        offerSmelting(exporter, CHORUNDUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHORUNDUM, 0.5f, 200, "chorundum");
        offerBlasting(exporter, CHORUNDUM_SMELTABLES, RecipeCategory.MISC, ModItems.CHORUNDUM, 0.5f, 100, "chorundum");

        offerSmelting(exporter, ENERGETIC_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGETIC_ROCK, 0.1f, 200, "energetic_rock");
        offerBlasting(exporter, ENERGETIC_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGETIC_ROCK, 0.1f, 100, "energetic_rock");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHORUNDUM, RecipeCategory.MISC, ModBlocks.CHORUNUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_CHORUNDUM, RecipeCategory.MISC, ModBlocks.RAW_CHORUNUM_BLOCK);

        SmithingTransformRecipeJsonBuilder.create(
                Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_PICKAXE), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_PICKAXE)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_pickaxe_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_AXE), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_AXE)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_axe_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_SHOVEL), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_SHOVEL)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_shovel_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_SWORD), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_SWORD)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_sword_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_HOE), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_HOE)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_hoe_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(ModItems.NETHERITE_PAXEL), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_PAXEL)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_paxel_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(ModItems.DIAMOND_PAXEL), Ingredient.ofItems(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL)
                .criterion("has_netherite", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, "netherite_paxel_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_HELMET), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_HELMET)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_helmet_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_CHESTPLATE), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_CHESTPLATE)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_chestplate_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_LEGGINGS), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_LEGGINGS)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_leggings_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_BOOTS), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_BOOTS)
                .criterion("has_chorundum", conditionsFromItem(ModItems.CHORUNDUM))
                .offerTo(exporter, "chorundum_boots_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_PAXEL)
                .pattern("SAD")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', Items.WOODEN_PICKAXE)
                .input('S', Items.WOODEN_AXE)
                .input('D', Items.WOODEN_SHOVEL)
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.WOODEN_PICKAXE))
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.WOODEN_AXE))
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.WOODEN_SHOVEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_PAXEL)
                .pattern("SAD")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', Items.STONE_PICKAXE)
                .input('S', Items.STONE_AXE)
                .input('D', Items.STONE_SHOVEL)
                .criterion(hasItem(Items.STONE_PICKAXE), conditionsFromItem(Items.STONE_PICKAXE))
                .criterion(hasItem(Items.STONE_AXE), conditionsFromItem(Items.STONE_AXE))
                .criterion(hasItem(Items.STONE_SHOVEL), conditionsFromItem(Items.STONE_SHOVEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL)
                .pattern("SAD")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', Items.GOLDEN_PICKAXE)
                .input('S', Items.GOLDEN_AXE)
                .input('D', Items.GOLDEN_SHOVEL)
                .criterion(hasItem(Items.GOLDEN_PICKAXE), conditionsFromItem(Items.GOLDEN_PICKAXE))
                .criterion(hasItem(Items.GOLDEN_AXE), conditionsFromItem(Items.GOLDEN_AXE))
                .criterion(hasItem(Items.GOLDEN_SHOVEL), conditionsFromItem(Items.GOLDEN_SHOVEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PAXEL)
                .pattern("SAD")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', ModItems.COPPER_PICKAXE)
                .input('S', ModItems.COPPER_AXE)
                .input('D', ModItems.COPPER_SHOVEL)
                .criterion(hasItem(ModItems.COPPER_PICKAXE), conditionsFromItem(ModItems.COPPER_PICKAXE))
                .criterion(hasItem(ModItems.COPPER_AXE), conditionsFromItem(ModItems.COPPER_AXE))
                .criterion(hasItem(ModItems.COPPER_SHOVEL), conditionsFromItem(ModItems.COPPER_SHOVEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_PAXEL)
                .pattern("SAD")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', Items.IRON_PICKAXE)
                .input('S', Items.IRON_AXE)
                .input('D', Items.IRON_SHOVEL)
                .criterion(hasItem(Items.IRON_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                .criterion(hasItem(Items.IRON_AXE), conditionsFromItem(Items.IRON_AXE))
                .criterion(hasItem(Items.IRON_SHOVEL), conditionsFromItem(Items.IRON_SHOVEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL)
                .pattern("SAD")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', Items.DIAMOND_PICKAXE)
                .input('S', Items.DIAMOND_AXE)
                .input('D', Items.DIAMOND_SHOVEL)
                .criterion(hasItem(Items.DIAMOND_PICKAXE), conditionsFromItem(Items.DIAMOND_PICKAXE))
                .criterion(hasItem(Items.DIAMOND_AXE), conditionsFromItem(Items.DIAMOND_AXE))
                .criterion(hasItem(Items.DIAMOND_SHOVEL), conditionsFromItem(Items.DIAMOND_SHOVEL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("AAA")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern("AA")
                .pattern("AR")
                .pattern(" R")
                .input('R', Items.STICK)
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern("A")
                .pattern("R")
                .pattern("R")
                .input('R', Items.STICK)
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern("AA")
                .pattern(" R")
                .pattern(" R")
                .input('R', Items.STICK)
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SWORD)
                .pattern("A")
                .pattern("A")
                .pattern("R")
                .input('R', Items.STICK)
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_BOOTS)
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.TORCH)
                .pattern("S")
                .pattern("A")
                .input('S', ModItems.ENERGETIC_ROCK)
                .input('A', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.ENERGETIC_ROCK), conditionsFromItem(ModItems.ENERGETIC_ROCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHORUNDUM_UPGRADE_TEMPLATE, 2)
                .pattern("ADA")
                .pattern("ASA")
                .pattern("AAA")
                .input('A', Items.DIAMOND)
                .input('S', Items.END_STONE)
                .input('D', ModItems.CHORUNDUM_UPGRADE_TEMPLATE)
                .criterion(hasItem(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), conditionsFromItem(ModItems.CHORUNDUM_UPGRADE_TEMPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_SPEAR)
                .pattern("  S")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.STICK)
                .input('S', ItemTags.PLANKS)
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_SPEAR)
                .pattern("  S")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.STICK)
                .input('S', ItemTags.STONE_TOOL_MATERIALS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_SPEAR)
                .pattern("  S")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.STICK)
                .input('S', Items.GOLD_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_SPEAR)
                .pattern("  S")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.STICK)
                .input('S', Items.IRON_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_SPEAR)
                .pattern("  S")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.STICK)
                .input('S', Items.DIAMOND)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SPEAR)
                .pattern("  S")
                .pattern(" A ")
                .pattern("A  ")
                .input('A', Items.STICK)
                .input('S', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(ModItems.DIAMOND_SPEAR), Ingredient.ofItems(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, ModItems.NETHERITE_SPEAR)
                .criterion("has_netherite", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, "netherite_spear_smithing");

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.CHORUNDUM_UPGRADE_TEMPLATE), Ingredient.ofItems(ModItems.NETHERITE_SPEAR), Ingredient.ofItems(ModItems.CHORUNDUM), RecipeCategory.TOOLS, ModItems.CHORUNDUM_SPEAR)
                .criterion("has_netherite", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, "chorundum_spear_smithing");

    }
}
