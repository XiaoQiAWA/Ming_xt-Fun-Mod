package net.xiaoawaqi.mingxtfunmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class MingxttansheDanSheWuJiZhongFangKuaiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.TORCH.defaultBlockState(), 3);
		}
		if ((entity.level().dimension()) == Level.NETHER) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.TORCH.defaultBlockState(), 3);
		}
		if ((entity.level().dimension()) == Level.END) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.TORCH.defaultBlockState(), 3);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("ming_xt:mingxthome"))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.TORCH.defaultBlockState(), 3);
		}
	}
}
