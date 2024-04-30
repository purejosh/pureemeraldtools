
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureemeraldtools.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PureemeraldtoolsModSounds {
	public static SoundEvent EQUIP_EMERALD = SoundEvent.createVariableRangeEvent(new ResourceLocation("pureemeraldtools", "equip_emerald"));
	public static SoundEvent EQUIP_EMERALD_NETHERITE = SoundEvent.createVariableRangeEvent(new ResourceLocation("pureemeraldtools", "equip_emerald_netherite"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pureemeraldtools", "equip_emerald"), EQUIP_EMERALD);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pureemeraldtools", "equip_emerald_netherite"), EQUIP_EMERALD_NETHERITE);
	}
}
