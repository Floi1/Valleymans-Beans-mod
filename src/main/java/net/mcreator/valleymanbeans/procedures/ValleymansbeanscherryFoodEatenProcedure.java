package net.mcreator.valleymanbeans.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

import java.util.Map;

public class ValleymansbeanscherryFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency world for procedure ValleymansbeanscherryFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency x for procedure ValleymansbeanscherryFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency y for procedure ValleymansbeanscherryFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency z for procedure ValleymansbeanscherryFoodEaten!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency entity for procedure ValleymansbeanscherryFoodEaten!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 1200, (int) 233));
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.POPPED_CHORUS_FRUIT);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 20);
		world.setBlockState(new BlockPos(x, y, z), Blocks.PURPLE_WOOL.getDefaultState(), 3);
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new LlamaEntity(EntityType.LLAMA, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
