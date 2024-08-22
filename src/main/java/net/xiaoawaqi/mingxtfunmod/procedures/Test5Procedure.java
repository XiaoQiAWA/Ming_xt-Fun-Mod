package net.xiaoawaqi.mingxtfunmod.procedures;

import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Test5Procedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		MingXtMod.LOGGER.info((Component.translatable("log.mingxtfunmod.installed").getString()));
		MingXtMod.LOGGER.info((Component.translatable("log.mingxtfunmod.installed2").getString()));
	}
}
