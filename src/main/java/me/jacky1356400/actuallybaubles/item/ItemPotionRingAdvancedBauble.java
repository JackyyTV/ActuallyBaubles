package me.jacky1356400.actuallybaubles.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import de.ellpeck.actuallyadditions.mod.items.ItemPotionRing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemPotionRingAdvancedBauble extends ItemPotionRing implements IBauble {

    public ItemPotionRingAdvancedBauble(boolean isAdvanced, String name) {
        super(isAdvanced, name);
        setUnlocalizedName("actuallyadditions.itemPotionRingAdvanced");
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
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, i, new ModelResourceLocation("actuallyadditions:itemPotionRingAdvanced", "inventory"));
        }
    }

}
