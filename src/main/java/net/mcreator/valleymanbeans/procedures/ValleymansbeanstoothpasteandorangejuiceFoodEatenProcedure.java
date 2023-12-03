package net.mcreator.valleymanbeans.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class ValleymansbeanstoothpasteandorangejuiceFoodEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 360, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 360, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 360, 1, false, false));
		world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.LAVA.defaultBlockState(), 3);
	}
}
