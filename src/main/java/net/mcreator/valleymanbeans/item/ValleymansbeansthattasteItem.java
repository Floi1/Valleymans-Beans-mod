
package net.mcreator.valleymanbeans.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.valleymanbeans.procedures.ValleymansbeansthattasteoneProcedure;
import net.mcreator.valleymanbeans.itemgroup.BeansItemGroup;
import net.mcreator.valleymanbeans.ValleymanBeansModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.AbstractMap;

@ValleymanBeansModElements.ModElement.Tag
public class ValleymansbeansthattasteItem extends ValleymanBeansModElements.ModElement {
	@ObjectHolder("valleyman_beans:valleymansbeansthattaste")
	public static final Item block = null;

	public ValleymansbeansthattasteItem(ValleymanBeansModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BeansItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON).food((new Food.Builder()).hunger(-11).saturation(-1.7000000000000002f).setAlwaysEdible().build()));
			setRegistryName("valleymansbeansthattaste");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Valleymans beans that taste"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			ValleymansbeansthattasteoneProcedure.executeProcedure(
					Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			return retval;
		}
	}
}
