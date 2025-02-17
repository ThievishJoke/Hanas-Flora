package net.hana.hanas_flora;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hana.hanas_flora.datagen.*;
import net.hana.hanas_flora.trim.ModTrimMaterials;
import net.hana.hanas_flora.trim.ModTrimPatterns;
import net.hana.hanas_flora.world.ModConfiguredFeatures;
import net.hana.hanas_flora.world.ModPlacedFeatures;
import net.hana.hanas_flora.world.gen.ModWorldGeneration;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import org.jetbrains.annotations.NotNull;

public class HanasFloraDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModWorldGenerator::new);
        pack.addProvider(ModRegistryDataGenerator::new);
    }

    @Override
    public void buildRegistry(@NotNull RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, ModTrimMaterials::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.TRIM_PATTERN, ModTrimPatterns::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
