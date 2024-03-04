package net.mcreator.valleymanbeans.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.valleymanbeans.init.ValleymanBeansModMobEffects;
import net.mcreator.valleymanbeans.init.ValleymanBeansModItems;

public class LuckybeansblockBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.025) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.FIREWORK_ROCKET).copy();
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.05) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSDREAMFISH.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.075) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GOLDEN_CARROT).copy();
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX).copy();
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.125) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.EMERALD_ORE).copy();
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.15) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK).copy();
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.175) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.NETHER_QUARTZ_ORE).copy();
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.DRAGON_HEAD).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.225) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.TNT).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST).copy();
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.275) {
			world.setBlock(BlockPos.containing(x, y + 0, z), Blocks.DIAMOND_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.EMERALD_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.GOLD_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 4, z), Blocks.REDSTONE_BLOCK.defaultBlockState(), 3);
		} else if (Math.random() <= 0.3) {
			world.setBlock(BlockPos.containing(x, y + 0, z), Blocks.TNT.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.TNT.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.TNT.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.TNT.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (Math.random() <= 0.325) {
			for (int index0 = 0; index0 < 5; index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.HUSK.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			for (int index1 = 0; index1 < 15; index1++) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.35) {
			for (int index2 = 0; index2 < 20; index2++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.CHICKEN.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			for (int index3 = 0; index3 < 25; index3++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.375) {
			if (world instanceof ServerLevel _level)
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 500));
		} else if (Math.random() <= 0.4) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
		} else if (Math.random() <= 0.425) {
			for (int index4 = 0; index4 < 5; index4++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index5 = 0; index5 < 10; index5++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_APPLE));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.45) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ValleymanBeansModItems.BEANSWIP.get()));
				entityToSpawn.setPickUpDelay(1);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() <= 0.475) {
			world.setBlock(BlockPos.containing(x, y + 0, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 4, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 5, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 6, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 7, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 8, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 9, z), Blocks.CAKE.defaultBlockState(), 3);
		} else if (Math.random() <= 0.5) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				int _slotid = 0;
				ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
				if (_stk.hurt(10, RandomSource.create(), null)) {
					_stk.shrink(1);
					_stk.setDamageValue(0);
				}
				_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
			}
		} else if (Math.random() <= 0.525) {
			for (int index6 = 0; index6 < 15; index6++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SHULKER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BOAT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.DRAGON_FIREBALL.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EGG.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.MAGMA_CUBE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.SLIME.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ValleymanBeansModMobEffects.VALLEYMAN_BEANS_POITION.get(), 60, 25, false, false));
		} else if (Math.random() <= 0.55) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("what is beans? send help pls"), false);
		} else if (Math.random() <= 0.575) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("oh nooooooo"), false);
		} else if (Math.random() <= 0.6) {
			for (int index7 = 0; index7 < 35; index7++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		} else if (Math.random() <= 0.625) {
			world.setBlock(BlockPos.containing(x, y + 0, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 4, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 5, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
		} else if (Math.random() <= 0.65) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUM.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.675) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSCLASSICRADIUMMINT.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUMDIHYDROGENMONOXIDE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.725) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSCOTTONCANDY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.75) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSCHERRY.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.775) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANS_ST_PATRICKS_DAY.get()).copy();
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ENCHANTING_TABLE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.825) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.BEANSSWORD.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.85) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.NETHER_STAR).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.875) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BEACON).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.DRAGON_EGG).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.925) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.95) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.POISONOUS_POTATO).copy();
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.975) {
			for (int index8 = 0; index8 < 50; index8++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		} else if (Math.random() <= 1) {
			for (int index9 = 0; index9 < 50; index9++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.SAND));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
