package net.hana.hanas_flora.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {

        ModTreeGeneration.generateTrees();
        ModFlowerGeneration.generateFlowers();
    }
}