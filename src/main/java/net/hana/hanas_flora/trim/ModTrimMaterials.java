package net.hana.hanas_flora.trim;

import net.hana.hanas_flora.HanasFlora;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> MOSS_BLOCK = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "moss"));

    public static final RegistryKey<ArmorTrimMaterial> WHITE_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "white_dye"));
    public static final RegistryKey<ArmorTrimMaterial> ORANGE_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "orange_dye"));
    public static final RegistryKey<ArmorTrimMaterial> MAGENTA_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "magenta_dye"));
    public static final RegistryKey<ArmorTrimMaterial> LIGHT_BLUE_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "light_blue_dye"));

    public static final RegistryKey<ArmorTrimMaterial> YELLOW_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "yellow_dye"));
    public static final RegistryKey<ArmorTrimMaterial> LIME_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "lime_dye"));
    public static final RegistryKey<ArmorTrimMaterial> PINK_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "pink_dye"));
    public static final RegistryKey<ArmorTrimMaterial> GRAY_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "gray_dye"));

    public static final RegistryKey<ArmorTrimMaterial> LIGHT_GRAY_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "light_gray_dye"));
    public static final RegistryKey<ArmorTrimMaterial> CYAN_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "cyan_dye"));
    public static final RegistryKey<ArmorTrimMaterial> PURPLE_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "purple_dye"));
    public static final RegistryKey<ArmorTrimMaterial> BLUE_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "blue_dye"));

    public static final RegistryKey<ArmorTrimMaterial> BROWN_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "brown_dye"));
    public static final RegistryKey<ArmorTrimMaterial> GREEN_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "green_dye"));
    public static final RegistryKey<ArmorTrimMaterial> RED_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "red_dye"));
    public static final RegistryKey<ArmorTrimMaterial> BLACK_DYE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(HanasFlora.MOD_ID, "black_dye"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, MOSS_BLOCK, Registries.ITEM.getEntry(Items.MOSS_BLOCK),
                Style.EMPTY.withColor(TextColor.parse("#6b9a44").getOrThrow()), 0.618f);
        register(registerable, WHITE_DYE, Registries.ITEM.getEntry(Items.WHITE_DYE),
                Style.EMPTY.withColor(TextColor.parse("#f9fffe").getOrThrow()), 0.617f);
        register(registerable, ORANGE_DYE, Registries.ITEM.getEntry(Items.ORANGE_DYE),
                Style.EMPTY.withColor(TextColor.parse("#F9801D").getOrThrow()), 0.616f);
        register(registerable, MAGENTA_DYE, Registries.ITEM.getEntry(Items.MAGENTA_DYE),
                Style.EMPTY.withColor(TextColor.parse("#C74EBD").getOrThrow()), 0.615f);
        register(registerable, LIGHT_BLUE_DYE, Registries.ITEM.getEntry(Items.LIGHT_BLUE_DYE),
                Style.EMPTY.withColor(TextColor.parse("#3AB3DA").getOrThrow()), 0.614f);
        register(registerable, YELLOW_DYE, Registries.ITEM.getEntry(Items.YELLOW_DYE),
                Style.EMPTY.withColor(TextColor.parse("#FED83D").getOrThrow()), 0.613f);
        register(registerable, LIME_DYE, Registries.ITEM.getEntry(Items.LIME_DYE),
                Style.EMPTY.withColor(TextColor.parse("#80C71F").getOrThrow()), 0.612f);
        register(registerable, PINK_DYE, Registries.ITEM.getEntry(Items.PINK_DYE),
                Style.EMPTY.withColor(TextColor.parse("#F38BAA").getOrThrow()), 0.611f);
        register(registerable, GRAY_DYE, Registries.ITEM.getEntry(Items.GRAY_DYE),
                Style.EMPTY.withColor(TextColor.parse("#474F52").getOrThrow()), 0.609f);
        register(registerable, LIGHT_GRAY_DYE, Registries.ITEM.getEntry(Items.LIGHT_GRAY_DYE),
                Style.EMPTY.withColor(TextColor.parse("#9D9D97").getOrThrow()), 0.608f);
        register(registerable, CYAN_DYE, Registries.ITEM.getEntry(Items.CYAN_DYE),
                Style.EMPTY.withColor(TextColor.parse("#169C9C").getOrThrow()), 0.607f);
        register(registerable, PURPLE_DYE, Registries.ITEM.getEntry(Items.PURPLE_DYE),
                Style.EMPTY.withColor(TextColor.parse("#8932B8").getOrThrow()), 0.606f);
        register(registerable, BLUE_DYE, Registries.ITEM.getEntry(Items.BLUE_DYE),
                Style.EMPTY.withColor(TextColor.parse("#3C44AA").getOrThrow()), 0.605f);
        register(registerable, BROWN_DYE, Registries.ITEM.getEntry(Items.BROWN_DYE),
                Style.EMPTY.withColor(TextColor.parse("#835432").getOrThrow()), 0.604f);
        register(registerable, GREEN_DYE, Registries.ITEM.getEntry(Items.GREEN_DYE),
                Style.EMPTY.withColor(TextColor.parse("#5E7C16").getOrThrow()), 0.603f);
        register(registerable, RED_DYE, Registries.ITEM.getEntry(Items.RED_DYE),
                Style.EMPTY.withColor(TextColor.parse("#B02E26").getOrThrow()), 0.602f);
        register(registerable, BLACK_DYE, Registries.ITEM.getEntry(Items.BLACK_DYE),
                Style.EMPTY.withColor(TextColor.parse("#1D1D21").getOrThrow()), 0.601f);

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        if (item == null) {
            System.err.println("Failed to register trim material for: " + armorTrimKey.getValue());
            return;
        }

        System.out.println("Registering trim: " + armorTrimKey.getValue().toString() + " with item: " + item);

        try {
            ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(
                    armorTrimKey.getValue().getPath(),
                    item,
                    itemModelIndex,
                    Map.of(),
                    Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style)
            );
            registerable.register(armorTrimKey, trimMaterial);
        } catch (Exception e) {
            System.err.println("Error registering trim material for: " + armorTrimKey.getValue());
            e.printStackTrace();
        }
    }
}