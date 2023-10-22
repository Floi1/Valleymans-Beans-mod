
package net.mcreator.valleymanbeans.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.valleymanbeans.item.ItemBeanswip;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

@ElementsValleymanBeansMod.ModElement.Tag
public class TabBeans extends ElementsValleymanBeansMod.ModElement {
	public TabBeans(ElementsValleymanBeansMod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabbeans") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemBeanswip.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
