package net.hana.hanas_flora.util;

import net.hana.hanas_flora.HanasFlora;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WATER_PLANT_CAN_SURVIVE_ON =
                createTag("water_plant_can_survive_on");
        public static final TagKey<Block> SHRUB_CAN_SURVIVE_ON =
                createTag("shrub_can_survive_on");
        public static final TagKey<Block> SCULK_PLANTABLE_BLOCKS =
                createTag("sculk_plantable_blocks");
        public static final TagKey<Block> WATER_PLANT_PLANTABLE_BLOCKS =
                createTag("water_plant_plantable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HanasFlora.MOD_ID, name));
        }
    }
}
