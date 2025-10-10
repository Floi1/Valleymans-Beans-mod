package net.mcreator.valleymanbeans.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureBeansswordRightClickedInAir extends ElementsValleymanBeansMod.ModElement {
	public ProcedureBeansswordRightClickedInAir(ElementsValleymanBeansMod instance) {
		super(instance, 91);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BeansswordRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 1);
	}
}
