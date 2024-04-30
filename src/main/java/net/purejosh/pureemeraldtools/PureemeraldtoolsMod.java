/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.purejosh.pureemeraldtools;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.purejosh.pureemeraldtools.init.PureemeraldtoolsModSounds;
import net.purejosh.pureemeraldtools.init.PureemeraldtoolsModProcedures;
import net.purejosh.pureemeraldtools.init.PureemeraldtoolsModItems;
import net.purejosh.pureemeraldtools.init.PureemeraldtoolsModBlocks;

import net.fabricmc.api.ModInitializer;

public class PureemeraldtoolsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "pureemeraldtools";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PureemeraldtoolsMod");

		PureemeraldtoolsModBlocks.load();
		PureemeraldtoolsModItems.load();

		PureemeraldtoolsModProcedures.load();

		PureemeraldtoolsModSounds.load();

	}
}
