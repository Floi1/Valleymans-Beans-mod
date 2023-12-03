
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.valleymanbeans.potion.ValleymanbeanspoitionMobEffect;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ValleymanBeansMod.MODID);
	public static final RegistryObject<MobEffect> VALLEYMAN_BEANS_POITION = REGISTRY.register("valleyman_beans_poition", () -> new ValleymanbeanspoitionMobEffect());
}
