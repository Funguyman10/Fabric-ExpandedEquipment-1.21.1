package com.funguyman10.expandedequipment.world;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> END_CHORUNDUM_ORE_PLACED_KEY =registerKey("end_chorundum_ore_placed");
    public static final RegistryKey<PlacedFeature> BIG_END_CHORUNDUM_ORE_PLACED_KEY =registerKey("big_end_chorundum_ore_placed");
    public static final RegistryKey<PlacedFeature> ENERGETIC_ORE_PLACED_KEY =registerKey("energetic_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, END_CHORUNDUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_CHORUNDUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(70))));

        register(context, BIG_END_CHORUNDUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BIG_END_CHORUNDUM_ORE_KEY),
                ModOrePlacement.modifiersWithRarity(3, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(70))));

        register(context, ENERGETIC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENERGETIC_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-8))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ExpandedEquipment.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
