
package net.mcreator.valleymanbeans.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.valleymanbeans.item.ItemValleymansbeanspremiumhohoholidayspecial;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

@ElementsValleymanBeansMod.ModElement.Tag
public class RecipeDimhohoh extends ElementsValleymanBeansMod.ModElement {
	public RecipeDimhohoh(ElementsValleymanBeansMod instance) {
		super(instance, 34);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemValleymansbeanspremiumhohoholidayspecial.block, (int) (1)), new ItemStack(Items.ELYTRA, (int) (1)),
				256F);
	}
}
