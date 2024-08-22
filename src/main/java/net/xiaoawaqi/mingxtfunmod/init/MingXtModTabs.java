
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MingXtModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MingXtMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINGXT_FUN_MOD = REGISTRY.register("mingxt_fun_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ming_xt.mingxt_fun_mod")).icon(() -> new ItemStack(MingXtModBlocks.MINGXTBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MingXtModItems.MINNGXTC4B.get());
				tabData.accept(MingXtModBlocks.MINGXTBLOCK.get().asItem());
				tabData.accept(MingXtModItems.MINGXTAXE.get());
				tabData.accept(MingXtModItems.MINGXTPICKZXE.get());
				tabData.accept(MingXtModItems.MINGXTSWORD.get());
				tabData.accept(MingXtModItems.MINGXTINGOT.get());
				tabData.accept(MingXtModBlocks.C_4.get().asItem());
				tabData.accept(MingXtModBlocks.MINGXTORE.get().asItem());
				tabData.accept(MingXtModItems.MINGXTROWORE.get());
				tabData.accept(MingXtModBlocks.MINGDEEPORE.get().asItem());
				tabData.accept(MingXtModItems.MINGXTWUXIANTURCH.get());
				tabData.accept(MingXtModBlocks.MMINGMEITANX_2.get().asItem());
				tabData.accept(MingXtModBlocks.MINGMEITANX_22.get().asItem());
				tabData.accept(MingXtModItems.MINGXTTORCHX_2.get());
				tabData.accept(MingXtModItems.MINGXTSKUIJIA_HELMET.get());
				tabData.accept(MingXtModItems.MINGXTSKUIJIA_CHESTPLATE.get());
				tabData.accept(MingXtModItems.MINGXTSKUIJIA_LEGGINGS.get());
				tabData.accept(MingXtModItems.MINGXTSKUIJIA_BOOTS.get());
				tabData.accept(MingXtModItems.MINGXTHOME.get());
				tabData.accept(MingXtModItems.MINGXTWUXIANGONG.get());
				tabData.accept(MingXtModItems.PCL.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MingXtModBlocks.MINGXTBLOCK.get().asItem());
			tabData.accept(MingXtModBlocks.MMINGMEITANX_2.get().asItem());
			tabData.accept(MingXtModBlocks.MINGMEITANX_22.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(MingXtModBlocks.C_4.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MingXtModBlocks.C_4.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MingXtModItems.MINGXTSKUIJIA_HELMET.get());
			tabData.accept(MingXtModItems.MINGXTSKUIJIA_CHESTPLATE.get());
			tabData.accept(MingXtModItems.MINGXTSKUIJIA_LEGGINGS.get());
			tabData.accept(MingXtModItems.MINGXTSKUIJIA_BOOTS.get());
			tabData.accept(MingXtModItems.MINGXTWUXIANGONG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MingXtModItems.MINGXTINGOT.get());
			tabData.accept(MingXtModItems.MINGXTROWORE.get());
			tabData.accept(MingXtModItems.MINGXTTORCHX_2.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MingXtModItems.MINNGXTC4B.get());
			tabData.accept(MingXtModItems.MINGXTAXE.get());
			tabData.accept(MingXtModItems.MINGXTPICKZXE.get());
			tabData.accept(MingXtModItems.MINGXTSWORD.get());
			tabData.accept(MingXtModItems.MINGXTWUXIANTURCH.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MingXtModBlocks.MINGXTBLOCK.get().asItem());
			tabData.accept(MingXtModBlocks.MINGXTORE.get().asItem());
			tabData.accept(MingXtModBlocks.MINGDEEPORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(MingXtModItems.PCL.get());
		}
	}
}
