
package net.xiaoawaqi.mingxtfunmod.item;

import net.xiaoawaqi.mingxtfunmod.init.MingXtModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class MingxtaxeItem extends AxeItem {
	public MingxtaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MingXtModItems.MINGXTINGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
