package net.mcreator.valleymanbeans.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;
import java.util.Iterator;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymanbeanspoitionPotionExpires extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymanbeanspoitionPotionExpires(ElementsValleymanBeansMod instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymanbeanspoitionPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1));
			_setstack.setCount(8);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Items.GOLDEN_APPLE, (int) (1), 1);
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.ENDER_CHEST, (int) (1));
			_setstack.setCount(2);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 1000000);
		if (entity instanceof EntityPlayerMP) {
			Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
					.getAdvancement(new ResourceLocation("valleyman_beans:whyjustwhy"));
			AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemaningCriteria().iterator();
				while (_iterator.hasNext()) {
					String _criterion = (String) _iterator.next();
					((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
				}
			}
		}
	}
}
