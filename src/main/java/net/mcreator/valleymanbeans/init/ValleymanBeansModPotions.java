
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ValleymanBeansMod.MODID);
	public static final DeferredHolder<Potion, Potion> VALLEYMAN_BEANS_POITION = REGISTRY.register("valleyman_beans_poition", () -> new Potion(new MobEffectInstance(ValleymanBeansModMobEffects.VALLEYMAN_BEANS_POITION.get(), 3600, 0, false, true)));
}
