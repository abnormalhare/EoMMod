
package net.mcreator.theeommod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.theeommod.itemgroup.EomModItemGroup;
import net.mcreator.theeommod.TheEomModModElements;

@TheEomModModElements.ModElement.Tag
public class EarthquakeItem extends TheEomModModElements.ModElement {
	@ObjectHolder("the_eom_mod:earthquake")
	public static final Item block = null;
	public EarthquakeItem(TheEomModModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EomModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("earthquake");
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
