package sefkesel.howlingsun.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import sefkesel.howlingsun.world.ModPlacedFeatures;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

    }
    public static class ModOreGeneration {
        public static void generateOres() {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SILVER_ORE_PLACED_KEY);
        }
    }
}
