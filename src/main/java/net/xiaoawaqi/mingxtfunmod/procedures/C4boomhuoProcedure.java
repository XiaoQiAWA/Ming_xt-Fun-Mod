package net.xiaoawaqi.mingxtfunmod.procedures;

import net.xiaoawaqi.mingxtfunmod.world.inventory.Ccustomc4powerMenu;
import net.xiaoawaqi.mingxtfunmod.init.MingXtModGameRules;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

public class C4boomhuoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.BLOCKS, 20, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.BLOCKS, 20, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ming_xt:mingxtcpuboom")), SoundSource.BLOCKS, 20, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ming_xt:mingxtcpuboom")), SoundSource.BLOCKS, 20, 1, false);
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
		} else {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Ccustomc4power");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new Ccustomc4powerMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
