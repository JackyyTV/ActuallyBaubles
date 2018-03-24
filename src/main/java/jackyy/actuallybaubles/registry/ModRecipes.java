package jackyy.actuallybaubles.registry;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

public class ModRecipes {

    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.magnetRing), InitItems.itemMagnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemMagnetRing), ModItems.magnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.battery), InitItems.itemBattery);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.batteryDouble), InitItems.itemBatteryDouble);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.batteryTriple), InitItems.itemBatteryTriple);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.batteryQuadruple), InitItems.itemBatteryQuadruple);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.batteryQuintuple), InitItems.itemBatteryQuintuple);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBattery), ModItems.battery);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryDouble), ModItems.batteryDouble);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryTriple), ModItems.batteryTriple);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryQuadruple), ModItems.batteryQuadruple);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemBatteryQuintuple), ModItems.batteryQuintuple);
        for (int i = 0; i < ALL_RINGS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.potionRingAdvanced, 1, i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i));
            GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemPotionRingAdvanced, 1, i), new ItemStack(ModItems.potionRingAdvanced, 1, i));
        }
    }

}
