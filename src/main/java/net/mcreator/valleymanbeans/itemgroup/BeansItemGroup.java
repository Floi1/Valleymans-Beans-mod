
package net.mcreator.valleymanbeans.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.valleymanbeans.item.BeanswipItem;
import net.mcreator.valleymanbeans.ValleymanBeansModElements;

@ValleymanBeansModElements.ModElement.Tag
public class BeansItemGroup extends ValleymanBeansModElements.ModElement {
	public BeansItemGroup(ValleymanBeansModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbeans") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BeanswipItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
