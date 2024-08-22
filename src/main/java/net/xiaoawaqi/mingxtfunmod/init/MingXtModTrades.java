
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.xiaoawaqi.mingxtfunmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MingXtModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == MingXtModVillagerProfessions.MINGXTVILAGE.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.NETHERITE_BLOCK, 5),

					new ItemStack(Items.ELYTRA), 2, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.IRON_BLOCK, 10),

					new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.COAL_BLOCK, 10),

					new ItemStack(Blocks.DIAMOND_ORE, 5), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 2), new ItemStack(MingXtModItems.MINGXTINGOT.get(), 2), new ItemStack(Items.ENDER_PEARL, 8), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 5), new ItemStack(MingXtModBlocks.MINGXTBLOCK.get()), new ItemStack(Blocks.DIAMOND_BLOCK), 10, 5, 0.05f));
		}
	}
}
