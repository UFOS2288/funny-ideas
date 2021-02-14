
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.funnyideas.procedures.PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukieProcedure;
import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.Funnyideas1ModElements;

import java.util.Map;
import java.util.HashMap;

@Funnyideas1ModElements.ModElement.Tag
public class PotWithCoffeeItem extends Funnyideas1ModElements.ModElement {
	@ObjectHolder("funnyideas1:pot_with_coffee")
	public static final Item block = null;
	public PotWithCoffeeItem(Funnyideas1ModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UFOSIdeasTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("pot_with_coffee");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(PotItem.block, (int) (1));
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (selected) {
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				PotWithCoffeeKoghdaPriedmietNakhoditsiaVRukieProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
