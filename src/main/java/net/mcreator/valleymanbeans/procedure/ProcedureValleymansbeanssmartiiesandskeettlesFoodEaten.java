package net.mcreator.valleymanbeans.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeanssmartiiesandskeettlesFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeanssmartiiesandskeettlesFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 74);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeanssmartiiesandskeettlesFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 3000, (int) 1, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 3000, (int) 1, (false), (false)));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 3000, (int) 1, (false), (false)));
		if ((Math.random() <= 0.1)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.FIREWORKS, (int) (1));
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.2)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.ICE, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.3)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.WOOL, (int) (1), 0);
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.4)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX, (int) (1));
				_setstack.setCount(4);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.5)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.LAPIS_BLOCK, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.6)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1));
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.7)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.8)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.SKULL, (int) (1), 5);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.9)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.TNT, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 1)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
