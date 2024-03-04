package net.mcreator.valleymanbeans.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class ValleymansbeanssmartiiesandskeettlesFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3000, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 3000, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 3000, 1, false, false));
		if (Math.random() <= 0.1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.FIREWORK_ROCKET).copy();
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ICE).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.WHITE_WOOL).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX).copy();
				_setstack.setCount(4);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.LAPIS_BLOCK).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK).copy();
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.DRAGON_HEAD).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.TNT).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
