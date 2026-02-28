package com.erikkholdern.sandbox;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sandbox implements ModInitializer {
	public static final String MOD_ID = "sandbox";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// When Minecraft starts and is ready for mods, this class runs the following
		// code. This is the method that powers the entire mod's functionality,
		// which is why this is where we register blocks, items, rendering, etc.

		LOGGER.info("Hello Fabric world!");
	}
}