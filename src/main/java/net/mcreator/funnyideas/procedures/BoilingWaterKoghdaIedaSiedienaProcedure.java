package net.mcreator.funnyideas.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.funnyideas.FunnyideasModElements;

import java.util.Map;

@FunnyideasModElements.ModElement.Tag
public class BoilingWaterKoghdaIedaSiedienaProcedure extends FunnyideasModElements.ModElement {
	public BoilingWaterKoghdaIedaSiedienaProcedure(FunnyideasModElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BoilingWaterKoghdaIedaSiediena!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, (int) 1, (int) 1));
	}
}
