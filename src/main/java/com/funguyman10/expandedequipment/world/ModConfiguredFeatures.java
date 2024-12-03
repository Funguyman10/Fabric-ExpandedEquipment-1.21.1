package com.funguyman10.expandedequipment.world;

import com.funguyman10.expandedequipment.ExpandedEquipment;
import com.funguyman10.expandedequipment.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_CHORUNDUM_ORE_KEY = registerKey("end_chorundum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BIG_END_CHORUNDUM_ORE_KEY = registerKey("big_end_chorundum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENERGETIC_ORE_KEY = registerKey("energetic_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldEnergeticOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.ENERGETIC_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endChorundumOres =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlocks.END_CHORUNUM_ORE.getDefaultState()));

        register(context, END_CHORUNDUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endChorundumOres, 3, 0.5f));
        register(context, BIG_END_CHORUNDUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endChorundumOres, 6, 0.9f));

        register(context, ENERGETIC_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldEnergeticOres, 15, 0.4f));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ExpandedEquipment.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
