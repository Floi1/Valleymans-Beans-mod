package net.mcreator.valleymanbeans.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansrugbrauomeorjomaaFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansrugbrauomeorjomaaFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 125);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeansrugbrauomeorjomaaFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeansrugbrauomeorjomaaFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeansrugbrauomeorjomaaFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeansrugbrauomeorjomaaFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeansrugbrauomeorjomaaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.WEB.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.WEB.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.WEB.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.WEB.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.WEB.getDefaultState(), 3);
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("look at all those chickens"), (false));
		}
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 25, true);
		}
		for (int index0 = 0; index0 < (int) (4); index0++) {
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityBat(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityHusk(world);
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
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityPig(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityRabbit(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityVillager(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntitySquid(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityCow(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityChicken(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityHorse(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityLlama(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityMule(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityOcelot(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		for (int index1 = 0; index1 < (int) (15); index1++) {
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + 1), (int) y, (int) z, false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + 1), false));
		}
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 10, true);
		}
	}
}
