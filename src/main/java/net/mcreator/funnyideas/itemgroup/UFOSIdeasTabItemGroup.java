
package net.mcreator.funnyideas.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.funnyideas.Funnyideas1ModElements;

@Funnyideas1ModElements.ModElement.Tag
public class UFOSIdeasTabItemGroup extends Funnyideas1ModElements.ModElement {
	public UFOSIdeasTabItemGroup(Funnyideas1ModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabufos_ideas_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.COMMAND_BLOCK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
