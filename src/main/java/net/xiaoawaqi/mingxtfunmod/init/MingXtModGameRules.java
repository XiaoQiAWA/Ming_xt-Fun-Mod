
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MingXtModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> C_4_EXPLOSIVE_POWER_SET = GameRules.register("c4ExplosivePowerSet", GameRules.Category.PLAYER, GameRules.IntegerValue.create(45));
}
