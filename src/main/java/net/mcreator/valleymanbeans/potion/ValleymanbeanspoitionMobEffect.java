
package net.mcreator.valleymanbeans.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionStartedappliedProcedure;

public class ValleymanbeanspoitionMobEffect extends MobEffect {
	public ValleymanbeanspoitionMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ValleymanbeanspoitionPotionStartedappliedProcedure.execute(entity);
	}
}
