package net.purejosh.pureemeraldtools.entity.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.purejosh.pureemeraldtools.PureEmeraldTools;

public class ModStatusEffects {

    public static final RegistryEntry<StatusEffect> POISON_WARDING;

    public ModStatusEffects() {
    }

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(PureEmeraldTools.MOD_ID, id), statusEffect);
    }

    static {
        POISON_WARDING = register("poison_warding", new PoisonWardingStatusEffect(StatusEffectCategory.BENEFICIAL, 0xC71585));
    }
}
