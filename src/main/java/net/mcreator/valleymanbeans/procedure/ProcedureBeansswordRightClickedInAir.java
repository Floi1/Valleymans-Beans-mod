package net.mcreator.valleymanbeans.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureBeansswordRightClickedInAir extends ElementsValleymanBeansMod.ModElement {
	public ProcedureBeansswordRightClickedInAir(ElementsValleymanBeansMod instance) {
		super(instance, 91);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BeansswordRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure BeansswordRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 10);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 16937);
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Items.ENDER_EYE, (int) (1));
			_setstack.setCount(12);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.SKULL, (int) (1), 1);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.HAY_BLOCK, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
