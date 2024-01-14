package net.mcreator.valleymanbeans.procedure;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeanChristmas2023FoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeanChristmas2023FoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 106);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeanChristmas2023FoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeanChristmas2023FoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeanChristmas2023FoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeanChristmas2023FoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeanChristmas2023FoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 600, (int) 1, (false), (false)));
		for (int index0 = 0; index0 < (int) (25); index0++) {
			if (!world.isRemote) {
				Entity entityToSpawn = new EntitySnowman(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityStray(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
