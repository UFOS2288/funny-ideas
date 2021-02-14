package net.mcreator.funnyideas.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.funnyideas.Funnyideas1ModElements;

import java.util.Map;

@Funnyideas1ModElements.ModElement.Tag
public class SaltGunKoghdaPuliaPopadaietVBlokProcedure extends Funnyideas1ModElements.ModElement {
	public SaltGunKoghdaPuliaPopadaietVBlokProcedure(Funnyideas1ModElements instance) {
		super(instance, 161);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure SaltGunKoghdaPuliaPopadaietVBlok!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure SaltGunKoghdaPuliaPopadaietVBlok!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure SaltGunKoghdaPuliaPopadaietVBlok!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure SaltGunKoghdaPuliaPopadaietVBlok!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World)
			world.getWorld().notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) z),
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
	}
}
