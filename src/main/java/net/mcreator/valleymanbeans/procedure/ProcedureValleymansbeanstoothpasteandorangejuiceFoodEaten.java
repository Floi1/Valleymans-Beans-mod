package net.mcreator.valleymanbeans.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeanstoothpasteandorangejuiceFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeanstoothpasteandorangejuiceFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 96);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeanstoothpasteandorangejuiceFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeanstoothpasteandorangejuiceFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeanstoothpasteandorangejuiceFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeanstoothpasteandorangejuiceFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeanstoothpasteandorangejuiceFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 360, (int) 1, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 360, (int) 1, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 360, (int) 1, (false), (false)));
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.FLOWING_LAVA.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.FLOWING_LAVA.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.FLOWING_LAVA.getDefaultState(), 3);
	}
}
