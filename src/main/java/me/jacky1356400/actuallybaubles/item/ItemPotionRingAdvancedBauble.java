package me.jacky1356400.actuallybaubles.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import de.ellpeck.actuallyadditions.mod.items.ItemPotionRing;
import me.jacky1356400.actuallybaubles.ActuallyBaublesTab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemPotionRingAdvancedBauble extends ItemPotionRing implements IBauble {

    public ItemPotionRingAdvancedBauble(boolean isAdvanced, String name) {
        super(isAdvanced, name);
        setUnlocalizedName("actuallyadditions.itemPotionRingAdvanced");
        setCreativeTab(ActuallyBaublesTab.INSTANCE);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.RING;
    }

    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    public boolean willAutoSync(ItemStack itemstack, EntityLivingBase player) {
        return false;
    }

    public void onWornTick(ItemStack stack, EntityLivingBase player) {
        onUpdate(stack, player.getEntityWorld(), player, 0, false);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        for (int i = 0; i < ALL_RINGS.length; i++) {
            ModelResourceLocation location = new ModelResourceLocation("actuallyadditions:itemPotionRingAdvanced", "inventory");
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, i, location);
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(
                    new IItemColor(){
                        @Override
                        public int getColorFromItemstack(ItemStack stack, int tintIndex){
                            return stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color;
                        }
                    }
                    , this);
        }
    }

}
