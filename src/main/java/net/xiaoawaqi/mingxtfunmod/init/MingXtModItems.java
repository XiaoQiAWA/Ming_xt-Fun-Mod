
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoawaqi.mingxtfunmod.init;

import net.xiaoawaqi.mingxtfunmod.item.TestItem;
import net.xiaoawaqi.mingxtfunmod.item.PCLItem;
import net.xiaoawaqi.mingxtfunmod.item.MinngxtcpubItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxtwuxianturchItem;
import net.xiaoawaqi.mingxtfunmod.item.Mingxttorchx2Item;
import net.xiaoawaqi.mingxtfunmod.item.MingxtswordItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxtskuijiaItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxtroworeItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxtpickzxeItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxtingotItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxthomeItem;
import net.xiaoawaqi.mingxtfunmod.item.MingxtaxeItem;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class MingXtModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MingXtMod.MODID);
	public static final RegistryObject<Item> MINNGXTC4B = REGISTRY.register("minngxtc4b", () -> new MinngxtcpubItem());
	public static final RegistryObject<Item> MINGXTBLOCK = block(MingXtModBlocks.MINGXTBLOCK);
	public static final RegistryObject<Item> MINGXTAXE = REGISTRY.register("mingxtaxe", () -> new MingxtaxeItem());
	public static final RegistryObject<Item> MINGXTPICKZXE = REGISTRY.register("mingxtpickzxe", () -> new MingxtpickzxeItem());
	public static final RegistryObject<Item> MINGXTSWORD = REGISTRY.register("mingxtsword", () -> new MingxtswordItem());
	public static final RegistryObject<Item> MINGXTINGOT = REGISTRY.register("mingxtingot", () -> new MingxtingotItem());
	public static final RegistryObject<Item> C_4 = block(MingXtModBlocks.C_4);
	public static final RegistryObject<Item> MINGXTORE = block(MingXtModBlocks.MINGXTORE);
	public static final RegistryObject<Item> MINGXTROWORE = REGISTRY.register("mingxtrowore", () -> new MingxtroworeItem());
	public static final RegistryObject<Item> MINGDEEPORE = block(MingXtModBlocks.MINGDEEPORE);
	public static final RegistryObject<Item> MINGXTWUXIANTURCH = REGISTRY.register("mingxtwuxianturch", () -> new MingxtwuxianturchItem());
	public static final RegistryObject<Item> MMINGMEITANX_2 = block(MingXtModBlocks.MMINGMEITANX_2);
	public static final RegistryObject<Item> MINGMEITANX_22 = block(MingXtModBlocks.MINGMEITANX_22);
	public static final RegistryObject<Item> MINGXTTORCHX_2 = REGISTRY.register("mingxttorchx_2", () -> new Mingxttorchx2Item());
	public static final RegistryObject<Item> MINGXTSKUIJIA_HELMET = REGISTRY.register("mingxtskuijia_helmet", () -> new MingxtskuijiaItem.Helmet());
	public static final RegistryObject<Item> MINGXTSKUIJIA_CHESTPLATE = REGISTRY.register("mingxtskuijia_chestplate", () -> new MingxtskuijiaItem.Chestplate());
	public static final RegistryObject<Item> MINGXTSKUIJIA_LEGGINGS = REGISTRY.register("mingxtskuijia_leggings", () -> new MingxtskuijiaItem.Leggings());
	public static final RegistryObject<Item> MINGXTSKUIJIA_BOOTS = REGISTRY.register("mingxtskuijia_boots", () -> new MingxtskuijiaItem.Boots());
	public static final RegistryObject<Item> MINGXTHOME = REGISTRY.register("mingxthome", () -> new MingxthomeItem());
	public static final RegistryObject<Item> MINGXTWUXIANGONG = REGISTRY.register("mingxtwuxiangong", () -> new TestItem());
	public static final RegistryObject<Item> PCL = REGISTRY.register("pcl", () -> new PCLItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
