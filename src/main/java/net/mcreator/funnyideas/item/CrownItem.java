
package net.mcreator.funnyideas.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.funnyideas.itemgroup.UFOSIdeasTabItemGroup;
import net.mcreator.funnyideas.Funnyideas1ModElements;

@Funnyideas1ModElements.ModElement.Tag
public class CrownItem extends Funnyideas1ModElements.ModElement {
	@ObjectHolder("funnyideas1:crown_helmet")
	public static final Item helmet = null;
	@ObjectHolder("funnyideas1:crown_chestplate")
	public static final Item body = null;
	@ObjectHolder("funnyideas1:crown_leggings")
	public static final Item legs = null;
	@ObjectHolder("funnyideas1:crown_boots")
	public static final Item boots = null;
	public CrownItem(Funnyideas1ModElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 1}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup"));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "crown";
			}

			public float getToughness() {
				return 1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(UFOSIdeasTabItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "funnyideas1:textures/models/armor/crown__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("crown_helmet"));
	}
}
