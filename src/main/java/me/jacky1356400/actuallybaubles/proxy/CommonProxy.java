package me.jacky1356400.actuallybaubles.proxy;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;
import static me.jacky1356400.actuallybaubles.ActuallyBaubles.*;

public class CommonProxy {

    public void init(FMLInitializationEvent event) {
        GameRegistry.register(magnetRing);
        GameRegistry.register(potionRingAdvanced);
        GameRegistry.register(battery.setUnlocalizedName("actuallyadditions.itemBattery"));
        GameRegistry.register(batteryDouble.setUnlocalizedName("actuallyadditions.itemBatteryDouble"));
        GameRegistry.register(batteryTriple.setUnlocalizedName("actuallyadditions.itemBatteryTriple"));
        GameRegistry.register(batteryQuadruple.setUnlocalizedName("actuallyadditions.itemBatteryQuadruple"));
        GameRegistry.register(batteryQuintuple.setUnlocalizedName("actuallyadditions.itemBatteryQuintuple"));
        GameRegistry.addShapelessRecipe(new ItemStack(magnetRing), InitItems.itemMagnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemMagnetRing), magnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(battery), InitItems.itemBattery);
        GameRegistry.addShapelessRecipe(new ItemStack(batteryDouble), InitItems.itemBatteryDouble);
        GameRegistry.addShapelessRecipe(new ItemStack(batteryTriple), InitItems.itemBatteryTriple);
        GameRegistry.addShapelessRecipe(new ItemStack(batteryQuadruple), InitItems.itemBatteryQuadruple);
        GameRegistry.addShapelessRecipe(new ItemStack(batteryQuintuple), InitItems.itemBatteryQuintuple);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBattery), battery);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryDouble), batteryDouble);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryTriple), batteryTriple);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryQuadruple), batteryQuadruple);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryQuintuple), batteryQuintuple);
        for (int i = 0; i < ALL_RINGS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(potionRingAdvanced, 1, i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i));
            GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemPotionRingAdvanced, 1, i), new ItemStack(potionRingAdvanced, 1, i));
        }
    }

}
