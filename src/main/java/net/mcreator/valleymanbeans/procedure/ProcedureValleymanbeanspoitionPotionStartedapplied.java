package net.mcreator.valleymanbeans.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymanbeanspoitionPotionStartedapplied extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymanbeanspoitionPotionStartedapplied(ElementsValleymanBeansMod instance) {
		super(instance, 67);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymanbeanspoitionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WITHER, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 6000, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LEVITATION, (int) 50, (int) 255));
	}
}
