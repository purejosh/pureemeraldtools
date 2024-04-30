/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureemeraldtools.init;

import net.purejosh.pureemeraldtools.item.PureEmeraldSwordItem;
import net.purejosh.pureemeraldtools.item.PureEmeraldShovelItem;
import net.purejosh.pureemeraldtools.item.PureEmeraldPickaxeItem;
import net.purejosh.pureemeraldtools.item.PureEmeraldItem;
import net.purejosh.pureemeraldtools.item.PureEmeraldHoeItem;
import net.purejosh.pureemeraldtools.item.PureEmeraldAxeItem;
import net.purejosh.pureemeraldtools.item.PureEmeraldArmorItem;
import net.purejosh.pureemeraldtools.item.EmeraldSwordItem;
import net.purejosh.pureemeraldtools.item.EmeraldShovelItem;
import net.purejosh.pureemeraldtools.item.EmeraldPickaxeItem;
import net.purejosh.pureemeraldtools.item.EmeraldNetheriteSwordItem;
import net.purejosh.pureemeraldtools.item.EmeraldNetheriteShovelItem;
import net.purejosh.pureemeraldtools.item.EmeraldNetheritePickaxeItem;
import net.purejosh.pureemeraldtools.item.EmeraldNetheriteHoeItem;
import net.purejosh.pureemeraldtools.item.EmeraldNetheriteAxeItem;
import net.purejosh.pureemeraldtools.item.EmeraldNetheriteArmorItem;
import net.purejosh.pureemeraldtools.item.EmeraldHoeItem;
import net.purejosh.pureemeraldtools.item.EmeraldAxeItem;
import net.purejosh.pureemeraldtools.item.EmeraldArmorItem;
import net.purejosh.pureemeraldtools.PureemeraldtoolsMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PureemeraldtoolsModItems {
	public static Item EMERALD_SWORD;
	public static Item EMERALD_ARMOR_HELMET;
	public static Item EMERALD_ARMOR_CHESTPLATE;
	public static Item EMERALD_ARMOR_LEGGINGS;
	public static Item EMERALD_ARMOR_BOOTS;
	public static Item PURE_EMERALD_SWORD;
	public static Item PURE_EMERALD_ARMOR_HELMET;
	public static Item PURE_EMERALD_ARMOR_CHESTPLATE;
	public static Item PURE_EMERALD_ARMOR_LEGGINGS;
	public static Item PURE_EMERALD_ARMOR_BOOTS;
	public static Item EMERALD_NETHERITE_SWORD;
	public static Item EMERALD_NETHERITE_ARMOR_HELMET;
	public static Item EMERALD_NETHERITE_ARMOR_CHESTPLATE;
	public static Item EMERALD_NETHERITE_ARMOR_LEGGINGS;
	public static Item EMERALD_NETHERITE_ARMOR_BOOTS;
	public static Item EMERALD_SHOVEL;
	public static Item EMERALD_PICKAXE;
	public static Item EMERALD_AXE;
	public static Item EMERALD_HOE;
	public static Item PURE_EMERALD_SHOVEL;
	public static Item PURE_EMERALD_PICKAXE;
	public static Item PURE_EMERALD_AXE;
	public static Item PURE_EMERALD_HOE;
	public static Item EMERALD_NETHERITE_SHOVEL;
	public static Item EMERALD_NETHERITE_PICKAXE;
	public static Item EMERALD_NETHERITE_AXE;
	public static Item EMERALD_NETHERITE_HOE;
	public static Item PURE_EMERALD;
	public static Item PURE_EMERALD_BLOCK;

	public static void load() {
		EMERALD_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_sword"), new EmeraldSwordItem());
		EMERALD_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_helmet"), new EmeraldArmorItem.Helmet());
		EMERALD_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_chestplate"), new EmeraldArmorItem.Chestplate());
		EMERALD_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_leggings"), new EmeraldArmorItem.Leggings());
		EMERALD_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_armor_boots"), new EmeraldArmorItem.Boots());
		PURE_EMERALD_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_sword"), new PureEmeraldSwordItem());
		PURE_EMERALD_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_armor_helmet"), new PureEmeraldArmorItem.Helmet());
		PURE_EMERALD_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_armor_chestplate"), new PureEmeraldArmorItem.Chestplate());
		PURE_EMERALD_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_armor_leggings"), new PureEmeraldArmorItem.Leggings());
		PURE_EMERALD_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_armor_boots"), new PureEmeraldArmorItem.Boots());
		EMERALD_NETHERITE_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_sword"), new EmeraldNetheriteSwordItem());
		EMERALD_NETHERITE_ARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_armor_helmet"), new EmeraldNetheriteArmorItem.Helmet());
		EMERALD_NETHERITE_ARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_armor_chestplate"), new EmeraldNetheriteArmorItem.Chestplate());
		EMERALD_NETHERITE_ARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_armor_leggings"), new EmeraldNetheriteArmorItem.Leggings());
		EMERALD_NETHERITE_ARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_armor_boots"), new EmeraldNetheriteArmorItem.Boots());
		EMERALD_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_shovel"), new EmeraldShovelItem());
		EMERALD_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_pickaxe"), new EmeraldPickaxeItem());
		EMERALD_AXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_axe"), new EmeraldAxeItem());
		EMERALD_HOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_hoe"), new EmeraldHoeItem());
		PURE_EMERALD_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_shovel"), new PureEmeraldShovelItem());
		PURE_EMERALD_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_pickaxe"), new PureEmeraldPickaxeItem());
		PURE_EMERALD_AXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_axe"), new PureEmeraldAxeItem());
		PURE_EMERALD_HOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_hoe"), new PureEmeraldHoeItem());
		EMERALD_NETHERITE_SHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_shovel"), new EmeraldNetheriteShovelItem());
		EMERALD_NETHERITE_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_pickaxe"), new EmeraldNetheritePickaxeItem());
		EMERALD_NETHERITE_AXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_axe"), new EmeraldNetheriteAxeItem());
		EMERALD_NETHERITE_HOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "emerald_netherite_hoe"), new EmeraldNetheriteHoeItem());
		PURE_EMERALD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald"), new PureEmeraldItem());
		PURE_EMERALD_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PureemeraldtoolsMod.MODID, "pure_emerald_block"), new BlockItem(PureemeraldtoolsModBlocks.PURE_EMERALD_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PURE_EMERALD_BLOCK));
	}

	public static void clientLoad() {
	}
}
