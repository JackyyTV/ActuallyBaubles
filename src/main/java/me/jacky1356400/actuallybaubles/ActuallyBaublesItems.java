package me.jacky1356400.actuallybaubles;

import me.jacky1356400.actuallybaubles.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ActuallyBaublesItems {
    public static ItemMagnetRingBauble magnetRing;
    public static ItemPotionRingAdvancedBauble potionRingAdvanced;

    public static void init(){
        magnetRing = GameRegistry.register(new ItemMagnetRingBauble("magnet_ring_bauble"));
        potionRingAdvanced = GameRegistry.register(new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble"));
    }

    public static void initModels(){
        magnetRing.initModel();
        potionRingAdvanced.initModel();
    }
}
