
package net.xiaoawaqi.mingxtfunmod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PCLItem extends Item {
	public PCLItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(4f).alwaysEat().build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u770B\u8D77\u6765\u5F88\u597D\u5403\uFF01"));
	}
}
