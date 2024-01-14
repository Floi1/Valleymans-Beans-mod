
package net.mcreator.valleymanbeans.potion;

import net.minecraft.world.World;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effect;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.LivingEntity;

import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionStartedappliedProcedure;
import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionExpiresProcedure;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class ValleymanbeanspoitionPotionEffect extends Effect {
	public ValleymanbeanspoitionPotionEffect() {
		super(EffectType.HARMFUL, -256);
	}

	@Override
	public String getName() {
		return "effect.valleyman_beans.valleyman_beans_poition";
	}

	@Override
	public boolean isBeneficial() {
		return true;
	}

	@Override
	public void applyAttributesModifiersToEntity(LivingEntity entity, AttributeModifierManager attributeMapIn, int amplifier) {
		World world = entity.world;
		double x = entity.getPosX();
		double y = entity.getPosY();
		double z = entity.getPosZ();
		ValleymanbeanspoitionPotionStartedappliedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
				.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
	}

	@Override
	public void removeAttributesModifiersFromEntity(LivingEntity entity, AttributeModifierManager attributeMapIn, int amplifier) {
		super.removeAttributesModifiersFromEntity(entity, attributeMapIn, amplifier);
		World world = entity.world;
		double x = entity.getPosX();
		double y = entity.getPosY();
		double z = entity.getPosZ();
		ValleymanbeanspoitionPotionExpiresProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
	}

	@Override
	public boolean isReady(int duration, int amplifier) {
		return true;
	}
}
