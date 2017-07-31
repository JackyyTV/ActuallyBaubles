package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import me.jacky1356400.actuallybaubles.item.ItemMagnetRingBauble;
import me.jacky1356400.actuallybaubles.item.ItemPotionRingAdvancedBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = "ActuallyBaubles", dependencies = ActuallyBaubles.DEPENDS, useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.0";
    public static final String MODID = "actuallybaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:baubles;";
    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public String getTranslatedTabLabel() {
            return "Actually Baubles";
        }

        @Override
        public ItemStack getTabIconItem(){
            return new ItemStack(InitItems.itemMisc, 1 , 6);
        }
    };
    public static ItemMagnetRingBauble magnetRing;
    public static ItemPotionRingAdvancedBauble potionRingAdvanced;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        magnetRing = GameRegistry.register(new ItemMagnetRingBauble("magnet_ring_bauble"));
        potionRingAdvanced = GameRegistry.register(new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble"));
        magnetRing.initModel();
        potionRingAdvanced.initModel();
        GameRegistry.addShapelessRecipe(new ItemStack(magnetRing), InitItems.itemMagnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemMagnetRing), magnetRing);
        for (int i = 0; i < ALL_RINGS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(potionRingAdvanced, 1, i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i));
            GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemPotionRingAdvanced, 1, i), new ItemStack(potionRingAdvanced, 1, i));
        }
    }

}
