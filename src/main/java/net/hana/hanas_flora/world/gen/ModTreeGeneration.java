package net.hana.hanas_flora.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;

import net.hana.hanas_flora.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAHOGANY_PLACED_KEY);
    }
}