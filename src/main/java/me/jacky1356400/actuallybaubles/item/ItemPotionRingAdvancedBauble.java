package me.jacky1356400.actuallybaubles.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import de.ellpeck.actuallyadditions.mod.items.ItemPotionRing;
import me.jacky1356400.actuallybaubles.ActuallyBaubles;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemPotionRingAdvancedBauble extends ItemPotionRing implements IBauble {

    public ItemPotionRingAdvancedBauble(boolean isAdvanced, String name) {
        super(isAdvanced, name);
        setUnlocalizedName("actuallyadditions.itemPotionRingAdvanced");
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
