
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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

import java.util.function.Function;

public class ValleymanBeansModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ValleymanBeansMod.MODID);
	public static final DeferredItem<Item> BEANSSWORD = register("beanssword", BeansswordItem::new);
	public static final DeferredItem<Item> BEANS_T_ISWORD = register("beans_t_isword", BeansTIswordItem::new);
	public static final DeferredItem<Item> LUCKYBEANSBLOCK = block(ValleymanBeansModBlocks.LUCKYBEANSBLOCK);
	public static final DeferredItem<Item> BEANSWIP = register("beanswip", BeanswipItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSCLASSICRADIUMMINT = register("valleymansbeansclassicradiummint", ValleymansbeansclassicradiummintItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSPREMIUM = register("valleymansbeanspremium", ValleymansbeanspremiumItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSEXTRADIET = register("valleymansbeansextradiet", ValleymansbeansextradietItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSSMOKEDONIONS = register("valleymansbeanssmokedonions", ValleymansbeanssmokedonionsItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSDREAMFISH = register("valleymansbeansdreamfish", ValleymansbeansdreamfishItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSPREMIUMHOHOHOLIDAYSPECIAL = register("valleymansbeanspremiumhohoholidayspecial", ValleymansbeanspremiumhohoholidayspecialItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_ST_PATRICKS_DAY = register("valleymansbeans_st_patricks_day", ValleymansbeansStPatricksDayItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSTHATTASTE = register("valleymansbeansthattaste", ValleymansbeansthattasteItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSBLUEBERRYJAM = register("valleymansbeansblueberryjam", ValleymansbeansblueberryjamItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSRASPBERRY = register("valleymansbeansraspberry", ValleymansbeansraspberryItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSPREMIUMDIHYDROGENMONOXIDE = register("valleymansbeanspremiumdihydrogenmonoxide", ValleymansbeanspremiumdihydrogenmonoxideItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_AUSTRALIADEFINITIVEEDITION = register("valleymansbeans_australiadefinitiveedition", ValleymansbeansAustraliadefinitiveeditionItem::new);
	public static final DeferredItem<Item> BOWBEANS = register("bowbeans", BowbeansItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_SEAFOODPIZZAANDCHOCOMILK = register("valleymansbeans_seafoodpizzaandchocomilk", ValleymansbeansSeafoodpizzaandchocomilkItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_BLACKTEAANDSOYSAUCE = register("valleymansbeans_blackteaandsoysauce", ValleymansbeansBlackteaandsoysauceItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSAPPLEANDTANGERINE = register("valleymansbeansappleandtangerine", ValleymansbeansappleandtangerineItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSEXOTICMEATS = register("valleymansbeansexoticmeats", ValleymansbeansexoticmeatsItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_CUBANCIGARSMOKED = register("valleymansbeans_cubancigarsmoked", ValleymansbeansCubancigarsmokedItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSBANANA = register("valleymansbeansbanana", ValleymansbeansbananaItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_BRAZILIANSUSHI = register("valleymansbeans_braziliansushi", ValleymansbeansBraziliansushiItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSCHERRY = register("valleymansbeanscherry", ValleymansbeanscherryItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSEXTRASPICYRAISINS = register("valleymansbeansextraspicyraisins", ValleymansbeansextraspicyraisinsItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSFERMENTEDSHARK = register("valleymansbeansfermentedshark", ValleymansbeansfermentedsharkItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSMILKDURIAN = register("valleymansbeansmilkdurian", ValleymansbeansmilkdurianItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSCOKEANDLIQUIDCHEESE = register("valleymansbeanscokeandliquidcheese", ValleymansbeanscokeandliquidcheeseItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSAUSTRALIA = register("valleymansbeansaustralia", ValleymansbeansaustraliaItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSAVOCADOANDCHOCOLATECHIPS = register("valleymansbeansavocadoandchocolatechips", ValleymansbeansavocadoandchocolatechipsItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSSMARTIIESANDSKEETTLES = register("valleymansbeanssmartiiesandskeettles", ValleymansbeanssmartiiesandskeettlesItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSGREENTEAKITKATANDWAGYUBEEFTALLOW = register("valleymansbeansgreenteakitkatandwagyubeeftallow", ValleymansbeansgreenteakitkatandwagyubeeftallowItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSSOURGUMMYWORMS = register("valleymansbeanssourgummyworms", ValleymansbeanssourgummywormsItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSMILK = register("valleymansbeansmilk", ValleymansbeansmilkItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSMINTANDLICORICE = register("valleymansbeansmintandlicorice", ValleymansbeansmintandlicoriceItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSCOTTONCANDY = register("valleymansbeanscottoncandy", ValleymansbeanscottoncandyItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSTOOTHPASTEANDORANGEJUICE = register("valleymansbeanstoothpasteandorangejuice", ValleymansbeanstoothpasteandorangejuiceItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSCREAMANDLEMON = register("valleymansbeanscreamandlemon", ValleymansbeanscreamandlemonItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSSEASONEDCHEESE = register("valleymansbeansseasonedcheese", ValleymansbeansseasonedcheeseItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANSSTRAWBERRYANDCHOCOLATE = register("valleymansbeansstrawberryandchocolate", ValleymansbeansstrawberryandchocolateItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEAN_CHRISTMAS_2023 = register("valleymansbean_christmas_2023", ValleymansbeanChristmas2023Item::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_VETERANS_DAYSPECIAL = register("valleymansbeans_veterans_dayspecial", ValleymansbeansVeteransDayspecialItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_HALLOWEENSPECIAL = register("valleymansbeans_halloweenspecial", ValleymansbeansHalloweenspecialItem::new);
	public static final DeferredItem<Item> VALLEYMANSBEANS_EASTERSPECIAL = register("valleymansbeans_easterspecial", ValleymansbeansEasterspecialItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
