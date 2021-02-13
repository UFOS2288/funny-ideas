package net.mcreator.funnyideas.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.funnyideas.FunnyideasModElements;

import java.util.Map;

@FunnyideasModElements.ModElement.Tag
public class RottenFlashCandyFoodEatenProcedure extends FunnyideasModElements.ModElement {
	public RottenFlashCandyFoodEatenProcedure(FunnyideasModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RottenFlashCandyFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 160, (int) 10, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 300, (int) 2, (false), (false)));
	}
}
