package sefkesel.howlingsun;

import net.fabricmc.api.ModInitializer;
import sefkesel.howlingsun.blocks.ModBlocks;
import sefkesel.howlingsun.items.ModItems;
import sefkesel.howlingsun.items.ModItemsGroups;
import sefkesel.howlingsun.networking.ModPackets;
import sefkesel.howlingsun.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class HowlingSun implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "howlingsun";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemsGroups.registerItemGroup();

        ModItems.registerModItems();
        ModBlocks.registerModBlock();

        ModWorldGeneration.generateModWorldGen();
        ModPackets.registerC2SPackets();
    }
}