package net.mcreator.valleymanbeans.procedure;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityDragonFireball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.potion.PotionValleymanbeanspoition;
import net.mcreator.valleymanbeans.item.ItemValleymansbeanspremiumdihydrogenmonoxide;
import net.mcreator.valleymanbeans.item.ItemValleymansbeanspremium;
import net.mcreator.valleymanbeans.item.ItemValleymansbeansdreamfish;
import net.mcreator.valleymanbeans.item.ItemValleymansbeanscottoncandy;
import net.mcreator.valleymanbeans.item.ItemValleymansbeansclassicradiummint;
import net.mcreator.valleymanbeans.item.ItemValleymansbeanscherry;
import net.mcreator.valleymanbeans.item.ItemValleymansbeansStPatricksDay;
import net.mcreator.valleymanbeans.item.ItemBeanswip;
import net.mcreator.valleymanbeans.item.ItemBeanssword;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Random;
import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureLuckybeansblockBlockDestroyedByPlayer extends ElementsValleymanBeansMod.ModElement {
	public ProcedureLuckybeansblockBlockDestroyedByPlayer(ElementsValleymanBeansMod instance) {
		super(instance, 94);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LuckybeansblockBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() <= 0.025)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.FIREWORKS, (int) (1));
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.05)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeansdreamfish.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.075)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.GOLDEN_CARROT, (int) (1));
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.1)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_SHULKER_BOX, (int) (1));
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.125)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.EMERALD_ORE, (int) (1));
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.15)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1));
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.175)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.QUARTZ_ORE, (int) (1));
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.2)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.SKULL, (int) (1), 5);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.225)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.TNT, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.25)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST, (int) (1));
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.275)) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 0), (int) z), Blocks.DIAMOND_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.EMERALD_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.GOLD_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.REDSTONE_BLOCK.getDefaultState(), 3);
		} else if ((Math.random() <= 0.3)) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 0), (int) z), Blocks.TNT.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.TNT.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.TNT.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.TNT.getDefaultState(), 3);
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityTNTPrimed(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityTNTPrimed(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityTNTPrimed(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityTNTPrimed(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityTNTPrimed(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityTNTPrimed(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		} else if ((Math.random() <= 0.325)) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityHusk(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityEvoker(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			for (int index1 = 0; index1 < (int) (15); index1++) {
				world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
			}
		} else if ((Math.random() <= 0.35)) {
			for (int index2 = 0; index2 < (int) (20); index2++) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityChicken(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			for (int index3 = 0; index3 < (int) (25); index3++) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Items.DIAMOND, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		} else if ((Math.random() <= 0.375)) {
			if (!world.isRemote) {
				world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 500));
			}
		} else if ((Math.random() <= 0.4)) {
			if (!world.isRemote) {
				world.createExplosion(null, (int) x, (int) y, (int) z, (float) 4, true);
			}
		} else if ((Math.random() <= 0.425)) {
			for (int index4 = 0; index4 < (int) (5); index4++) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Items.GOLDEN_APPLE, (int) (1), 1));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
			for (int index5 = 0; index5 < (int) (10); index5++) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Items.GOLDEN_APPLE, (int) (1), 0));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		} else if ((Math.random() <= 0.45)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemBeanswip.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		} else if ((Math.random() <= 0.475)) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 0), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 6), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 7), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 8), (int) z), Blocks.BOOKSHELF.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 9), (int) z), Blocks.CAKE.getDefaultState(), 3);
		} else if ((Math.random() <= 0.5)) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot((int) (0));
					if (stack != null) {
						if (stack.attemptDamageItem((int) 10, new Random(), null)) {
							stack.shrink(1);
							stack.setItemDamage(0);
						}
					}
				}
			}
		} else if ((Math.random() <= 0.525)) {
			for (int index6 = 0; index6 < (int) (15); index6++) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityShulker(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityBoat(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityDragonFireball(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityEgg(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityMagmaCube(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				if (!world.isRemote) {
					Entity entityToSpawn = new EntitySlime(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity)
						.addPotionEffect(new PotionEffect(PotionValleymanbeanspoition.potion, (int) 60, (int) 25, (false), (false)));
		} else if ((Math.random() <= 0.55)) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("what is beans? send help pls"), (false));
			}
		} else if ((Math.random() <= 0.575)) {
			{
				MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new TextComponentString("oh nooooooo"));
			}
		} else if ((Math.random() <= 0.6)) {
			for (int index7 = 0; index7 < (int) (35); index7++) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityTNTPrimed(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		} else if ((Math.random() <= 0.625)) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 0), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
		} else if ((Math.random() <= 0.65)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeanspremium.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.675)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeansclassicradiummint.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.7)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeanspremiumdihydrogenmonoxide.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.725)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeanscottoncandy.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.75)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeanscherry.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.775)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemValleymansbeansStPatricksDay.block, (int) (1));
				_setstack.setCount(16);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.8)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.ENCHANTING_TABLE, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.825)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemBeanssword.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.85)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.NETHER_STAR, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.875)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.BEACON, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.9)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Blocks.DRAGON_EGG, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.925)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.95)) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(Items.POISONOUS_POTATO, (int) (1));
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		} else if ((Math.random() <= 0.975)) {
			for (int index8 = 0; index8 < (int) (50); index8++) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityZombie(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		} else if ((Math.random() <= 1)) {
			for (int index9 = 0; index9 < (int) (50); index9++) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Blocks.SAND, (int) (1), 0));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
