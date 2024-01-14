package net.mcreator.valleymanbeans.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

import java.util.Map;

public class ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ValleymanBeansMod.LOGGER
						.warn("Failed to load dependency entity for procedure ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 5);
	}
}
