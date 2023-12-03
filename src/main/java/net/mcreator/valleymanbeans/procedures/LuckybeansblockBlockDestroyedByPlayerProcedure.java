package net.mcreator.valleymanbeans.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
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
				ItemStack _setstack = new ItemStack(Items.FIREWORK_ROCKET);
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.05) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSDREAMFISH.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.075) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GOLDEN_CARROT);
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX);
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.125) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.EMERALD_ORE);
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.15) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.175) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.NETHER_QUARTZ_ORE);
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.DRAGON_HEAD);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.225) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.TNT);
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST);
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.275) {
			world.setBlock(new BlockPos(x, y + 0, z), Blocks.DIAMOND_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.EMERALD_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), Blocks.GOLD_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 3, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 4, z), Blocks.REDSTONE_BLOCK.defaultBlockState(), 3);
		} else if (Math.random() <= 0.3) {
			world.setBlock(new BlockPos(x, y + 0, z), Blocks.TNT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.TNT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), Blocks.TNT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 3, z), Blocks.TNT.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() <= 0.325) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Husk(EntityType.HUSK, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Evoker(EntityType.EVOKER, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			for (int index1 = 0; index1 < (int) (15); index1++) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.35) {
			for (int index2 = 0; index2 < (int) (20); index2++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Chicken(EntityType.CHICKEN, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			for (int index3 = 0; index3 < (int) (25); index3++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.375) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 500));
		} else if (Math.random() <= 0.4) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
		} else if (Math.random() <= 0.425) {
			for (int index4 = 0; index4 < (int) (5); index4++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index5 = 0; index5 < (int) (10); index5++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_APPLE));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.45) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ValleymanBeansModItems.BEANSWIP.get()));
				entityToSpawn.setPickUpDelay(1);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Math.random() <= 0.475) {
			world.setBlock(new BlockPos(x, y + 0, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 3, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 4, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 5, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 6, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 7, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 8, z), Blocks.BOOKSHELF.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 9, z), Blocks.CAKE.defaultBlockState(), 3);
		} else if (Math.random() <= 0.5) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final int _amount = 10;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							if (_stk.hurt(_amount, RandomSource.create(), null)) {
								_stk.shrink(1);
								_stk.setDamageValue(0);
							}
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
		} else if (Math.random() <= 0.525) {
			for (int index6 = 0; index6 < (int) (15); index6++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Shulker(EntityType.SHULKER, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Boat(EntityType.BOAT, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEgg(EntityType.EGG, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MagmaCube(EntityType.MAGMA_CUBE, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Slime(EntityType.SLIME, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ValleymanBeansModMobEffects.VALLEYMAN_BEANS_POITION.get(), 60, 25, (false), (false)));
		} else if (Math.random() <= 0.55) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("what is beans? send help pls"), (false));
		} else if (Math.random() <= 0.575) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("oh nooooooo"), false);
			}
		} else if (Math.random() <= 0.6) {
			for (int index7 = 0; index7 < (int) (35); index7++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.625) {
			world.setBlock(new BlockPos(x, y + 0, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 3, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 4, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 5, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
		} else if (Math.random() <= 0.65) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.675) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSCLASSICRADIUMMINT.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUMDIHYDROGENMONOXIDE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.725) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSCOTTONCANDY.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.75) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANSCHERRY.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.775) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.VALLEYMANSBEANS_ST_PATRICKS_DAY.get());
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ENCHANTING_TABLE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.825) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ValleymanBeansModItems.BEANSSWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.85) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.NETHER_STAR);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.875) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BEACON);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.DRAGON_EGG);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.925) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.95) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.POISONOUS_POTATO);
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Math.random() <= 0.975) {
			for (int index8 = 0; index8 < (int) (50); index8++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 1) {
			for (int index9 = 0; index9 < (int) (50); index9++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.SAND));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
