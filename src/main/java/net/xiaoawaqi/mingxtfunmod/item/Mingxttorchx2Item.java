
package net.xiaoawaqi.mingxtfunmod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class Mingxttorchx2Item extends Item {
	public Mingxttorchx2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u8BE5\u7269\u54C1\u4E3A\u5408\u6210\u7528\uFF0C\u65E0\u4EFB\u4F55\u7279\u6B8A\u529F\u80FD"));
	}
}
