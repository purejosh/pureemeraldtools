package net.purejosh.pureemeraldtools.block;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.purejosh.pureemeraldtools.PureEmeraldTools;

public class ModBlocks {
    // Register new blocks, and set their properties all in one. This helps me reduce the amount of files in my code.
    public static final Block PURE_EMERALD_BLOCK = register("pure_emerald_block", new Block(
            Settings.copy(Blocks.EMERALD_BLOCK)), true);

    // Helper methods
    // This is used to create an item version of a block. An item of a block is what you see in your inventory.
    public static Block register(String name, Block block, boolean shouldRegisterItem) {
        // This creates an id consisting of the mod id and the name of the block.
        Identifier id = Identifier.of(PureEmeraldTools.MOD_ID, name);
        // Some blocks may not have an item version of them, such as air. Use this boolean to control that.
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    // Class initializer.
    public static void init() {
    }
}