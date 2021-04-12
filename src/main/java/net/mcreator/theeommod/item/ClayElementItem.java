
package net.mcreator.theeommod.item;

@TheEomModModElements.ModElement.Tag
public class ClayElementItem extends TheEomModModElements.ModElement {

	@ObjectHolder("the_eom_mod:clay_element")
	public static final Item block = null;

	public ClayElementItem(TheEomModModElements instance) {
		super(instance, 76);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("clay_element");
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
