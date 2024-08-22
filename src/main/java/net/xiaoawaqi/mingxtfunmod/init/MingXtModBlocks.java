
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.xiaoawaqi.mingxtfunmod.block.Mmingmeitanx2Block;
import net.xiaoawaqi.mingxtfunmod.block.MingxtoreBlock;
import net.xiaoawaqi.mingxtfunmod.block.MingxthomePortalBlock;
import net.xiaoawaqi.mingxtfunmod.block.MingxtblockBlock;
import net.xiaoawaqi.mingxtfunmod.block.Mingmeitanx22Block;
import net.xiaoawaqi.mingxtfunmod.block.MingdeeporeBlock;
import net.xiaoawaqi.mingxtfunmod.block.C4Block;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class MingXtModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MingXtMod.MODID);
	public static final RegistryObject<Block> MINGXTBLOCK = REGISTRY.register("mingxtblock", () -> new MingxtblockBlock());
	public static final RegistryObject<Block> C_4 = REGISTRY.register("c_4", () -> new C4Block());
	public static final RegistryObject<Block> MINGXTORE = REGISTRY.register("mingxtore", () -> new MingxtoreBlock());
	public static final RegistryObject<Block> MINGDEEPORE = REGISTRY.register("mingdeepore", () -> new MingdeeporeBlock());
	public static final RegistryObject<Block> MMINGMEITANX_2 = REGISTRY.register("mmingmeitanx_2", () -> new Mmingmeitanx2Block());
	public static final RegistryObject<Block> MINGMEITANX_22 = REGISTRY.register("mingmeitanx_22", () -> new Mingmeitanx22Block());
	public static final RegistryObject<Block> MINGXTHOME_PORTAL = REGISTRY.register("mingxthome_portal", () -> new MingxthomePortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
