
package net.mcreator.valleymanbeans.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.valleymanbeans.procedures.ValleymansbeanspremiumdihydrogenmonoxideFoodEatenProcedure;
import net.mcreator.valleymanbeans.procedures.ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItemProcedure;
import net.mcreator.valleymanbeans.init.ValleymanBeansModTabs;

import java.util.List;

public class ValleymansbeanspremiumdihydrogenmonoxideItem extends Item {
	public ValleymansbeanspremiumdihydrogenmonoxideItem() {
		super(new Item.Properties().tab(ValleymanBeansModTabs.TAB_BEANS).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(-20).saturationMod(-20f).alwaysEat()

				.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Valleymans beans premium dihydrogen monoxide"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ValleymansbeanspremiumdihydrogenmonoxideFoodEatenProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
