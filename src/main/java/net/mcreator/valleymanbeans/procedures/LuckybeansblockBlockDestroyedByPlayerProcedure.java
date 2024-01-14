package net.mcreator.valleymanbeans.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.ShulkerEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumdihydrogenmonoxideItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansdreamfishItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscottoncandyItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansclassicradiummintItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscherryItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansStPatricksDayItem;
import net.mcreator.valleymanbeans.item.BeanswipItem;
import net.mcreator.valleymanbeans.item.BeansswordItem;
import net.mcreator.valleymanbeans.init.ValleymanBeansModPotionEffects;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

import java.util.Random;
import java.util.Map;

public class LuckybeansblockBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency world for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency x for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency y for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency z for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency entity for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() <= 0.025) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.FIREWORK_ROCKET);
				_setstack.setCount((int) 32);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.05) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeansdreamfishItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.075) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.GOLDEN_CARROT);
				_setstack.setCount((int) 32);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.1) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.125) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.EMERALD_ORE);
				_setstack.setCount((int) 16);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.15) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
				_setstack.setCount((int) 16);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.175) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.NETHER_QUARTZ_ORE);
				_setstack.setCount((int) 32);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.2) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.DRAGON_HEAD);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.225) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.TNT);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.25) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST);
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.275) {
			world.setBlockState(new BlockPos(x, y + 0, z), Blocks.DIAMOND_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), Blocks.EMERALD_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 2, z), Blocks.GOLD_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 3, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 4, z), Blocks.REDSTONE_BLOCK.getDefaultState(), 3);
		} else if (Math.random() <= 0.3) {
			world.setBlockState(new BlockPos(x, y + 0, z), Blocks.TNT.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), Blocks.TNT.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 2, z), Blocks.TNT.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 3, z), Blocks.TNT.getDefaultState(), 3);
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else if (Math.random() <= 0.325) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new HuskEntity(EntityType.HUSK, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EvokerEntity(EntityType.EVOKER, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index1 = 0; index1 < (int) (15); index1++) {
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos(x, y, z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
			}
		} else if (Math.random() <= 0.35) {
			for (int index2 = 0; index2 < (int) (20); index2++) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new ChickenEntity(EntityType.CHICKEN, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index3 = 0; index3 < (int) (25); index3++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.DIAMOND));
					entityToSpawn.setPickupDelay((int) 1);
					entityToSpawn.setNoDespawn();
					world.addEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.375) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 500));
			}
		} else if (Math.random() <= 0.4) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		} else if (Math.random() <= 0.425) {
			for (int index4 = 0; index4 < (int) (5); index4++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
					entityToSpawn.setPickupDelay((int) 1);
					entityToSpawn.setNoDespawn();
					world.addEntity(entityToSpawn);
				}
			}
			for (int index5 = 0; index5 < (int) (10); index5++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.GOLDEN_APPLE));
					entityToSpawn.setPickupDelay((int) 1);
					entityToSpawn.setNoDespawn();
					world.addEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.45) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BeanswipItem.block));
				entityToSpawn.setPickupDelay((int) 1);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		} else if (Math.random() <= 0.475) {
			world.setBlockState(new BlockPos(x, y + 0, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 2, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 3, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 4, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 5, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 6, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 7, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 8, z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 9, z), Blocks.CAKE.getDefaultState(), 3);
		} else if (Math.random() <= 0.5) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _sltid = (int) (0);
					final int _amount = (int) 10;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							if (_stk.attemptDamageItem(_amount, new Random(), null)) {
								_stk.shrink(1);
								_stk.setDamage(0);
							}
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
		} else if (Math.random() <= 0.525) {
			for (int index6 = 0; index6 < (int) (15); index6++) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new ShulkerEntity(EntityType.SHULKER, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new BoatEntity(EntityType.BOAT, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new DragonFireballEntity(EntityType.DRAGON_FIREBALL, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new EggEntity(EntityType.EGG, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new MagmaCubeEntity(EntityType.MAGMA_CUBE, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new SlimeEntity(EntityType.SLIME, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(
						new EffectInstance(ValleymanBeansModPotionEffects.VALLEYMAN_BEANS_POITION.get(), (int) 60, (int) 25, (false), (false)));
		} else if (Math.random() <= 0.55) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("what is beans? send help pls"), (false));
			}
		} else if (Math.random() <= 0.575) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("oh nooooooo"), ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		} else if (Math.random() <= 0.6) {
			for (int index7 = 0; index7 < (int) (35); index7++) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 0.625) {
			world.setBlockState(new BlockPos(x, y + 0, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 2, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 3, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 4, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 5, z), Blocks.IRON_BLOCK.getDefaultState(), 3);
		} else if (Math.random() <= 0.65) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeanspremiumItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.675) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeansclassicradiummintItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.7) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeanspremiumdihydrogenmonoxideItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.725) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeanscottoncandyItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.75) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeanscherryItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.775) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(ValleymansbeansStPatricksDayItem.block);
				_setstack.setCount((int) 16);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.8) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.ENCHANTING_TABLE);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.825) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BeansswordItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.85) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.NETHER_STAR);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.875) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.BEACON);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.9) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.DRAGON_EGG);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.925) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.95) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.POISONOUS_POTATO);
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() <= 0.975) {
			for (int index8 = 0; index8 < (int) (50); index8++) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new ZombieEntity(EntityType.ZOMBIE, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (Math.random() <= 1) {
			for (int index9 = 0; index9 < (int) (50); index9++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.SAND));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
