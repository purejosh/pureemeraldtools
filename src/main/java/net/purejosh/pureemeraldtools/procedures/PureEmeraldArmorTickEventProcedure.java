package net.purejosh.pureemeraldtools.procedures;

import net.purejosh.pureemeraldtools.init.PureemeraldtoolsModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class PureEmeraldArmorTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.POISON)) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == PureemeraldtoolsModItems.PURE_EMERALD_ARMOR_HELMET
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == PureemeraldtoolsModItems.PURE_EMERALD_ARMOR_CHESTPLATE
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == PureemeraldtoolsModItems.PURE_EMERALD_ARMOR_LEGGINGS
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PureemeraldtoolsModItems.PURE_EMERALD_ARMOR_BOOTS) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.POISON);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.COMPOSTER, x, (y + 1), z, 16, 0.3, 0.5, 0.3, 0.5);
			}
		}
	}
}
