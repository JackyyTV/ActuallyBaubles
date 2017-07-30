package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ActuallyBaublesTab extends CreativeTabs {

    public static final ActuallyBaublesTab INSTANCE = new ActuallyBaublesTab();

    public ActuallyBaublesTab() {
        super(ActuallyBaubles.MODID);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Actually Baubles";
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(InitItems.itemMisc, 1 , 6);
    }

}
