
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.valleymanbeans.item.ValleymansbeanstoothpasteandorangejuiceItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansthattasteItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansstrawberryandchocolateItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanssourgummywormsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanssmokedonionsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanssmartiiesandskeettlesItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansseasonedcheeseItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansraspberryItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumhohoholidayspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumdihydrogenmonoxideItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansmintandlicoriceItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansmilkdurianItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansmilkItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansgreenteakitkatandwagyubeeftallowItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansfermentedsharkItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansextraspicyraisinsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansextradietItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansexoticmeatsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansdreamfishItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscreamandlemonItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscottoncandyItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscokeandliquidcheeseItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansclassicradiummintItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscherryItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansblueberryjamItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansbananaItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansavocadoandchocolatechipsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansaustraliaItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansappleandtangerineItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansVeteransDayspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansStPatricksDayItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansSeafoodpizzaandchocomilkItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansHalloweenspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansEasterspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansCubancigarsmokedItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansBraziliansushiItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansBlackteaandsoysauceItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansAustraliadefinitiveeditionItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanChristmas2023Item;
import net.mcreator.valleymanbeans.item.BowbeansItem;
import net.mcreator.valleymanbeans.item.BeanswipItem;
import net.mcreator.valleymanbeans.item.BeansswordItem;
import net.mcreator.valleymanbeans.item.BeansTIswordItem;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ValleymanBeansMod.MODID);
	public static final DeferredHolder<Item, Item> BEANSSWORD = REGISTRY.register("beanssword", () -> new BeansswordItem());
	public static final DeferredHolder<Item, Item> BEANS_T_ISWORD = REGISTRY.register("beans_t_isword", () -> new BeansTIswordItem());
	public static final DeferredHolder<Item, Item> LUCKYBEANSBLOCK = block(ValleymanBeansModBlocks.LUCKYBEANSBLOCK);
	public static final DeferredHolder<Item, Item> BEANSWIP = REGISTRY.register("beanswip", () -> new BeanswipItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSCLASSICRADIUMMINT = REGISTRY.register("valleymansbeansclassicradiummint", () -> new ValleymansbeansclassicradiummintItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSPREMIUM = REGISTRY.register("valleymansbeanspremium", () -> new ValleymansbeanspremiumItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSEXTRADIET = REGISTRY.register("valleymansbeansextradiet", () -> new ValleymansbeansextradietItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSSMOKEDONIONS = REGISTRY.register("valleymansbeanssmokedonions", () -> new ValleymansbeanssmokedonionsItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSDREAMFISH = REGISTRY.register("valleymansbeansdreamfish", () -> new ValleymansbeansdreamfishItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSPREMIUMHOHOHOLIDAYSPECIAL = REGISTRY.register("valleymansbeanspremiumhohoholidayspecial", () -> new ValleymansbeanspremiumhohoholidayspecialItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_ST_PATRICKS_DAY = REGISTRY.register("valleymansbeans_st_patricks_day", () -> new ValleymansbeansStPatricksDayItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSTHATTASTE = REGISTRY.register("valleymansbeansthattaste", () -> new ValleymansbeansthattasteItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSBLUEBERRYJAM = REGISTRY.register("valleymansbeansblueberryjam", () -> new ValleymansbeansblueberryjamItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSRASPBERRY = REGISTRY.register("valleymansbeansraspberry", () -> new ValleymansbeansraspberryItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSPREMIUMDIHYDROGENMONOXIDE = REGISTRY.register("valleymansbeanspremiumdihydrogenmonoxide", () -> new ValleymansbeanspremiumdihydrogenmonoxideItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_AUSTRALIADEFINITIVEEDITION = REGISTRY.register("valleymansbeans_australiadefinitiveedition", () -> new ValleymansbeansAustraliadefinitiveeditionItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_SEAFOODPIZZAANDCHOCOMILK = REGISTRY.register("valleymansbeans_seafoodpizzaandchocomilk", () -> new ValleymansbeansSeafoodpizzaandchocomilkItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_BLACKTEAANDSOYSAUCE = REGISTRY.register("valleymansbeans_blackteaandsoysauce", () -> new ValleymansbeansBlackteaandsoysauceItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSAPPLEANDTANGERINE = REGISTRY.register("valleymansbeansappleandtangerine", () -> new ValleymansbeansappleandtangerineItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSEXOTICMEATS = REGISTRY.register("valleymansbeansexoticmeats", () -> new ValleymansbeansexoticmeatsItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_CUBANCIGARSMOKED = REGISTRY.register("valleymansbeans_cubancigarsmoked", () -> new ValleymansbeansCubancigarsmokedItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSBANANA = REGISTRY.register("valleymansbeansbanana", () -> new ValleymansbeansbananaItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_BRAZILIANSUSHI = REGISTRY.register("valleymansbeans_braziliansushi", () -> new ValleymansbeansBraziliansushiItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSCHERRY = REGISTRY.register("valleymansbeanscherry", () -> new ValleymansbeanscherryItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSEXTRASPICYRAISINS = REGISTRY.register("valleymansbeansextraspicyraisins", () -> new ValleymansbeansextraspicyraisinsItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSFERMENTEDSHARK = REGISTRY.register("valleymansbeansfermentedshark", () -> new ValleymansbeansfermentedsharkItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSMILKDURIAN = REGISTRY.register("valleymansbeansmilkdurian", () -> new ValleymansbeansmilkdurianItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSCOKEANDLIQUIDCHEESE = REGISTRY.register("valleymansbeanscokeandliquidcheese", () -> new ValleymansbeanscokeandliquidcheeseItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSAUSTRALIA = REGISTRY.register("valleymansbeansaustralia", () -> new ValleymansbeansaustraliaItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSAVOCADOANDCHOCOLATECHIPS = REGISTRY.register("valleymansbeansavocadoandchocolatechips", () -> new ValleymansbeansavocadoandchocolatechipsItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSSMARTIIESANDSKEETTLES = REGISTRY.register("valleymansbeanssmartiiesandskeettles", () -> new ValleymansbeanssmartiiesandskeettlesItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSGREENTEAKITKATANDWAGYUBEEFTALLOW = REGISTRY.register("valleymansbeansgreenteakitkatandwagyubeeftallow", () -> new ValleymansbeansgreenteakitkatandwagyubeeftallowItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSSOURGUMMYWORMS = REGISTRY.register("valleymansbeanssourgummyworms", () -> new ValleymansbeanssourgummywormsItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSMILK = REGISTRY.register("valleymansbeansmilk", () -> new ValleymansbeansmilkItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSMINTANDLICORICE = REGISTRY.register("valleymansbeansmintandlicorice", () -> new ValleymansbeansmintandlicoriceItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSCOTTONCANDY = REGISTRY.register("valleymansbeanscottoncandy", () -> new ValleymansbeanscottoncandyItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSTOOTHPASTEANDORANGEJUICE = REGISTRY.register("valleymansbeanstoothpasteandorangejuice", () -> new ValleymansbeanstoothpasteandorangejuiceItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSCREAMANDLEMON = REGISTRY.register("valleymansbeanscreamandlemon", () -> new ValleymansbeanscreamandlemonItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSSEASONEDCHEESE = REGISTRY.register("valleymansbeansseasonedcheese", () -> new ValleymansbeansseasonedcheeseItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANSSTRAWBERRYANDCHOCOLATE = REGISTRY.register("valleymansbeansstrawberryandchocolate", () -> new ValleymansbeansstrawberryandchocolateItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEAN_CHRISTMAS_2023 = REGISTRY.register("valleymansbean_christmas_2023", () -> new ValleymansbeanChristmas2023Item());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_VETERANS_DAYSPECIAL = REGISTRY.register("valleymansbeans_veterans_dayspecial", () -> new ValleymansbeansVeteransDayspecialItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_HALLOWEENSPECIAL = REGISTRY.register("valleymansbeans_halloweenspecial", () -> new ValleymansbeansHalloweenspecialItem());
	public static final DeferredHolder<Item, Item> VALLEYMANSBEANS_EASTERSPECIAL = REGISTRY.register("valleymansbeans_easterspecial", () -> new ValleymansbeansEasterspecialItem());
	public static final DeferredHolder<Item, Item> BOWBEANS = REGISTRY.register("bowbeans", () -> new BowbeansItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
