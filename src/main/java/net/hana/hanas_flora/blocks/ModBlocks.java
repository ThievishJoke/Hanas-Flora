package net.hana.hanas_flora.blocks;

import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.blocks.custom.plant.SculkFlowerBlock;
import net.hana.hanas_flora.blocks.custom.plant.sapling.ModSaplingBlock;
import net.hana.hanas_flora.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.MapColor.DARK_GREEN;

public class ModBlocks {

    public static final Block MAHOGANY_LOG = registerBlock("mahogany_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block MAHOGANY_WOOD = registerBlock("mahogany_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block STRIPPED_MAHOGANY_LOG = registerBlock("stripped_mahogany_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final Block STRIPPED_MAHOGANY_WOOD = registerBlock("stripped_mahogany_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final Block MAHOGANY_PLANKS = registerBlock("mahogany_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)));
    public static final Block MAHOGANY_SLAB= registerBlock("mahogany_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MAHOGANY_PLANKS)));
    public static final Block MAHOGANY_STAIRS = registerBlock("mahogany_stairs",
            new StairsBlock(MAHOGANY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(MAHOGANY_PLANKS)));
    public static final Block MAHOGANY_FENCE = registerBlock("mahogany_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));
    public static final Block MAHOGANY_FENCE_GATE = registerBlock("mahogany_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));
    public static final Block MAHOGANY_TRAPDOOR = registerBlock("mahogany_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block MAHOGANY_DOOR = registerBlock("mahogany_door",
            new DoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque()));
    public static final Block MAHOGANY_PLATE = registerBlock("mahogany_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block MAHOGANY_BUTTON = registerBlock("mahogany_button",
            new ButtonBlock(BlockSetType.COPPER, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));

    public static final Block MAHOGANY_LEAVES = registerBlock("mahogany_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(1f)));

    public static final Block MAHOGANY_SAPLING = registerBlock("mahogany_sapling",
            new ModSaplingBlock(ModSaplingGenerators.MAHOGANY, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), GRASS_BLOCK));

    public static final Block NARROW_OAK_LOG = registerBlock("narrow_oak_log",
            new hana.hanas_blocks.block.custom.plant.wood.NarrowLogBlock(AbstractBlock.Settings.copy(OAK_LOG)));
    public static final Block STRIPPED_NARROW_OAK_LOG = registerBlock("stripped_narrow_oak_log",
            new hana.hanas_blocks.block.custom.plant.wood.NarrowLogBlock(AbstractBlock.Settings.copy(STRIPPED_OAK_LOG)));

    public static final Block MAHOGANY_PLANK_BOOKSHELF = registerBlock("mahogany_plank_bookshelf",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).mapColor(MapColor.BROWN).strength(1.5f).burnable()));

    //Flora
    //wisteria
    public static final Block GLOWING_WISTERIA = registerBlock("glowing_wisteria",
            new FlowerBlock(StatusEffects.REGENERATION, 15, AbstractBlock.Settings.copy(Blocks.ALLIUM).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //aconite
    public static final Block ACONITE = registerBlock("aconite",
            new FlowerBlock(StatusEffects.HASTE, 5, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //rose
    public static final Block RED_ROSE = registerBlock("red_rose",
            new FlowerBlock(StatusEffects.RESISTANCE, 5, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_ROSE = registerBlock("yellow_rose",
            new FlowerBlock(StatusEffects.RESISTANCE, 5, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //aster
    public static final Block BLUE_ASTER = registerBlock("blue_aster",
            new FlowerBlock(StatusEffects.HASTE, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block INDIGO_ASTER = registerBlock("indigo_aster",
            new FlowerBlock(StatusEffects.HASTE, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_ASTER = registerBlock("pink_aster",
            new FlowerBlock(StatusEffects.HASTE, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block VIOLET_ASTER = registerBlock("violet_aster",
            new FlowerBlock(StatusEffects.HASTE, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_ASTER = registerBlock("white_aster",
            new FlowerBlock(StatusEffects.HASTE, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //cyclamen
    public static final Block CYCLAMEN = registerBlock("cyclamen",
            new FlowerBlock(StatusEffects.SLOWNESS, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //dusty miller
    public static final Block DUSTY_MILLER = registerBlock("dusty_miller",
            new FlowerBlock(StatusEffects.SLOWNESS, 10, AbstractBlock.Settings.copy(Blocks.FERN).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //flossflower
    public static final Block BLUE_FLOSSFLOWER = registerBlock("blue_flossflower",
            new FlowerBlock(StatusEffects.SPEED, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_FLOSSFLOWER = registerBlock("magenta_flossflower",
            new FlowerBlock(StatusEffects.SPEED, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_FLOSSFLOWER = registerBlock("pink_flossflower",
            new FlowerBlock(StatusEffects.SPEED, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_FLOSSFLOWER = registerBlock("white_flossflower",
            new FlowerBlock(StatusEffects.SPEED, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //thistle
    public static final Block GLOBE_THISTLE = registerBlock("globe_thistle",
            new FlowerBlock(StatusEffects.INVISIBILITY, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //buttercup
    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(StatusEffects.BLINDNESS, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //daisy
    public static final Block PINK_DAISY = registerBlock("pink_daisy",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_DAISY = registerBlock("yellow_daisy",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_DAISY = registerBlock("white_daisy",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //silver mound
    public static final Block SILVER_MOUND_ARTEMISIA = registerBlock("silver_mound_artemisia",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //heliotrope
    public static final Block SOFT_PINK_HELIOTROPE = registerBlock("soft_pink_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_HELIOTROPE = registerBlock("pink_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_HELIOTROPE = registerBlock("white_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TRANS_HELIOTROPE = registerBlock("trans_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block VIOLET_HELIOTROPE = registerBlock("violet_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_HELIOTROPE = registerBlock("orange_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_HELIOTROPE = registerBlock("black_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ICE_HELIOTROPE = registerBlock("ice_heliotrope",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //gomphrena
    public static final Block GOMPHRENA = registerBlock("gomphrena",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GOMPHRENA_PATCH = registerBlock("gomphrena_patch",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //dahlia
    public static final Block DAHLIA = registerBlock("dahlia",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    //bloodroot
    public static final Block BLOODROOT = registerBlock("bloodroot",
            new FlowerBlock(StatusEffects.LUCK, 10, AbstractBlock.Settings.copy(Blocks.POPPY).nonOpaque().breakInstantly().noCollision().mapColor(DARK_GREEN).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));

    //tall plant
    public static final Block FOUNTAIN_GRASS = registerBlock("fountain_grass",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().breakInstantly().noCollision().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block FOXGLOVE = registerBlock("foxglove",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH).nonOpaque().breakInstantly().noCollision().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block VIOLET_AUBRIETA = registerBlock("violet_aubrieta",
            new FlowerbedBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS).nonOpaque().breakInstantly().noCollision().pistonBehavior(PistonBehavior.DESTROY)));

    //sculk
    public static final Block SCULK_FLORA = registerBlock("sculk_flora",
            new SculkFlowerBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).nonOpaque().noCollision()) {
                @Override
                public StatusEffect getEffectInStew() {return (StatusEffect) StatusEffects.DARKNESS;}
                @Override
                public int getEffectInStewDuration() {return 10;}
            });
    public static final Block SCULK_TENDRIL = registerBlock("sculk_tendril",
            new SculkFlowerBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).nonOpaque().noCollision()) {
                @Override
                public StatusEffect getEffectInStew() {return (StatusEffect) StatusEffects.DARKNESS;}
                @Override
                public int getEffectInStewDuration() {return 10;}
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.hanas_flora.sculk_tendril.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Block SCULK_ROSE = registerBlock("sculk_rose",
            new SculkFlowerBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).nonOpaque().noCollision()) {
                @Override
                public StatusEffect getEffectInStew() {return (StatusEffect) StatusEffects.DARKNESS;}
                @Override
                public int getEffectInStewDuration() {return 10;}
            });
    public static final Block GLOWING_SCULK_WISTERIA = registerBlock("glowing_sculk_wisteria",
            new SculkFlowerBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).nonOpaque().noCollision()) {
                @Override
                public StatusEffect getEffectInStew() {return (StatusEffect) StatusEffects.DARKNESS;}
                @Override
                public int getEffectInStewDuration() {return 10;}
            });
    public static final Block GLOWING_SCULK_WISTERIA_BUNDLE = registerBlock("glowing_sculk_wisteria_bundle",
            new SculkFlowerBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.SCULK).nonOpaque().noCollision()) {
                @Override
                public StatusEffect getEffectInStew() {return (StatusEffect) StatusEffects.DARKNESS;}
                @Override
                public int getEffectInStewDuration() {return 10;}
            });

    //public static final Block WATER_LILY = registerBlock("water_lily",
    //        new WaterFlower(StatusEffects.CONDUIT_POWER, 10, AbstractBlock.Settings.create().sounds(BlockSoundGroup.WET_GRASS).nonOpaque().noCollision().breakInstantly().notSolid()));

    //Potted
    //wisteria
    public static final Block POTTED_GLOWING_WISTERIA = registerBlock("potted_glowing_wisteria",
            new FlowerPotBlock(GLOWING_WISTERIA, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //aconite
    public static final Block POTTED_ACONITE = registerBlock("potted_aconite",
            new FlowerPotBlock(ACONITE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //rose
    public static final Block POTTED_RED_ROSE = registerBlock("potted_red_rose",
            new FlowerPotBlock(RED_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_YELLOW_ROSE = registerBlock("potted_yellow_rose",
            new FlowerPotBlock(YELLOW_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //aster
    public static final Block POTTED_BLUE_ASTER = registerBlock("potted_blue_aster",
            new FlowerPotBlock(BLUE_ASTER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_INDIGO_ASTER = registerBlock("potted_indigo_aster",
            new FlowerPotBlock(INDIGO_ASTER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_PINK_ASTER = registerBlock("potted_pink_aster",
            new FlowerPotBlock(PINK_ASTER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_VIOLET_ASTER = registerBlock("potted_violet_aster",
            new FlowerPotBlock(VIOLET_ASTER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_WHITE_ASTER = registerBlock("potted_white_aster",
            new FlowerPotBlock(WHITE_ASTER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //cyclamen
    public static final Block POTTED_CYCLAMEN = registerBlock("potted_cyclamen",
            new FlowerPotBlock(CYCLAMEN, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //dusty miller
    public static final Block POTTED_DUSTY_MILLER = registerBlock("potted_dusty_miller",
            new FlowerPotBlock(DUSTY_MILLER, AbstractBlock.Settings.copy(Blocks.POTTED_FERN).nonOpaque()));
    //flossflower
    public static final Block POTTED_BLUE_FLOSSFLOWER = registerBlock("potted_blue_flossflower",
            new FlowerPotBlock(BLUE_FLOSSFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_MAGENTA_FLOSSFLOWER = registerBlock("potted_magenta_flossflower",
            new FlowerPotBlock(MAGENTA_FLOSSFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_PINK_FLOSSFLOWER = registerBlock("potted_pink_flossflower",
            new FlowerPotBlock(PINK_FLOSSFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_WHITE_FLOSSFLOWER = registerBlock("potted_white_flossflower",
            new FlowerPotBlock(WHITE_FLOSSFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //
    public static final Block POTTED_GLOBE_THISTLE = registerBlock("potted_globe_thistle",
            new FlowerPotBlock(GLOBE_THISTLE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_BUTTERCUP = registerBlock("potted_buttercup",
            new FlowerPotBlock(BUTTERCUP, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_PINK_DAISY = registerBlock("potted_pink_daisy",
            new FlowerPotBlock(PINK_DAISY, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_YELLOW_DAISY = registerBlock("potted_yellow_daisy",
            new FlowerPotBlock(YELLOW_DAISY, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_WHITE_DAISY = registerBlock("potted_white_daisy",
            new FlowerPotBlock(WHITE_DAISY, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_SILVER_MOUND_ARTEMISIA = registerBlock("potted_silver_mound_artemisia",
            new FlowerPotBlock(SILVER_MOUND_ARTEMISIA, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_SOFT_PINK_HELIOTROPE = registerBlock("potted_soft_pink_heliotrope",
            new FlowerPotBlock(SOFT_PINK_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_PINK_HELIOTROPE = registerBlock("potted_pink_heliotrope",
            new FlowerPotBlock(PINK_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_WHITE_HELIOTROPE = registerBlock("potted_white_heliotrope",
            new FlowerPotBlock(WHITE_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_TRANS_HELIOTROPE = registerBlock("potted_trans_heliotrope",
            new FlowerPotBlock(TRANS_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_VIOLET_HELIOTROPE = registerBlock("potted_violet_heliotrope",
            new FlowerPotBlock(VIOLET_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_ORANGE_HELIOTROPE = registerBlock("potted_orange_heliotrope",
            new FlowerPotBlock(ORANGE_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_BLACK_HELIOTROPE = registerBlock("potted_black_heliotrope",
            new FlowerPotBlock(BLACK_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_ICE_HELIOTROPE = registerBlock("potted_ice_heliotrope",
            new FlowerPotBlock(ICE_HELIOTROPE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_GOMPHRENA = registerBlock("potted_gomphrena",
            new FlowerPotBlock(GOMPHRENA, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    //
    public static final Block POTTED_DAHLIA = registerBlock("potted_dahlia",
            new FlowerPotBlock(DAHLIA, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_BLOODROOT = registerBlock("potted_bloodroot",
            new FlowerPotBlock(BLOODROOT, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block POTTED_SCULK_TENDRIL = registerBlock("potted_sculk_tendril",
            new FlowerPotBlock(SCULK_TENDRIL, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_SCULK_ROSE = Registry.register(Registries.BLOCK, Identifier.of(HanasFlora.MOD_ID, "potted_sculk_rose"),
            new FlowerPotBlock(SCULK_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_GLOWING_SCULK_WISTERIA = registerBlock("potted_glowing_sculk_wisteria",
            new FlowerPotBlock(GLOWING_SCULK_WISTERIA, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block POTTED_GLOWING_SCULK_WISTERIA_BUNDLE = registerBlock("potted_glowing_sculk_wisteria_bundle",
            new FlowerPotBlock(GLOWING_SCULK_WISTERIA_BUNDLE, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HanasFlora.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HanasFlora.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        HanasFlora.LOGGER.info("Registering ModBlocks for " + HanasFlora.MOD_ID);
    }
}
