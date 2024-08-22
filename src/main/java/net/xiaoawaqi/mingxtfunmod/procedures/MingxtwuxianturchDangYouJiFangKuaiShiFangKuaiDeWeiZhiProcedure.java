package net.xiaoawaqi.mingxtfunmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MingxtwuxianturchDangYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.TORCH.defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.TORCH.defaultBlockState(), 3);
		}
	}
}
