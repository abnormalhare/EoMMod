
package net.mcreator.theeommod.item;

@TheEomModModElements.ModElement.Tag
public class PressureItem extends TheEomModModElements.ModElement {

	@ObjectHolder("the_eom_mod:pressure")
	public static final Item block = null;

	public PressureItem(TheEomModModElements instance) {
		super(instance, 31);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(EomModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("pressure");
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
