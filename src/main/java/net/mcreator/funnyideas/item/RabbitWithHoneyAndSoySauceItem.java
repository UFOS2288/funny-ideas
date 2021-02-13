
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.FunnyideasModElements;

@FunnyideasModElements.ModElement.Tag
public class RabbitWithHoneyAndSoySauceItem extends FunnyideasModElements.ModElement {
	@ObjectHolder("funnyideas:rabbit_with_honey_and_soy_sauce")
	public static final Item block = null;
	public RabbitWithHoneyAndSoySauceItem(FunnyideasModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(UFOSIdeasTabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(10).saturation(4f).meat().build()));
			setRegistryName("rabbit_with_honey_and_soy_sauce");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 37;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
