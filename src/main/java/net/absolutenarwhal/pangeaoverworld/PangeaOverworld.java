package net.absolutenarwhal.pangeaoverworld;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PangeaOverworld implements ModInitializer
{
	public static final String MOD_ID = "pangea_overworld";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}