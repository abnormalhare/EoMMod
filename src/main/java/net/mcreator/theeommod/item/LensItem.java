
package net.mcreator.theeommod.item;

@TheEomModModElements.ModElement.Tag
public class LensItem extends TheEomModModElements.ModElement {

	@ObjectHolder("the_eom_mod:lens")
	public static final Item block = null;

	public LensItem(TheEomModModElements instance) {
		super(instance, 74);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("lens");
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
