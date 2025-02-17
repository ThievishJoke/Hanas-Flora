package net.hana.hanas_flora;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.hana.hanas_flora.blocks.entity.ModBlockEntities;
import net.hana.hanas_flora.items.ModItemGroups;
import net.hana.hanas_flora.items.ModItems;
import net.hana.hanas_flora.recipe.ModRecipes;
import net.hana.hanas_flora.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HanasFlora implements ModInitializer {
    public static final String MOD_ID = "hanas_flora";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModBlockEntities.registerBlockEntities();
        ModRecipes.registerRecipes();

        registerFlammables();
        registerFuels();
        registerStrippables();

        ModWorldGeneration.generateModWorldGen();
    }

    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_LOG, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_WOOD, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAHOGANY_LOG, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAHOGANY_WOOD, 5, 20);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAHOGANY_LEAVES, 30, 60);
    }

    private static void registerOxicizables() {
    }

    private static void registerFuels() {
    }

    //FabricDefaultAttributeRegistry.register(ModEntities.DEER, DeerEntity.createDeerAttributes());

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MAHOGANY_LOG, ModBlocks.STRIPPED_MAHOGANY_LOG);
        StrippableBlockRegistry.register(ModBlocks.MAHOGANY_WOOD, ModBlocks.STRIPPED_MAHOGANY_WOOD);
    }
}
