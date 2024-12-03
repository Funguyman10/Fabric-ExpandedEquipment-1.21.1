package com.funguyman10.expandedequipment.datagen;

import com.funguyman10.expandedequipment.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.CHORUNDUM);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.CHORUNDUM_PICKAXE)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.CHORUNDUM_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.CHORUNDUM_AXE)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.CHORUNDUM_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.CHORUNDUM_SHOVEL)
                .add(ModItems.CHORUNDUM_PAXEL)
                .add(ModItems.COPPER_PAXEL)
                .add(ModItems.WOODEN_PAXEL)
                .add(ModItems.STONE_PAXEL)
                .add(ModItems.GOLDEN_PAXEL)
                .add(ModItems.IRON_PAXEL)
                .add(ModItems.DIAMOND_PAXEL)
                .add(ModItems.NETHERITE_PAXEL);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.CHORUNDUM_SWORD);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.CHORUNDUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.CHORUNDUM_HELMET)
                .add(ModItems.CHORUNDUM_CHESTPLATE)
                .add(ModItems.CHORUNDUM_LEGGINGS)
                .add(ModItems.CHORUNDUM_BOOTS)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS);

    }
}
