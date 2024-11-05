package net.purejosh.pureemeraldtools.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.purejosh.pureemeraldtools.PureEmeraldTools;
import net.purejosh.pureemeraldtools.component.type.ModFoodComponents;

import java.util.List;

public class ModItems {
    // Swords and tools
    public static final Item EMERALD_SWORD = register("emerald_sword", new SwordItem(ModToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD,3, -2.4f))));
    public static final Item EMERALD_SHOVEL = register("emerald_shovel", new ShovelItem(ModToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD,1.5f, -3.0f))));
    public static final Item EMERALD_PICKAXE = register("emerald_pickaxe", new PickaxeItem(ModToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD,1.0f, -2.8f))));
    public static final Item EMERALD_AXE = register("emerald_axe", new AxeItem(ModToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EMERALD,6.0f, -3.1f))));
    public static final Item EMERALD_HOE = register("emerald_hoe", new HoeItem(ModToolMaterials.EMERALD, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EMERALD,-2.0f, -1.0f))));

    public static final Item PURE_EMERALD_SWORD = register("pure_emerald_sword", new SwordItem(ModToolMaterials.PURE_EMERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD,4, -2.4f))));
    public static final Item PURE_EMERALD_SHOVEL = register("pure_emerald_shovel", new ShovelItem(ModToolMaterials.PURE_EMERALD, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD,2.5f, -3.0f))));
    public static final Item PURE_EMERALD_PICKAXE = register("pure_emerald_pickaxe", new PickaxeItem(ModToolMaterials.PURE_EMERALD, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD,2.0f, -2.8f))));
    public static final Item PURE_EMERALD_AXE = register("pure_emerald_axe", new AxeItem(ModToolMaterials.PURE_EMERALD, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD,6.0f, -3.0f))));
    public static final Item PURE_EMERALD_HOE = register("pure_emerald_hoe", new HoeItem(ModToolMaterials.PURE_EMERALD, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD,-2.0f, 0.0f))));

    public static final Item PURE_EMERALD_NETHERITE_SWORD = register("pure_emerald_netherite_sword", new SwordItem(ModToolMaterials.PURE_EMERALD_NETHERITE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD_NETHERITE,5, -2.4f))));
    public static final Item PURE_EMERALD_NETHERITE_SHOVEL = register("pure_emerald_netherite_shovel", new ShovelItem(ModToolMaterials.PURE_EMERALD_NETHERITE, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD_NETHERITE,3.5f, -3.0f))));
    public static final Item PURE_EMERALD_NETHERITE_PICKAXE = register("pure_emerald_netherite_pickaxe", new PickaxeItem(ModToolMaterials.PURE_EMERALD_NETHERITE, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD_NETHERITE,3.0f, -2.8f))));
    public static final Item PURE_EMERALD_NETHERITE_AXE = register("pure_emerald_netherite_axe", new AxeItem(ModToolMaterials.PURE_EMERALD_NETHERITE, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD_NETHERITE,7.0f, -3.0f))));
    public static final Item PURE_EMERALD_NETHERITE_HOE = register("pure_emerald_netherite_hoe", new HoeItem(ModToolMaterials.PURE_EMERALD_NETHERITE, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURE_EMERALD_NETHERITE,-2.0f, 0.0f))));

    // Armor
    public static final Item EMERALD_HELMET = register("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.EMERALD_DURABILITY))));
    public static final Item EMERALD_CHESTPLATE = register("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.EMERALD_DURABILITY))));
    public static final Item EMERALD_LEGGINGS = register("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.EMERALD_DURABILITY))));
    public static final Item EMERALD_BOOTS = register("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.EMERALD_DURABILITY))));

    public static final Item PURE_EMERALD_HELMET = register("pure_emerald_helmet", new ArmorItem(ModArmorMaterials.PURE_EMERALD, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.PURE_EMERALD_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD_CHESTPLATE = register("pure_emerald_chestplate", new ModArmorSetBonus(ModArmorMaterials.PURE_EMERALD, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.PURE_EMERALD_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD_LEGGINGS = register("pure_emerald_leggings", new ArmorItem(ModArmorMaterials.PURE_EMERALD, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.PURE_EMERALD_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD_BOOTS = register("pure_emerald_boots", new ArmorItem(ModArmorMaterials.PURE_EMERALD, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.PURE_EMERALD_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item PURE_EMERALD_NETHERITE_HELMET = register("pure_emerald_netherite_helmet", new ArmorItem(ModArmorMaterials.PURE_EMERALD_NETHERITE, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.PURE_EMERALD_NETHERITE_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD_NETHERITE_CHESTPLATE = register("pure_emerald_netherite_chestplate", new ModArmorSetBonus(ModArmorMaterials.PURE_EMERALD_NETHERITE, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.PURE_EMERALD_NETHERITE_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD_NETHERITE_LEGGINGS = register("pure_emerald_netherite_leggings", new ArmorItem(ModArmorMaterials.PURE_EMERALD_NETHERITE, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.PURE_EMERALD_NETHERITE_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD_NETHERITE_BOOTS = register("pure_emerald_netherite_boots", new ArmorItem(ModArmorMaterials.PURE_EMERALD_NETHERITE, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.PURE_EMERALD_NETHERITE_DURABILITY))){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus"));
            tooltip.add(Text.translatable("item.pureemeraldtools.pure_emerald_set_bonus_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    // Horse Armor
    public static final Item EMERALD_HORSE_ARMOR = register(
            "emerald_horse_armor", new AnimalArmorItem(ModArmorMaterials.EMERALD, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    // Miscellaneous items
    public static final Item EMERALD_APPLE = register("emerald_apple", new Item(new Item.Settings()
            .rarity(Rarity.RARE).food(ModFoodComponents.EMERALD_APPLE)));
    public static final Item PURE_EMERALD_APPLE = register("pure_emerald_apple", new Item(new Item.Settings()
            .rarity(Rarity.EPIC).food(ModFoodComponents.PURE_EMERALD_APPLE).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final Item EMERALD_CARROT = register("emerald_carrot", new Item(new Item.Settings()
            .food(ModFoodComponents.EMERALD_CARROT)));
    public static final Item EMERALD_SHARD = register("emerald_shard", new Item(new Item.Settings()));
    public static final Item EMERALD_UPGRADE_SMITHING_TEMPLATE = register("emerald_upgrade_smithing_template", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.pureemeraldtools.emerald_upgrade_smithing_template_2"));
            tooltip.add(Text.translatable("item.pureemeraldtools.blank_line"));
            tooltip.add(Text.translatable("item.pureemeraldtools.applies_to"));
            tooltip.add(Text.translatable("item.pureemeraldtools.emerald_upgrade_smithing_template_3"));
            tooltip.add(Text.translatable("item.pureemeraldtools.ingredients"));
            tooltip.add(Text.translatable("item.pureemeraldtools.emerald_upgrade_smithing_template_4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item PURE_EMERALD = register("pure_emerald", new Item(new Item.Settings()));

    // Helper method for registering an item.
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PureEmeraldTools.MOD_ID, id), item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
