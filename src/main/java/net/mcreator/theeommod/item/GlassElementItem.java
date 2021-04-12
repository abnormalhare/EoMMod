
package net.mcreator.theeommod.item;

@TheEomModModElements.ModElement.Tag
public class GlassElementItem extends TheEomModModElements.ModElement {

	@ObjectHolder("the_eom_mod:glass_element")
	public static final Item block = null;

	public GlassElementItem(TheEomModModElements instance) {
		super(instance, 72);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("glass_element");
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
