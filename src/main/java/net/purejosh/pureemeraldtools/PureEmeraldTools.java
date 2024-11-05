package net.purejosh.pureemeraldtools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.purejosh.pureemeraldtools.block.ModBlocks;
import net.purejosh.pureemeraldtools.item.ModArmorMaterials;
import net.purejosh.pureemeraldtools.item.ModItemGroups;
import net.purejosh.pureemeraldtools.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureEmeraldTools implements ModInitializer {
	public static final String MOD_ID = "pureemeraldtools";
	public static final String MOD_NAME = "Pure Emerald Tools";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// This code is executed when the mod is loaded.
	@Override
	public void onInitialize() {

		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info(PureEmeraldTools.MOD_NAME + " by purejosh has been loaded!");

		// Now, I call the init methods in the registry classes.
		ModArmorMaterials.init();
		ModItems.init();
		ModBlocks.init();
		ModItemGroups.init();
	}

	// This is used in the configured features and placed features registry. No idea why.
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
