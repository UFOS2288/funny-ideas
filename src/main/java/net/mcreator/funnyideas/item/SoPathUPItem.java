
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.FunnyideasModElements;

@FunnyideasModElements.ModElement.Tag
public class SoPathUPItem extends FunnyideasModElements.ModElement {
	@ObjectHolder("funnyideas:so_path_up")
	public static final Item block = null;
	public SoPathUPItem(FunnyideasModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FunnyideasModElements.sounds.get(new ResourceLocation("funnyideas:videoplayback")),
					new Item.Properties().group(UFOSIdeasTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("so_path_up");
		}
	}
}
