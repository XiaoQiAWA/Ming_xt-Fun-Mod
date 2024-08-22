
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class MingXtModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MingXtMod.MODID);
	public static final RegistryObject<SoundEvent> MINGXTCPUBOOM = REGISTRY.register("mingxtcpuboom", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ming_xt", "mingxtcpuboom")));
}
