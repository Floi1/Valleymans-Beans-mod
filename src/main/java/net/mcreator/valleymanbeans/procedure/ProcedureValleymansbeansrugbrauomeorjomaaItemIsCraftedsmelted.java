package net.mcreator.valleymanbeans.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeansrugbrauomeorjomaaItemIsCraftedsmelted extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeansrugbrauomeorjomaaItemIsCraftedsmelted(ElementsValleymanBeansMod instance) {
		super(instance, 127);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure ValleymansbeansrugbrauomeorjomaaItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.BINDING_CURSE, (int) 1);
	}
}
