
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.xiaoawaqi.mingxtfunmod.client.gui.MingxtsfaceScreen;
import net.xiaoawaqi.mingxtfunmod.client.gui.Ccustomc4powerScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MingXtModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MingXtModMenus.MINGXTSFACE.get(), MingxtsfaceScreen::new);
			MenuScreens.register(MingXtModMenus.CCUSTOMC_4POWER.get(), Ccustomc4powerScreen::new);
		});
	}
}
