package net.hana.hanas_flora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.SCULK_FLORA);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.MAHOGANY_PLANK_BOOKSHELF)
                .add(ModBlocks.MAHOGANY_LOG)
                .add(ModBlocks.MAHOGANY_WOOD)
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD)
                .add(ModBlocks.MAHOGANY_PLANKS)
                .add(ModBlocks.MAHOGANY_SLAB)
                .add(ModBlocks.MAHOGANY_STAIRS)
                .add(ModBlocks.MAHOGANY_FENCE)
                .add(ModBlocks.MAHOGANY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SCULK_FLORA);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.MAHOGANY_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MAHOGANY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAHOGANY_LOG)
                .add(ModBlocks.MAHOGANY_WOOD)
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG)
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD);
        getOrCreateTagBuilder((BlockTags.FLOWERS))
                .add(ModBlocks.GLOWING_WISTERIA)
                .add(ModBlocks.ACONITE)
                .add(ModBlocks.RED_ROSE)
                .add(ModBlocks.BLUE_ASTER)
                .add(ModBlocks.INDIGO_ASTER)
                .add(ModBlocks.PINK_ASTER)
                .add(ModBlocks.VIOLET_ASTER)
                .add(ModBlocks.WHITE_ASTER)
                .add(ModBlocks.CYCLAMEN)
                .add(ModBlocks.DUSTY_MILLER)
                .add(ModBlocks.BLUE_FLOSSFLOWER)
                .add(ModBlocks.MAGENTA_FLOSSFLOWER)
                .add(ModBlocks.PINK_FLOSSFLOWER)
                .add(ModBlocks.WHITE_FLOSSFLOWER)
                .add(ModBlocks.GLOBE_THISTLE)
                .add(ModBlocks.BUTTERCUP)
                .add(ModBlocks.PINK_DAISY)
                .add(ModBlocks.YELLOW_DAISY)
                .add(ModBlocks.WHITE_DAISY)
                .add(ModBlocks.SILVER_MOUND_ARTEMISIA)
                .add(ModBlocks.SOFT_PINK_HELIOTROPE)
                .add(ModBlocks.PINK_HELIOTROPE)
                .add(ModBlocks.WHITE_HELIOTROPE)
                .add(ModBlocks.TRANS_HELIOTROPE)
                .add(ModBlocks.VIOLET_HELIOTROPE)
                .add(ModBlocks.ORANGE_HELIOTROPE)
                .add(ModBlocks.BLACK_HELIOTROPE)
                .add(ModBlocks.ICE_HELIOTROPE)
                .add(ModBlocks.GOMPHRENA)
                .add(ModBlocks.GOMPHRENA_PATCH)
                .add(ModBlocks.DAHLIA)
                .add(ModBlocks.BLOODROOT);
        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(ModBlocks.MAHOGANY_PLANK_BOOKSHELF);
    }
}
