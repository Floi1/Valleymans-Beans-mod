
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.potion.Effect;

import net.mcreator.valleymanbeans.potion.ValleymanbeanspoitionPotionEffect;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModPotionEffects {
	public static final DeferredRegister<Effect> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ValleymanBeansMod.MODID);
	public static final RegistryObject<Effect> VALLEYMAN_BEANS_POITION = REGISTRY.register("valleyman_beans_poition",
			() -> new ValleymanbeanspoitionPotionEffect());
}
