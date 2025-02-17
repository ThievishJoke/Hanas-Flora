package net.hana.hanas_flora.world.tree;

import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator MAHOGANY = new SaplingGenerator(HanasFlora.MOD_ID + ":mahogany",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAHOGANY_KEY), Optional.empty());
}