package net.mcreator.valleymanbeans.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansstrawberryandchocolateFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansstrawberryandchocolateFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 104);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeansstrawberryandchocolateFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 6000, (int) 10, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 6000, (int) 50, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, (int) 6000, (int) 50, (false), (false)));
	}
}
