
package net.xiaoawaqi.mingxtfunmod.item;

import net.xiaoawaqi.mingxtfunmod.init.MingXtModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MingxtswordItem extends SwordItem {
	public MingxtswordItem() {
		super(new Tier() {
			public int getUses() {
				return 150;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MingXtModItems.MINGXTINGOT.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
