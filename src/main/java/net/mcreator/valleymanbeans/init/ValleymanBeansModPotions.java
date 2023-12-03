
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ValleymanBeansMod.MODID);
	public static final RegistryObject<Potion> VALLEYMAN_BEANS_POITION = REGISTRY.register("valleyman_beans_poition", () -> new Potion(new MobEffectInstance(ValleymanBeansModMobEffects.VALLEYMAN_BEANS_POITION.get(), 3600, 0, false, true)));
}
