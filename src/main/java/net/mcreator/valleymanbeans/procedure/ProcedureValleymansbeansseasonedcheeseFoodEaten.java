package net.mcreator.valleymanbeans.procedure;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansseasonedcheeseFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansseasonedcheeseFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 102);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeansseasonedcheeseFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeansseasonedcheeseFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeansseasonedcheeseFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeansseasonedcheeseFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeansseasonedcheeseFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (25); index0++) {
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityCow(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, (int) 1200, (int) 11));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 1200, (int) 3));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 1200, (int) 25));
	}
}
