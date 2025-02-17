package net.hana.hanas_flora.world;

import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany");

    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOWING_WISTERIA_KEY = registerKey("glowing_wisteria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACONITE_KEY = registerKey("aconite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ROSE_KEY = registerKey("red_rose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ROSE_KEY = registerKey("yellow_rose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_ASTER_KEY = registerKey("blue_aster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> INDIGO_ASTER_KEY = registerKey("indigo_aster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_ASTER_KEY = registerKey("pink_aster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_ASTER_KEY = registerKey("violet_aster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_ASTER_KEY = registerKey("white_aster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYCLAMEN_KEY = registerKey("cyclamen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DUSTY_MILLER_KEY = registerKey("dusty_miller");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_FLOSSFLOWER_KEY = registerKey("blue_flossflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_FLOSSFLOWER_KEY = registerKey("magenta_flossflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_FLOSSFLOWER_KEY = registerKey("pink_flossflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_FLOSSFLOWER_KEY = registerKey("white_flossflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOBE_THISTLE_KEY = registerKey("globe_thistle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUTTERCUP_KEY = registerKey("buttercup");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_DAISY_KEY = registerKey("pink_daisy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_DAISY_KEY = registerKey("yellow_daisy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_DAISY_KEY = registerKey("white_daisy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_MOUND_ARTEMISIA_KEY = registerKey("silver_mound_artemisia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOFT_PINK_HELIOTROPE_KEY = registerKey("soft_pink_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_HELIOTROPE_KEY = registerKey("pink_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_HELIOTROPE_KEY = registerKey("white_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TRANS_HELIOTROPE_KEY = registerKey("trans_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_HELIOTROPE_KEY = registerKey("violet_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_HELIOTROPE_KEY = registerKey("orange_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_HELIOTROPE_KEY = registerKey("black_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ICE_HELIOTROPE_KEY = registerKey("ice_heliotrope");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOMPHRENA_KEY = registerKey("gomphrena");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOMPHRENA_PATCH_KEY = registerKey("gomphrena_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DAHLIA_KEY = registerKey("dahlia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLOODROOT_KEY = registerKey("bloodroot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS_KEY = registerKey("fountain_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOXGLOVE_KEY = registerKey("foxglove");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET_AUBRIETA_KEY = registerKey("violet_aubrieta");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, MAHOGANY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAHOGANY_LOG),
                new CherryTrunkPlacer(5, 4, 3,
                        new WeightedListIntProvider(
                                DataPool.<IntProvider>builder().add(ConstantIntProvider.create(3),
                                        1).add(ConstantIntProvider.create(1),
                                        1).add(ConstantIntProvider.create(2),
                                        1).build()
                        ),
                        UniformIntProvider.create(2, 2),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)
                ),
                BlockStateProvider.of(ModBlocks.MAHOGANY_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), ConstantIntProvider.create(6),
                        0.15f, 0.5f, 0f, 0f),
                new TwoLayersFeatureSize(3, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).ignoreVines().build());


        register(context, ACONITE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ACONITE)))));

        register(context, RED_ROSE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 1, 1,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_ROSE)))));
        register(context, YELLOW_ROSE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 1, 1,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_ROSE)))));
        register(context, BLUE_ASTER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(26, 3, 3,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_ASTER)))));
        register(context, INDIGO_ASTER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(26, 3, 3,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.INDIGO_ASTER)))));
        register(context, PINK_ASTER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(26, 3, 3,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ASTER)))));
        register(context, VIOLET_ASTER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(26, 3, 3,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.VIOLET_ASTER)))));
        register(context, WHITE_ASTER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(26, 3, 3,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_ASTER)))));

        register(context, CYCLAMEN_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(24, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CYCLAMEN)))));
        register(context, DUSTY_MILLER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(24, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DUSTY_MILLER)))));
        register(context, BLUE_FLOSSFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(12, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_FLOSSFLOWER)))));
        register(context, MAGENTA_FLOSSFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(12, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_FLOSSFLOWER)))));
        register(context, PINK_FLOSSFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(12, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_FLOSSFLOWER)))));
        register(context, WHITE_FLOSSFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(12, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_FLOSSFLOWER)))));
        register(context, GLOBE_THISTLE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(12, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GLOBE_THISTLE)))));
        register(context, BUTTERCUP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BUTTERCUP)))));
        register(context, PINK_DAISY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(4, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_DAISY)))));
        register(context, YELLOW_DAISY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(4, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_DAISY)))));
        register(context, WHITE_DAISY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(4, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_DAISY)))));

        register(context, SILVER_MOUND_ARTEMISIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(36, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SILVER_MOUND_ARTEMISIA)))));
        register(context, SOFT_PINK_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(8, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SOFT_PINK_HELIOTROPE)))));
        register(context, PINK_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(8, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_HELIOTROPE)))));
        register(context, WHITE_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_HELIOTROPE)))));
        register(context, TRANS_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TRANS_HELIOTROPE)))));
        register(context, VIOLET_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(8, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.VIOLET_HELIOTROPE)))));
        register(context, ORANGE_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORANGE_HELIOTROPE)))));
        register(context, BLACK_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLACK_HELIOTROPE)))));
        register(context, ICE_HELIOTROPE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ICE_HELIOTROPE)))));
        register(context, GOMPHRENA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(96, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GOMPHRENA)))));
        register(context, GOMPHRENA_PATCH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(96, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GOMPHRENA_PATCH)))));
        register(context, DAHLIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(96, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.DAHLIA)))));
        register(context, BLOODROOT_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(40, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLOODROOT)))));
        register(context, FOUNTAIN_GRASS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FOUNTAIN_GRASS)))));
        register(context, FOXGLOVE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(16, 3, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.FOXGLOVE)))));

        DataPool.Builder<BlockState> builder = DataPool.builder();

        for (int i = 1; i <= 4; ++i) {
            for (Direction direction : Direction.Type.HORIZONTAL) {
                builder.add(ModBlocks.VIOLET_AUBRIETA.getDefaultState().with(FlowerbedBlock.FLOWER_AMOUNT, i).with(FlowerbedBlock.FACING, direction), 1);
            }
        }
        register(context, VIOLET_AUBRIETA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(96, 8, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(builder)))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(HanasFlora.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
