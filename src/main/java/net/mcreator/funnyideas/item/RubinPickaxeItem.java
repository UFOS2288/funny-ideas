
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.FunnyideasModElements;

@FunnyideasModElements.ModElement.Tag
public class RubinPickaxeItem extends FunnyideasModElements.ModElement {
	@ObjectHolder("funnyideas:rubin_pickaxe")
	public static final Item block = null;
	public RubinPickaxeItem(FunnyideasModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubinIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(UFOSIdeasTabItemGroup.tab)) {
		}.setRegistryName("rubin_pickaxe"));
	}
}
