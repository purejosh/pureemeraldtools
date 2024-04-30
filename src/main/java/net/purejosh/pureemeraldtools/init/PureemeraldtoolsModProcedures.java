
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureemeraldtools.init;

import net.purejosh.pureemeraldtools.procedures.PureEmeraldArmorTickEventProcedure;
import net.purejosh.pureemeraldtools.procedures.EmeraldNetheriteArmorTickEventProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PureemeraldtoolsModProcedures {
	public static void load() {
		new PureEmeraldArmorTickEventProcedure();
		new EmeraldNetheriteArmorTickEventProcedure();
	}
}
