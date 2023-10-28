package sefkesel;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sefkesel.blocks.ModBlocks;
import sefkesel.entities.ModEntities;
import sefkesel.entities.custom.HowlerEntity;
import sefkesel.items.ModItems;
import sefkesel.items.ModItemsGroups;
import sefkesel.networking.ModMessages;
import sefkesel.sounds.ModSounds;
import sefkesel.world.gen.ModWorldGeneration;

public class HowlingSun implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "howlingsun";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemsGroups.registerItemGroup();

		ModItems.registerModItems();
		ModBlocks.registerModBlock();
		ModSounds.registerSounds();
		ModEntities.registerModEntities();

		ModMessages.registerC2SPackets();

		ModWorldGeneration.generateModWorldGen();
		FabricDefaultAttributeRegistry.register(ModEntities.HOWLER, HowlerEntity.createHowlerAttributes());

	}
}