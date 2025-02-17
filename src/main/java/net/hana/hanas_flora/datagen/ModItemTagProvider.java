package net.hana.hanas_flora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.hana.hanas_flora.items.ModItems;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAHOGANY_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAHOGANY_LOG.asItem())
                .add(ModBlocks.MAHOGANY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAHOGANY_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(Items.MOSS_BLOCK)
                .add(Items.WHITE_DYE)
                .add(Items.ORANGE_DYE)
                .add(Items.MAGENTA_DYE)
                .add(Items.LIGHT_BLUE_DYE)
                .add(Items.YELLOW_DYE)
                .add(Items.LIME_DYE)
                .add(Items.PINK_DYE)
                .add(Items.GRAY_DYE)
                .add(Items.LIGHT_GRAY_DYE)
                .add(Items.CYAN_DYE)
                .add(Items.PURPLE_DYE)
                .add(Items.BLUE_DYE)
                .add(Items.BROWN_DYE)
                .add(Items.GREEN_DYE)
                .add(Items.RED_DYE)
                .add(Items.BLACK_DYE);
        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                 .add(ModItems.FLORA_SMITHING_TEMPLATE);
    }
}
