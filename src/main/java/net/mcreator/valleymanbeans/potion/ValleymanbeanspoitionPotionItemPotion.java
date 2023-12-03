
package net.mcreator.valleymanbeans.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValleymanbeanspoitionPotionItemPotion {
	@ObjectHolder("valleyman_beans:valleyman_beans_poition")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(ValleymanbeanspoitionPotionEffect.potion, 3600, 0, false, true));
			setRegistryName("valleyman_beans_poition");
		}
	}
}
