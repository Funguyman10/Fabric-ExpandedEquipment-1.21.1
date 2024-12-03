package com.funguyman10.expandedequipment.datagen;

import com.funguyman10.expandedequipment.block.ModBlocks;
import com.funguyman10.expandedequipment.util.ModBlockTags;
import com.funguyman10.expandedequipment.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHORUNUM_BLOCK)
                .add(ModBlocks.RAW_CHORUNUM_BLOCK)
                .add(ModBlocks.END_CHORUNUM_ORE)
                .add(ModBlocks.ENERGETIC_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.CHORUNUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.END_CHORUNUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ENERGETIC_DEEPSLATE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_COPPER_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_CHORUNDUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}
