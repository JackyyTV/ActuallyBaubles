package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

public class ActuallyBaublesRecipes {
    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(ActuallyBaublesItems.magnetRing), InitItems.itemMagnetRing);
        for (int i = 0; i < ALL_RINGS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ActuallyBaublesItems.potionRingAdvanced, 1, i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i));
        }
    }
}
