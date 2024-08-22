package net.xiaoawaqi.mingxtfunmod.procedures;

import net.xiaoawaqi.mingxtfunmod.init.MingXtModGameRules;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class C4boomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ming_xt:mingxtcpuboom")), SoundSource.BLOCKS, 20, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ming_xt:mingxtcpuboom")), SoundSource.BLOCKS, 20, 1, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.BLOCKS, 20, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.BLOCKS, 20, 1, false);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		MingXtMod.queueServerWork(60, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, (world.getLevelData().getGameRules().getInt(MingXtModGameRules.C_4_EXPLOSIVE_POWER_SET)), Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.BLOCKS, 20, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.BLOCKS, 20, 1, false);
				}
			}
			MingXtMod.queueServerWork(60, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) ((world.getLevelData().getGameRules().getInt(MingXtModGameRules.C_4_EXPLOSIVE_POWER_SET)) * 2), Level.ExplosionInteraction.TNT);
			});
		});
	}
}
