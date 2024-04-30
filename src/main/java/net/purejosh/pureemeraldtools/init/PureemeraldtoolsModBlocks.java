
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureemeraldtools.init;

import net.purejosh.pureemeraldtools.block.PureEmeraldBlockBlock;
import net.purejosh.pureemeraldtools.PureemeraldtoolsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PureemeraldtoolsModBlocks {
	public static Block PURE_EMERALD_BLOCK;

	public static void load() {
		PURE_EMERALD_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_block"), new PureEmeraldBlockBlock());
	}

	public static void clientLoad() {
		PureEmeraldBlockBlock.clientInit();
	}
}
