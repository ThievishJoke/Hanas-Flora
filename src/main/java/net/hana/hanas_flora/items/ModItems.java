package net.hana.hanas_flora.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hana.hanas_flora.HanasFlora;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

import static net.hana.hanas_flora.HanasFlora.MOD_ID;

public class ModItems {

    public static final Item FLORA_SMITHING_TEMPLATE = registerItem("flora_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(MOD_ID, "flora"), FeatureFlags.VANILLA));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToInventoryItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }

    public static void registerModItems() {
        HanasFlora.LOGGER.info("Registering Mod Items for " + MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemsToInventoryItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
