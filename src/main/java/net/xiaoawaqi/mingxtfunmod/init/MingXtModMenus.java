
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.xiaoawaqi.mingxtfunmod.world.inventory.MingxtsfaceMenu;
import net.xiaoawaqi.mingxtfunmod.world.inventory.Ccustomc4powerMenu;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class MingXtModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MingXtMod.MODID);
	public static final RegistryObject<MenuType<MingxtsfaceMenu>> MINGXTSFACE = REGISTRY.register("mingxtsface", () -> IForgeMenuType.create(MingxtsfaceMenu::new));
	public static final RegistryObject<MenuType<Ccustomc4powerMenu>> CCUSTOMC_4POWER = REGISTRY.register("ccustomc_4power", () -> IForgeMenuType.create(Ccustomc4powerMenu::new));
}
