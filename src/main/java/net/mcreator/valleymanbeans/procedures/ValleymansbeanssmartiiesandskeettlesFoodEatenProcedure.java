package net.mcreator.valleymanbeans.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

import java.util.Map;

public class ValleymansbeanssmartiiesandskeettlesFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency entity for procedure ValleymansbeanssmartiiesandskeettlesFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 3000, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 3000, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 3000, (int) 1, (false), (false)));
		if (Math.random() <= 0.1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.FIREWORK_ROCKET);
				_setstack.setCount((int) 32);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.2) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.ICE);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.3) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.WHITE_WOOL);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.4) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX);
				_setstack.setCount((int) 4);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.5) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.LAPIS_BLOCK);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.6) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
				_setstack.setCount((int) 16);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.7) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.8) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.DRAGON_HEAD);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.9) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.TNT);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
