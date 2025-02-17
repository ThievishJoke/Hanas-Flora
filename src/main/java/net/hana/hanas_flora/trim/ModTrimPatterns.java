package net.hana.hanas_flora.trim;

import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.items.ModItems;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> FLORA = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(HanasFlora.MOD_ID, "flora"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context);
    }

    private static void register(Registerable<ArmorTrimPattern> context) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(ModTrimPatterns.FLORA.getValue(), Registries.ITEM.getEntry(ModItems.FLORA_SMITHING_TEMPLATE),
                Text.translatable(Util.createTranslationKey("trim_pattern", ModTrimPatterns.FLORA.getValue())), false);

        context.register(ModTrimPatterns.FLORA, trimPattern);
    }
}