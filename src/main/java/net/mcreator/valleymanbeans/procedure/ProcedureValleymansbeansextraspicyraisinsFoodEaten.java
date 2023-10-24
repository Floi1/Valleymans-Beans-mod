package net.mcreator.valleymanbeans.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansextraspicyraisinsFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansextraspicyraisinsFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 58);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeansextraspicyraisinsFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 600, (int) 1, (false), (false)));
		entity.setFire((int) 200);
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 5);
	}
}
