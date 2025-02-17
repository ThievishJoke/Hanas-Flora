package net.hana.hanas_flora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registeryLookup) {
        super(dataOutput, registeryLookup);
    }

    @Override
    public void generate() {
//plants
        addDrop(ModBlocks.GLOWING_WISTERIA);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_WISTERIA);
        addDrop(ModBlocks.ACONITE);
        addPottedPlantDrops(ModBlocks.POTTED_ACONITE);
        addDrop(ModBlocks.RED_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_RED_ROSE);
        addDrop(ModBlocks.BLUE_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_ASTER);
        addDrop(ModBlocks.INDIGO_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_INDIGO_ASTER);
        addDrop(ModBlocks.PINK_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_PINK_ASTER);
        addDrop(ModBlocks.VIOLET_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_VIOLET_ASTER);
        addDrop(ModBlocks.WHITE_ASTER);
        addPottedPlantDrops(ModBlocks.POTTED_WHITE_ASTER);
        addDrop(ModBlocks.CYCLAMEN);
        addPottedPlantDrops(ModBlocks.POTTED_CYCLAMEN);
        addDrop(ModBlocks.DUSTY_MILLER);
        addPottedPlantDrops(ModBlocks.POTTED_DUSTY_MILLER);
        addDrop(ModBlocks.BLUE_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_FLOSSFLOWER);
        addDrop(ModBlocks.MAGENTA_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_MAGENTA_FLOSSFLOWER);
        addDrop(ModBlocks.PINK_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_PINK_FLOSSFLOWER);
        addDrop(ModBlocks.WHITE_FLOSSFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_WHITE_FLOSSFLOWER);

        //addDrop(ModBlocks.VIOLET_AUBRIETA);
        //addPottedPlantDrops(ModBlocks.POTTED_VIOLET_AUBRIETA);

        addDrop(ModBlocks.SCULK_TENDRIL);
        addPottedPlantDrops(ModBlocks.POTTED_SCULK_TENDRIL);
        addDrop(ModBlocks.SCULK_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_SCULK_ROSE);
        addDrop(ModBlocks.GLOWING_SCULK_WISTERIA);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_SCULK_WISTERIA);
        addDrop(ModBlocks.GLOWING_SCULK_WISTERIA_BUNDLE);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_SCULK_WISTERIA_BUNDLE);

        //addDrop(ModBlocks.RUBY_DOOR, doorDrops(ModBlocks."example_door"));

        addDrop(ModBlocks.MAHOGANY_LOG);
        addDrop(ModBlocks.MAHOGANY_WOOD);
        addDrop(ModBlocks.STRIPPED_MAHOGANY_LOG);
        addDrop(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        addDrop(ModBlocks.MAHOGANY_PLANKS);

        addDrop(ModBlocks.MAHOGANY_LEAVES, leavesDrops(ModBlocks.MAHOGANY_LEAVES, ModBlocks.MAHOGANY_SAPLING, 0.0025f));
    }
}
