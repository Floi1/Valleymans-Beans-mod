package net.mcreator.valleymanbeans.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeanscreamandlemonFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeanscreamandlemonFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 99);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeanscreamandlemonFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 6000, (int) 66, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HUNGER, (int) 600, (int) 255, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 3000, (int) 255, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, (int) 3000, (int) 3, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 3000, (int) 3, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 3000, (int) 3, (false), (false)));
	}
}
