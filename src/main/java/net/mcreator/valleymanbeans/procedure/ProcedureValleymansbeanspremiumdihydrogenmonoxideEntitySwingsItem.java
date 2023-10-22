package net.mcreator.valleymanbeans.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItem extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItem(ElementsValleymanBeansMod instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 5);
	}
}
