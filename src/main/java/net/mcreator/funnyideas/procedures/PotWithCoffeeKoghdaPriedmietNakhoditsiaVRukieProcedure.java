package net.mcreator.funnyideas.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.funnyideas.FunnyideasModElements;

import java.util.Map;

@FunnyideasModElements.ModElement.Tag
public class PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukieProcedure extends FunnyideasModElements.ModElement {
	public PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukieProcedure(FunnyideasModElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukie!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukie!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukie!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukie!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
	}
}
