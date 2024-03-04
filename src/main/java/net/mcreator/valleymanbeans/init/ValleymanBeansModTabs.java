
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValleymanBeansModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ValleymanBeansMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BEANS = REGISTRY.register("beans",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.valleyman_beans.beans")).icon(() -> new ItemStack(ValleymanBeansModItems.BEANSWIP.get())).displayItems((parameters, tabData) -> {
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
				tabData.accept(ValleymanBeansModItems.VALLEYMANSBEAN_CHRISTMAS_2023.get());
				tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_VETERANS_DAYSPECIAL.get());
				tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_HALLOWEENSPECIAL.get());
				tabData.accept(ValleymanBeansModItems.VALLEYMANSBEANS_EASTERSPECIAL.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ValleymanBeansModItems.BEANSSWORD.get());
			tabData.accept(ValleymanBeansModItems.BEANS_T_ISWORD.get());
			tabData.accept(ValleymanBeansModItems.BOWBEANS.get());
		}
	}
}
