
package net.mcreator.valleymanbeans.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.valleymanbeans.procedures.ValleymansbeanspremiumdihydrogenmonoxideFoodEatenProcedure;
import net.mcreator.valleymanbeans.procedures.ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItemProcedure;

import java.util.function.Consumer;

public class ValleymansbeanspremiumdihydrogenmonoxideItem extends Item {
	public ValleymansbeanspremiumdihydrogenmonoxideItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(64).food((new FoodProperties.Builder()).nutrition(-20).saturationModifier(-20f).alwaysEdible().build()));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, display, list, flag);
		list.accept(Component.translatable("item.valleyman_beans.valleymansbeanspremiumdihydrogenmonoxide.description_0"));
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
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity, InteractionHand hand) {
		boolean retval = super.onEntitySwing(itemstack, entity, hand);
		ValleymansbeanspremiumdihydrogenmonoxideEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
