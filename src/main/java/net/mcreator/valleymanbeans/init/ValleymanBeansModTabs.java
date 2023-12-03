
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValleymanBeansModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(ValleymanBeansModItems.BOWBEANS.get());
			tabData.accept(ValleymanBeansModItems.BEANSSWORD.get());
			tabData.accept(ValleymanBeansModItems.BEANS_T_ISWORD.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("valleyman_beans", "beans"),
				builder -> builder.title(Component.translatable("item_group.valleyman_beans.beans")).icon(() -> new ItemStack(ValleymanBeansModItems.BEANSWIP.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ValleymanBeansModBlocks.LUCKYBEANSBLOCK.get().asItem());
					tabData.accept(ValleymanBeansModItems.BEANSWIP.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSCLASSICRADIUMMINT.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUM.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSEXTRADIET.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSSMOKEDONIONS.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSDREAMFISH.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUMHOHOHOLIDAYSPECIAL.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_ST_PATRICKS_DAY.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSTHATTASTE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSBLUEBERRYJAM.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSRASPBERRY.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSPREMIUMDIHYDROGENMONOXIDE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_AUSTRALIADEFINITIVEEDITION.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_SEAFOODPIZZAANDCHOCOMILK.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_BLACKTEAANDSOYSAUCE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSAPPLEANDTANGERINE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSEXOTICMEATS.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_CUBANCIGARSMOKED.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSBANANA.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_BRAZILIANSUSHI.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSCHERRY.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSEXTRASPICYRAISINS.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSFERMENTEDSHARK.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSMILKDURIAN.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSCOKEANDLIQUIDCHEESE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSAUSTRALIA.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSAVOCADOANDCHOCOLATECHIPS.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSSMARTIIESANDSKEETTLES.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSGREENTEAKITKATANDWAGYUBEEFTALLOW.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSSOURGUMMYWORMS.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSMILK.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSMINTANDLICORICE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSCOTTONCANDY.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSTOOTHPASTEANDORANGEJUICE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSCREAMANDLEMON.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSSEASONEDCHEESE.get());
					tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANSSTRAWBERRYANDCHOCOLATE.get());
				})

		);
	}
}
