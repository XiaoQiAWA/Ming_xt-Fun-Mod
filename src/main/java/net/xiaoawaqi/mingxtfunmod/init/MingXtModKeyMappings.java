
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import org.lwjgl.glfw.GLFW;

import net.xiaoawaqi.mingxtfunmod.network.MingxtfacekeyMessage;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MingXtModKeyMappings {
	public static final KeyMapping MINGXTFACEKEY = new KeyMapping("key.ming_xt.mingxtfacekey", GLFW.GLFW_KEY_F12, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MINGXTFACEKEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MINGXTFACEKEY_LASTPRESS);
				MingXtMod.PACKET_HANDLER.sendToServer(new MingxtfacekeyMessage(1, dt));
				MingxtfacekeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long MINGXTFACEKEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MINGXTFACEKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MINGXTFACEKEY.consumeClick();
			}
		}
	}
}
