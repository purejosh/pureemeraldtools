
package net.purejosh.pureemeraldtools.item;

import net.purejosh.pureemeraldtools.init.PureemeraldtoolsModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.AxeItem;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PureEmeraldAxeItem extends AxeItem {
	public PureEmeraldAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1656;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PureemeraldtoolsModItems.PURE_EMERALD));
			}
		}, 1, -3f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
