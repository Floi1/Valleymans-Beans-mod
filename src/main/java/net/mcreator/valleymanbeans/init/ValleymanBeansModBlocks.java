
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.valleymanbeans.block.LuckybeansblockBlock;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ValleymanBeansMod.MODID);
	public static final RegistryObject<Block> LUCKYBEANSBLOCK = REGISTRY.register("luckybeansblock", () -> new LuckybeansblockBlock());
}
