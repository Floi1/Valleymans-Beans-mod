
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ValleymanBeansModTabs {
	public static CreativeModeTab TAB_BEANS;

	public static void load() {
		TAB_BEANS = new CreativeModeTab("tabbeans") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ValleymanBeansModItems.BEANSWIP.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
