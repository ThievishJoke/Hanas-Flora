package net.hana.hanas_flora.world;

import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MAHOGANY_PLACED_KEY = registerKey("mahogany_placed");

    public static final RegistryKey<PlacedFeature> GLOWING_WISTERIA_PLACED_KEY = registerKey("glowing_wisteria_placed");
    public static final RegistryKey<PlacedFeature> ACONITE_PLACED_KEY = registerKey("aconite_placed");
    public static final RegistryKey<PlacedFeature> RED_ROSE_PLACED_KEY = registerKey("red_rose_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_ROSE_PLACED_KEY = registerKey("yellow_rose_placed");
    public static final RegistryKey<PlacedFeature> BLUE_ASTER_PLACED_KEY = registerKey("blue_aster_placed");
    public static final RegistryKey<PlacedFeature> INDIGO_ASTER_PLACED_KEY = registerKey("indigo_aster_placed");
    public static final RegistryKey<PlacedFeature> PINK_ASTER_PLACED_KEY = registerKey("pink_aster_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_ASTER_PLACED_KEY = registerKey("violet_aster_placed");
    public static final RegistryKey<PlacedFeature> WHITE_ASTER_PLACED_KEY = registerKey("white_aster_placed");
    public static final RegistryKey<PlacedFeature> CYCLAMEN_PLACED_KEY = registerKey("cyclamen_placed");
    public static final RegistryKey<PlacedFeature> DUSTY_MILLER_PLACED_KEY = registerKey("dusty_miller_placed");
    public static final RegistryKey<PlacedFeature> BLUE_FLOSSFLOWER_PLACED_KEY = registerKey("blue_flossflower_placed");
    public static final RegistryKey<PlacedFeature> MAGENTA_FLOSSFLOWER_PLACED_KEY = registerKey("magenta_flossflower_placed");
    public static final RegistryKey<PlacedFeature> PINK_FLOSSFLOWER_PLACED_KEY = registerKey("pink_flossflower_placed");
    public static final RegistryKey<PlacedFeature> WHITE_FLOSSFLOWER_PLACED_KEY = registerKey("white_flossflower_placed");
    public static final RegistryKey<PlacedFeature> GLOBE_THISTLE_PLACED_KEY = registerKey("globe_thistle_placed");
    public static final RegistryKey<PlacedFeature> BUTTERCUP_PLACED_KEY = registerKey("buttercup_placed");
    public static final RegistryKey<PlacedFeature> PINK_DAISY_PLACED_KEY = registerKey("pink_daisy_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_DAISY_PLACED_KEY = registerKey("yellow_daisy_placed");
    public static final RegistryKey<PlacedFeature> WHITE_DAISY_PLACED_KEY = registerKey("white_daisy_placed");
    public static final RegistryKey<PlacedFeature> SILVER_MOUND_ARTEMISIA_PLACED_KEY = registerKey("silver_mound_artemisia_placed");
    public static final RegistryKey<PlacedFeature> SOFT_PINK_HELIOTROPE_PLACED_KEY = registerKey("soft_pink_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> PINK_HELIOTROPE_PLACED_KEY = registerKey("pink_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> WHITE_HELIOTROPE_PLACED_KEY = registerKey("white_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> TRANS_HELIOTROPE_PLACED_KEY = registerKey("trans_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_HELIOTROPE_PLACED_KEY = registerKey("violet_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_HELIOTROPE_PLACED_KEY = registerKey("orange_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> BLACK_HELIOTROPE_PLACED_KEY = registerKey("black_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> ICE_HELIOTROPE_PLACED_KEY = registerKey("ice_heliotrope_placed");
    public static final RegistryKey<PlacedFeature> GOMPHRENA_PLACED_KEY = registerKey("gomphrena_placed");
    public static final RegistryKey<PlacedFeature> GOMPHRENA_PATCH_PLACED_KEY = registerKey("gomphrena_patch_placed");
    public static final RegistryKey<PlacedFeature> DAHLIA_PLACED_KEY = registerKey("dahlia_placed");
    public static final RegistryKey<PlacedFeature> BLOODROOT_PLACED_KEY = registerKey("bloodroot_placed");
    public static final RegistryKey<PlacedFeature> FOUNTAIN_GRASS_PLACED_KEY = registerKey("fountain_grass_placed");
    public static final RegistryKey<PlacedFeature> FOXGLOVE_PLACED_KEY = registerKey("foxglove_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_AUBRIETA_PLACED_KEY = registerKey("violet_aubrieta_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MAHOGANY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAHOGANY_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.MAHOGANY_SAPLING));

        register(context, ACONITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ACONITE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, RED_ROSE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_ROSE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_ROSE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_ROSE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUE_ASTER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_ASTER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, INDIGO_ASTER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.INDIGO_ASTER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_ASTER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_ASTER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, VIOLET_ASTER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VIOLET_ASTER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_ASTER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_ASTER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CYCLAMEN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CYCLAMEN_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DUSTY_MILLER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DUSTY_MILLER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUE_FLOSSFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_FLOSSFLOWER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, MAGENTA_FLOSSFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGENTA_FLOSSFLOWER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_FLOSSFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_FLOSSFLOWER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_FLOSSFLOWER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_FLOSSFLOWER_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, GLOBE_THISTLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GLOBE_THISTLE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BUTTERCUP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BUTTERCUP_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_DAISY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_DAISY_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_DAISY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_DAISY_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_DAISY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_DAISY_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SILVER_MOUND_ARTEMISIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_MOUND_ARTEMISIA_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, SOFT_PINK_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SOFT_PINK_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, PINK_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, TRANS_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TRANS_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, VIOLET_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VIOLET_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ORANGE_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLACK_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLACK_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ICE_HELIOTROPE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ICE_HELIOTROPE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, GOMPHRENA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GOMPHRENA_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, GOMPHRENA_PATCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GOMPHRENA_PATCH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, DAHLIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DAHLIA_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLOODROOT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLOODROOT_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, FOUNTAIN_GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOUNTAIN_GRASS_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, FOXGLOVE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FOXGLOVE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, VIOLET_AUBRIETA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VIOLET_AUBRIETA_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(HanasFlora.MOD_ID, name));
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
