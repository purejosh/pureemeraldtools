package net.purejosh.pureemeraldtools.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.purejosh.pureemeraldtools.PureEmeraldTools;
import net.purejosh.pureemeraldtools.sound.ModSounds;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> EMERALD = register("emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 9);
            }), 10, 0.5F, 0.0F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_EMERALD), () -> Ingredient.ofItems(Items.EMERALD));

    public static final int EMERALD_DURABILITY = 23;

    public static final RegistryEntry<ArmorMaterial> PURE_EMERALD = register("pure_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 12, 2.0F, 0.0F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_PURE_EMERALD), () -> Ingredient.ofItems(ModItems.PURE_EMERALD));

    public static final int PURE_EMERALD_DURABILITY = 35;

    public static final RegistryEntry<ArmorMaterial> PURE_EMERALD_NETHERITE = register("pure_emerald_netherite",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 18, 3.0F, 0.1F,
            RegistryEntry.of(ModSounds.ITEM_ARMOR_EQUIP_PURE_EMERALD_NETHERITE), () -> Ingredient.ofItems(Items.NETHERITE_SCRAP));

    public static final int PURE_EMERALD_NETHERITE_DURABILITY = 40;

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchant,
            float tough,
            float knockback,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairItem
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(PureEmeraldTools.MOD_ID, id)));
        return register(id, defense, enchant, tough, knockback, equipSound, repairItem, list);
    }

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchant,
            float tough,
            float knockback,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairItem,
            List<ArmorMaterial.Layer> layers
    ) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }

        return Registry.registerReference(
                Registries.ARMOR_MATERIAL, Identifier.of(PureEmeraldTools.MOD_ID, id),
                new ArmorMaterial(enumMap, enchant, equipSound, repairItem, layers, tough, knockback)
        );
    }

    // Initialization called from the entrypoint, as this armor material needs to be added to the registry.
    public static void init() {
    }
}
