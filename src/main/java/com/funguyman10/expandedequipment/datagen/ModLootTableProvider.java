package com.funguyman10.expandedequipment.datagen;

import com.funguyman10.expandedequipment.block.ModBlocks;
import com.funguyman10.expandedequipment.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CHORUNUM_BLOCK);
        addDrop(ModBlocks.RAW_CHORUNUM_BLOCK);
        addDrop(ModBlocks.END_CHORUNUM_ORE, oreDrops(ModBlocks.END_CHORUNUM_ORE, ModItems.RAW_CHORUNDUM));
        addDrop(ModBlocks.ENERGETIC_DEEPSLATE_ORE, oreDrops(ModBlocks.ENERGETIC_DEEPSLATE_ORE, ModItems.ENERGETIC_ROCK));
    }
}
