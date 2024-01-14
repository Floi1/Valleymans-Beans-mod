
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.valleymanbeans.item.BeanswipItem;

public class ValleymanBeansModTabs {
	public static ItemGroup TAB_BEANS;

	public static void load() {
		TAB_BEANS = new ItemGroup("tabbeans") {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BeanswipItem.block);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
