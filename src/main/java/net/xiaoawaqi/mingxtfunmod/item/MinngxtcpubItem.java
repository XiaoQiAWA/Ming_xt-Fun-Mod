
package net.xiaoawaqi.mingxtfunmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MinngxtcpubItem extends RecordItem {
	public MinngxtcpubItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ming_xt:mingxtcpuboom")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 80);
	}
}
