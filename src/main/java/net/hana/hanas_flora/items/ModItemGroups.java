package net.hana.hanas_flora.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLORA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasFlora.MOD_ID, "flora_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hanas_flora"))
                    .icon(() -> new ItemStack(ModBlocks.RED_ROSE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.GLOWING_WISTERIA);
                        entries.add(ModBlocks.ACONITE);
                        entries.add(ModBlocks.RED_ROSE);
                        entries.add(ModBlocks.BLUE_ASTER);
                        entries.add(ModBlocks.INDIGO_ASTER);
                        entries.add(ModBlocks.PINK_ASTER);
                        entries.add(ModBlocks.VIOLET_ASTER);
                        entries.add(ModBlocks.WHITE_ASTER);
                        entries.add(ModBlocks.CYCLAMEN);
                        entries.add(ModBlocks.DUSTY_MILLER);
                        entries.add(ModBlocks.BLUE_FLOSSFLOWER);
                        entries.add(ModBlocks.MAGENTA_FLOSSFLOWER);
                        entries.add(ModBlocks.PINK_FLOSSFLOWER);
                        entries.add(ModBlocks.WHITE_FLOSSFLOWER);
                        entries.add(ModBlocks.GLOBE_THISTLE);
                        entries.add(ModBlocks.BUTTERCUP);
                        entries.add(ModBlocks.PINK_DAISY);
                        entries.add(ModBlocks.YELLOW_DAISY);
                        entries.add(ModBlocks.WHITE_DAISY);
                        entries.add(ModBlocks.SILVER_MOUND_ARTEMISIA);
                        entries.add(ModBlocks.SOFT_PINK_HELIOTROPE);
                        entries.add(ModBlocks.PINK_HELIOTROPE);
                        entries.add(ModBlocks.WHITE_HELIOTROPE);
                        entries.add(ModBlocks.TRANS_HELIOTROPE);
                        entries.add(ModBlocks.VIOLET_HELIOTROPE);
                        entries.add(ModBlocks.ORANGE_HELIOTROPE);
                        entries.add(ModBlocks.BLACK_HELIOTROPE);
                        entries.add(ModBlocks.ICE_HELIOTROPE);
                        entries.add(ModBlocks.GOMPHRENA);
                        entries.add(ModBlocks.GOMPHRENA_PATCH);
                        entries.add(ModBlocks.DAHLIA);
                        entries.add(ModBlocks.BLOODROOT);

                        entries.add(ModBlocks.FOUNTAIN_GRASS);
                        entries.add(ModBlocks.FOXGLOVE);

                        //entries.add(ModBlocks.VIOLET_AUBRIETA);

                        entries.add(ModBlocks.SCULK_TENDRIL);
                        entries.add(ModBlocks.SCULK_ROSE);
                        entries.add(ModBlocks.GLOWING_SCULK_WISTERIA);
                        entries.add(ModBlocks.GLOWING_SCULK_WISTERIA_BUNDLE);

                        entries.add(ModBlocks.NARROW_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_NARROW_OAK_LOG);

                        entries.add(ModBlocks.MAHOGANY_LOG);
                        entries.add(ModBlocks.MAHOGANY_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAHOGANY_LOG);
                        entries.add(ModBlocks.STRIPPED_MAHOGANY_WOOD);
                        entries.add(ModBlocks.MAHOGANY_PLANKS);
                        entries.add(ModBlocks.MAHOGANY_LEAVES);
                        entries.add(ModBlocks.MAHOGANY_PLANK_BOOKSHELF);
                        entries.add(ModBlocks.MAHOGANY_STAIRS);
                        entries.add(ModBlocks.MAHOGANY_SLAB);
                        entries.add(ModBlocks.MAHOGANY_FENCE);
                        entries.add(ModBlocks.MAHOGANY_FENCE_GATE);
                        entries.add(ModBlocks.MAHOGANY_DOOR);
                        entries.add(ModBlocks.MAHOGANY_TRAPDOOR);
                        entries.add(ModBlocks.MAHOGANY_PLATE);
                        entries.add(ModBlocks.MAHOGANY_BUTTON);

                        entries.add(ModItems.FLORA_SMITHING_TEMPLATE);
                    }).build());


    public static void registerItemGroups() {
        HanasFlora.LOGGER.info("Registering Item Groups for " + HanasFlora.MOD_ID);
    }
}