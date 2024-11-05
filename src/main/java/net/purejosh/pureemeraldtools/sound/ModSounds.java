package net.purejosh.pureemeraldtools.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.purejosh.pureemeraldtools.PureEmeraldTools;

public class ModSounds {

    public static final SoundEvent ITEM_ARMOR_EQUIP_EMERALD = registerSoundEvent("item.armor.equip_emerald");
    public static final SoundEvent ITEM_ARMOR_EQUIP_PURE_EMERALD = registerSoundEvent("item.armor.equip_pure_emerald");
    public static final SoundEvent ITEM_ARMOR_EQUIP_PURE_EMERALD_NETHERITE = registerSoundEvent("item.armor.equip_pure_emerald_netherite");

    // Helper method for registering a sound event.
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(PureEmeraldTools.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
