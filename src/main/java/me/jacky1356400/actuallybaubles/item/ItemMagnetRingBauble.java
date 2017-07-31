package me.jacky1356400.actuallybaubles.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import de.ellpeck.actuallyadditions.mod.items.ItemMagnetRing;
import me.jacky1356400.actuallybaubles.ActuallyBaubles;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemMagnetRingBauble extends ItemMagnetRing implements IBauble {

    public ItemMagnetRingBauble(String name) {
        super(name);
        setUnlocalizedName("actuallyadditions.item_suction_ring");
        setCreativeTab(ActuallyBaubles.TAB);
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

}
