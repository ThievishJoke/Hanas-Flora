package net.hana.hanas_flora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.hana.hanas_flora.items.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(ModBlocks.MAHOGANY_PLANK_BOOKSHELF, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GLOWING_WISTERIA, ModBlocks.POTTED_GLOWING_WISTERIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ACONITE, ModBlocks.POTTED_ACONITE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_ROSE, ModBlocks.POTTED_RED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_ROSE, ModBlocks.POTTED_YELLOW_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_ASTER, ModBlocks.POTTED_BLUE_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.INDIGO_ASTER, ModBlocks.POTTED_INDIGO_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_ASTER, ModBlocks.POTTED_PINK_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VIOLET_ASTER, ModBlocks.POTTED_VIOLET_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_ASTER, ModBlocks.POTTED_WHITE_ASTER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYCLAMEN, ModBlocks.POTTED_CYCLAMEN, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DUSTY_MILLER,ModBlocks.POTTED_DUSTY_MILLER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_FLOSSFLOWER,ModBlocks.POTTED_BLUE_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_FLOSSFLOWER,ModBlocks.POTTED_MAGENTA_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_FLOSSFLOWER,ModBlocks.POTTED_PINK_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_FLOSSFLOWER,ModBlocks.POTTED_WHITE_FLOSSFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GLOBE_THISTLE,ModBlocks.POTTED_GLOBE_THISTLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUTTERCUP,ModBlocks.POTTED_BUTTERCUP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_DAISY,ModBlocks.POTTED_PINK_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_DAISY,ModBlocks.POTTED_YELLOW_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_DAISY,ModBlocks.POTTED_WHITE_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SILVER_MOUND_ARTEMISIA,ModBlocks.POTTED_SILVER_MOUND_ARTEMISIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SOFT_PINK_HELIOTROPE,ModBlocks.POTTED_SOFT_PINK_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_HELIOTROPE,ModBlocks.POTTED_PINK_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_HELIOTROPE,ModBlocks.POTTED_WHITE_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.TRANS_HELIOTROPE,ModBlocks.POTTED_TRANS_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VIOLET_HELIOTROPE,ModBlocks.POTTED_VIOLET_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_HELIOTROPE,ModBlocks.POTTED_ORANGE_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLACK_HELIOTROPE,ModBlocks.POTTED_BLACK_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ICE_HELIOTROPE,ModBlocks.POTTED_ICE_HELIOTROPE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GOMPHRENA,ModBlocks.POTTED_GOMPHRENA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.GOMPHRENA_PATCH, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAHLIA,ModBlocks.POTTED_DAHLIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLOODROOT,ModBlocks.POTTED_BLOODROOT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(ModBlocks.FOUNTAIN_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.FOXGLOVE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerbed(ModBlocks.VIOLET_AUBRIETA);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SCULK_TENDRIL,ModBlocks.POTTED_SCULK_TENDRIL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SCULK_ROSE,ModBlocks.POTTED_SCULK_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GLOWING_SCULK_WISTERIA,ModBlocks.POTTED_GLOWING_SCULK_WISTERIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GLOWING_SCULK_WISTERIA_BUNDLE,ModBlocks.POTTED_GLOWING_SCULK_WISTERIA_BUNDLE, BlockStateModelGenerator.TintType.NOT_TINTED);

        //blockStateModelGenerator.registerSimpleState(ModBlocks.SCULK_TABLE);

        //blockStateModelGenerator.registerLog(BAMBOO_LOG).log(BAMBOO_LOG);
        //blockStateModelGenerator.registerLog(STRIPPED_BAMBOO_LOG).log(STRIPPED_BAMBOO_LOG);

        blockStateModelGenerator.registerLog(ModBlocks.MAHOGANY_LOG).log(ModBlocks.MAHOGANY_LOG).wood(ModBlocks.MAHOGANY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAHOGANY_LOG).log(ModBlocks.STRIPPED_MAHOGANY_LOG).wood(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        BlockStateModelGenerator.BlockTexturePool mahogany_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAHOGANY_PLANKS);
        mahogany_Pool.slab(ModBlocks.MAHOGANY_SLAB);
        mahogany_Pool.stairs(ModBlocks.MAHOGANY_STAIRS);
        mahogany_Pool.fence(ModBlocks.MAHOGANY_FENCE);
        mahogany_Pool.fenceGate(ModBlocks.MAHOGANY_FENCE_GATE);

        mahogany_Pool.button(ModBlocks.MAHOGANY_BUTTON);
        mahogany_Pool.pressurePlate(ModBlocks.MAHOGANY_PLATE);

        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAHOGANY_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.MAHOGANY_DOOR);

        blockStateModelGenerator.registerSingleton(ModBlocks.MAHOGANY_LEAVES, TexturedModel.LEAVES);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FLORA_SMITHING_TEMPLATE, Models.GENERATED);
    }

}
