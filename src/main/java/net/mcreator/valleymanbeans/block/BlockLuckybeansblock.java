
package net.mcreator.valleymanbeans.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.valleymanbeans.procedure.ProcedureLuckybeansblockBlockDestroyedByPlayer;
import net.mcreator.valleymanbeans.creativetab.TabBeans;
import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@ElementsValleymanBeansMod.ModElement.Tag
public class BlockLuckybeansblock extends ElementsValleymanBeansMod.ModElement {
	@GameRegistry.ObjectHolder("valleyman_beans:luckybeansblock")
	public static final Block block = null;
	public BlockLuckybeansblock(ElementsValleymanBeansMod instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("luckybeansblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("valleyman_beans:luckybeansblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("luckybeansblock");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabBeans.tab);
		}

		@Override
		public int quantityDropped(Random random) {
			return 0;
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureLuckybeansblockBlockDestroyedByPlayer.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
