package net.purejosh.pureemeraldtools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.purejosh.pureemeraldtools.block.ModBlocks;

// This is used to arrange items in creative tabs.
public class ModItemGroups {
    public static void init() {
        // ModItems sorting
        // Blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.DIAMOND_BLOCK.asItem().getDefaultStack(), ModBlocks.PURE_EMERALD_BLOCK.asItem().getDefaultStack()));

        // Tools
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_HOE.getDefaultStack(), ModItems.EMERALD_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_SHOVEL.getDefaultStack(), ModItems.EMERALD_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_PICKAXE.getDefaultStack(), ModItems.EMERALD_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_AXE.getDefaultStack(), ModItems.EMERALD_HOE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.DIAMOND_HOE.getDefaultStack(), ModItems.PURE_EMERALD_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_SHOVEL.getDefaultStack(), ModItems.PURE_EMERALD_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_PICKAXE.getDefaultStack(), ModItems.PURE_EMERALD_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_AXE.getDefaultStack(), ModItems.PURE_EMERALD_HOE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.NETHERITE_HOE.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_NETHERITE_SHOVEL.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_NETHERITE_PICKAXE.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_NETHERITE_AXE.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_HOE.getDefaultStack()));

        // Combat
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_SWORD.getDefaultStack(), ModItems.EMERALD_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_AXE.getDefaultStack(), ModItems.EMERALD_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_BOOTS.getDefaultStack(), ModItems.EMERALD_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_HELMET.getDefaultStack(), ModItems.EMERALD_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_CHESTPLATE.getDefaultStack(), ModItems.EMERALD_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_LEGGINGS.getDefaultStack(), ModItems.EMERALD_BOOTS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.IRON_HORSE_ARMOR.getDefaultStack(), ModItems.EMERALD_HORSE_ARMOR.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.DIAMOND_SWORD.getDefaultStack(), ModItems.PURE_EMERALD_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.DIAMOND_AXE.getDefaultStack(), ModItems.PURE_EMERALD_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.DIAMOND_BOOTS.getDefaultStack(), ModItems.PURE_EMERALD_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_HELMET.getDefaultStack(), ModItems.PURE_EMERALD_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_CHESTPLATE.getDefaultStack(), ModItems.PURE_EMERALD_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.PURE_EMERALD_LEGGINGS.getDefaultStack(), ModItems.PURE_EMERALD_BOOTS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.NETHERITE_SWORD.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.NETHERITE_AXE.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
               Items.NETHERITE_BOOTS.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
               ModItems.PURE_EMERALD_NETHERITE_HELMET.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
               ModItems.PURE_EMERALD_NETHERITE_CHESTPLATE.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
               ModItems.PURE_EMERALD_NETHERITE_LEGGINGS.getDefaultStack(), ModItems.PURE_EMERALD_NETHERITE_BOOTS.getDefaultStack()));

        // Food
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.APPLE.getDefaultStack(), ModItems.EMERALD_APPLE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_APPLE.getDefaultStack(), ModItems.PURE_EMERALD_APPLE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.CARROT.getDefaultStack(), ModItems.EMERALD_CARROT.getDefaultStack()));

        // Ingredients
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                Items.EMERALD.getDefaultStack(), ModItems.EMERALD_SHARD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.EMERALD_SHARD.getDefaultStack(), ModItems.PURE_EMERALD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addBefore(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(), ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE.getDefaultStack()));
    }
}
