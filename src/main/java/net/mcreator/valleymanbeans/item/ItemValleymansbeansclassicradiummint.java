
package net.mcreator.valleymanbeans.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.valleymanbeans.procedure.ProcedureValleymansbeansclassicradiummintFoodEaten;
import net.mcreator.valleymanbeans.creativetab.TabBeans;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;
import java.util.HashMap;

@ElementsValleymanBeansMod.ModElement.Tag
public class ItemValleymansbeansclassicradiummint extends ElementsValleymanBeansMod.ModElement {
	@GameRegistry.ObjectHolder("valleyman_beans:valleymansbeansclassicradiummint")
	public static final Item block = null;
	public ItemValleymansbeansclassicradiummint(ElementsValleymanBeansMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0,
				new ModelResourceLocation("valleyman_beans:valleymansbeansclassicradiummint", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(0, 0f, false);
			setUnlocalizedName("valleymansbeansclassicradiummint");
			setRegistryName("valleymansbeansclassicradiummint");
			setAlwaysEdible();
			setCreativeTab(TabBeans.tab);
			setMaxStackSize(64);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureValleymansbeansclassicradiummintFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
