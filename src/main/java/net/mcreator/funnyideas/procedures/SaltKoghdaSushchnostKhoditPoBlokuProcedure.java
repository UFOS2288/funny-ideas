package net.mcreator.funnyideas.procedures;

import net.minecraft.util.Hand;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.funnyideas.Funnyideas1ModElements;

import java.util.Map;
import java.util.Collections;

@Funnyideas1ModElements.ModElement.Tag
public class SaltKoghdaSushchnostKhoditPoBlokuProcedure extends Funnyideas1ModElements.ModElement {
	public SaltKoghdaSushchnostKhoditPoBlokuProcedure(Funnyideas1ModElements instance) {
		super(instance, 163);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SaltKoghdaSushchnostKhoditPoBloku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure SaltKoghdaSushchnostKhoditPoBloku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure SaltKoghdaSushchnostKhoditPoBloku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure SaltKoghdaSushchnostKhoditPoBloku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((x + 0.5), (y + 1), (z + 0.5));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 0.5), (y + 1), (z + 0.5), _ent.rotationYaw, _ent.rotationPitch,
						Collections.emptySet());
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 4, (int) 1));
	}
}
