
package net.mcreator.valleymanbeans.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.valleymanbeans.item.ItemBeanswip;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

@ElementsValleymanBeansMod.ModElement.Tag
public class FuelBasevallybeans extends ElementsValleymanBeansMod.ModElement {
	public FuelBasevallybeans(ElementsValleymanBeansMod instance) {
		super(instance, 117);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemBeanswip.block, (int) (1)).getItem())
			return 160000;
		return 0;
	}
}
