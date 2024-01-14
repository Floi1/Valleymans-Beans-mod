package net.mcreator.valleymanbeans.procedure;

import net.minecraft.world.World;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansVeteransDayspecialFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansVeteransDayspecialFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 108);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeansVeteransDayspecialFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeansVeteransDayspecialFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeansVeteransDayspecialFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeansVeteransDayspecialFoodEaten!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 4, true);
		}
	}
}
