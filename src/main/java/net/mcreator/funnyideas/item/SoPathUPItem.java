
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.Funnyideas1ModElements;

@Funnyideas1ModElements.ModElement.Tag
public class SoPathUPItem extends Funnyideas1ModElements.ModElement {
	@ObjectHolder("funnyideas1:so_path_up")
	public static final Item block = null;
	public SoPathUPItem(Funnyideas1ModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, Funnyideas1ModElements.sounds.get(new ResourceLocation("funnyideas1:videoplayback")),
					new Item.Properties().group(UFOSIdeasTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("so_path_up");
		}
	}
}
