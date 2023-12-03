package net.mcreator.valleymanbeans.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ValleymanBeansMod;

import java.util.Map;

public class ValleymansbeansdreamfishFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ValleymanBeansMod.LOGGER.warn("Failed to load dependency entity for procedure ValleymansbeansdreamfishFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 600, (int) 122, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 600, (int) 122, (false), (false)));
		if (Math.random() <= 0.2) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						" In a funky forest, a tipsy T-Rex named Terry stumbled into a time portal, arriving in Dinoopolis. He partied with stylish dinosaurs, danced to pterodactyl jazz, and became a legend as the \"Dancing Dino.\" Returning home, his wild adventure inspired generations to embrace the spirit of partying."),
						(false));
			}
		} else if (Math.random() <= 0.4) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						"In a hidden valley, a mischievous dinosaur named Dizzy hatched from his egg with an insatiable curiosity. He roamed the land, causing playful havoc, and his infectious laughter echoed through the canyons. Dizzy's antics brought joy to all, reminding everyone to embrace their inner child and cherish every moment."),
						(false));
			}
		} else if (Math.random() <= 0.6) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						"Deep within a forgotten jungle, Rex, a timid dinosaur, discovered a magical flower. Its petals shimmered with a radiant glow, granting Rex the power to communicate with all creatures. With newfound confidence, Rex united dinosaurs and humans, fostering a world where understanding and harmony prevailed."),
						(false));
			}
		} else if (Math.random() <= 0.8) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						"In a desert oasis, a daring dinosaur named Blaze soared through the skies with fiery wings. With each beat, flames danced to the rhythm of adventure. Blaze's scorching spirit inspired other dinosaurs to embrace their uniqueness and pursue their wildest dreams, igniting a revolution of self-expression."),
						(false));
			}
		} else if (Math.random() <= 1) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						"In a frozen tundra, Frosty, a gentle-hearted dinosaur, possessed the extraordinary ability to freeze time. With a touch, she could suspend the world, allowing moments of tranquility and reflection. Frosty taught her fellow dinosaurs the importance of stillness, reminding them to cherish the beauty that lies in the present."),
						(false));
			}
		}
	}
}
