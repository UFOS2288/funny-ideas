package net.mcreator.funnyideas.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.mcreator.funnyideas.block.CacheBlock;
import net.mcreator.funnyideas.Funnyideas1ModElements;

import java.util.Map;

@Funnyideas1ModElements.ModElement.Tag
public class CacheNaBlokieNazhataPravaiaKnopkaMyshiProcedure extends Funnyideas1ModElements.ModElement {
	public CacheNaBlokieNazhataPravaiaKnopkaMyshiProcedure(Funnyideas1ModElements instance) {
		super(instance, 67);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure CacheNaBlokieNazhataPravaiaKnopkaMyshi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure CacheNaBlokieNazhataPravaiaKnopkaMyshi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure CacheNaBlokieNazhataPravaiaKnopkaMyshi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure CacheNaBlokieNazhataPravaiaKnopkaMyshi!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		if (!world.getWorld().isRemote) {
			ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(CacheBlock.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			world.addEntity(entityToSpawn);
		}
	}
}
