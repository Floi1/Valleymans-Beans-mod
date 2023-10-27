
package net.mcreator.valleymanbeans.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.valleymanbeans.item.ItemValleymansbeanssmartiiesandskeettles;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

@ElementsValleymanBeansMod.ModElement.Tag
public class RecipeBeanbasecook extends ElementsValleymanBeansMod.ModElement {
	public RecipeBeanbasecook(ElementsValleymanBeansMod instance) {
		super(instance, 79);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemValleymansbeanssmartiiesandskeettles.block, (int) (1)),
				new ItemStack(Blocks.PURPLE_SHULKER_BOX, (int) (1)), 256F);
	}
}
