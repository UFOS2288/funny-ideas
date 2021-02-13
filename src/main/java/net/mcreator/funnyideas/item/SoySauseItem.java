
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.funnyideas.procedures.BeetSauseFoodEatenProcedure;
import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.FunnyideasModElements;

import java.util.Map;
import java.util.HashMap;

@FunnyideasModElements.ModElement.Tag
public class SoySauseItem extends FunnyideasModElements.ModElement {
	@ObjectHolder("funnyideas:soy_sause")
	public static final Item block = null;
	public SoySauseItem(FunnyideasModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(UFOSIdeasTabItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(17f).build()));
			setRegistryName("soy_sause");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 16;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				BeetSauseFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
