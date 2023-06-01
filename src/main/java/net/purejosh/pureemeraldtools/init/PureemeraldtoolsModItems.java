
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureemeraldtools.init;

import net.purejosh.pureemeraldtools.item.Emerald_SwordItem;
import net.purejosh.pureemeraldtools.item.Emerald_ShovelItem;
import net.purejosh.pureemeraldtools.item.Emerald_PickaxeItem;
import net.purejosh.pureemeraldtools.item.Emerald_HoeItem;
import net.purejosh.pureemeraldtools.item.Emerald_AxeItem;
import net.purejosh.pureemeraldtools.item.Emerald_ArmorItem;
import net.purejosh.pureemeraldtools.PureemeraldtoolsMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PureemeraldtoolsModItems {
	public static Item EMERALD_AXE;
	public static Item EMERALD_PICKAXE;
	public static Item EMERALD_SWORD;
	public static Item EMERALD_SHOVEL;
	public static Item EMERALD_HOE;
	public static Item EMERALD_ARMOR_HELMET;
	public static Item EMERALD_ARMOR_CHESTPLATE;
	public static Item EMERALD_ARMOR_LEGGINGS;
	public static Item EMERALD_ARMOR_BOOTS;

	public static void load() {
		EMERALD_AXE = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_axe"), new Emerald_AxeItem());
		EMERALD_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_pickaxe"), new Emerald_PickaxeItem());
		EMERALD_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_sword"), new Emerald_SwordItem());
		EMERALD_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_shovel"), new Emerald_ShovelItem());
		EMERALD_HOE = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_hoe"), new Emerald_HoeItem());
		EMERALD_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_helmet"), new Emerald_ArmorItem.Helmet());
		EMERALD_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_chestplate"), new Emerald_ArmorItem.Chestplate());
		EMERALD_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_leggings"), new Emerald_ArmorItem.Leggings());
		EMERALD_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_boots"), new Emerald_ArmorItem.Boots());
	}
}
