
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.Funnyideas1ModElements;

@Funnyideas1ModElements.ModElement.Tag
public class CupItem extends Funnyideas1ModElements.ModElement {
	@ObjectHolder("funnyideas1:cup")
	public static final Item block = null;
	public CupItem(Funnyideas1ModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UFOSIdeasTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("cup");
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
	}
}
