
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

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

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
