package net.mcreator.valleymanbeans.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansswampgumboFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansswampgumboFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 130);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeansswampgumboFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeansswampgumboFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeansswampgumboFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeansswampgumboFoodEaten!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (5); index0++) {
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityZombie(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntitySkeleton(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntitySlime(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntitySpider(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityMooshroom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
