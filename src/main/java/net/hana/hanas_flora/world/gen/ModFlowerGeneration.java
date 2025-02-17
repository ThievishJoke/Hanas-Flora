package net.hana.hanas_flora.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;

import net.hana.hanas_flora.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        //BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.TAIGA),
        //        GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GLOWING_WISTERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ACONITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_ROSE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_ROSE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_ASTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.INDIGO_ASTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_ASTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VIOLET_ASTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_ASTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_HILLS),

                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CYCLAMEN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DUSTY_MILLER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_FLOSSFLOWER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAGENTA_FLOSSFLOWER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_FLOSSFLOWER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_FLOSSFLOWER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GLOBE_THISTLE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BUTTERCUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_DAISY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_DAISY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_DAISY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SILVER_MOUND_ARTEMISIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SOFT_PINK_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TRANS_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VIOLET_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ORANGE_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLACK_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ICE_HELIOTROPE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GOMPHRENA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GOMPHRENA_PATCH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DAHLIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLOODROOT_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FOUNTAIN_GRASS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FOXGLOVE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.VIOLET_AUBRIETA_PLACED_KEY);
    }
}