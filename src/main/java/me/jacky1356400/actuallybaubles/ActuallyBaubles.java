package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import me.jacky1356400.actuallybaubles.item.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = "ActuallyBaubles", dependencies = ActuallyBaubles.DEPENDS, useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.1";
    public static final String MODID = "actuallybaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:Baubles;";
    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public String getTranslatedTabLabel() {
            return "Actually Baubles";
        }
        @Override
        public Item getTabIconItem() {
            return InitItems.itemMisc;
        }
        @Override
        public int getIconItemDamage() {
            return 6;
        }
    };
    public static ItemMagnetRingBauble magnetRing = new ItemMagnetRingBauble("magnet_ring_bauble");
    public static ItemPotionRingAdvancedBauble potionRingAdvanced = new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble");
    public static ItemBatteryBauble battery = new ItemBatteryBauble("battery_bauble", 1000000, 5000);
    public static ItemBatteryBauble batteryDouble = new ItemBatteryBauble("battery_double_bauble", 2000000, 10000);
    public static ItemBatteryBauble batteryTriple = new ItemBatteryBauble("battery_triple_bauble", 4000000, 15000);
    public static ItemBatteryBauble batteryQuadruple = new ItemBatteryBauble("battery_quadruple_bauble", 8000000, 20000);
    public static ItemBatteryBauble batteryQuintuple = new ItemBatteryBauble("battery_quintuple_bauble", 16000000, 25000);
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.register(magnetRing);
        GameRegistry.register(potionRingAdvanced);
        GameRegistry.register(battery.setUnlocalizedName("actuallyadditions.itemBattery"));
        GameRegistry.register(batteryDouble.setUnlocalizedName("actuallyadditions.itemBatteryDouble"));
        GameRegistry.register(batteryTriple.setUnlocalizedName("actuallyadditions.itemBatteryTriple"));
        GameRegistry.register(batteryQuadruple.setUnlocalizedName("actuallyadditions.itemBatteryQuadruple"));
        GameRegistry.register(batteryQuintuple.setUnlocalizedName("actuallyadditions.itemBatteryQuintuple"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(magnetRing, 0, new ModelResourceLocation("actuallyadditions:itemSuctionRing", "inventory"));
        GameRegistry.addShapelessRecipe(new ItemStack(magnetRing), InitItems.itemMagnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemMagnetRing), magnetRing);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(battery, 0, new ModelResourceLocation("actuallyadditions:itemBattery", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryDouble, 0, new ModelResourceLocation("actuallyadditions:itemBatteryDouble", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryTriple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryTriple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryQuadruple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryQuadruple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryQuintuple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryQuintuple", "inventory"));
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
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(potionRingAdvanced, i, new ModelResourceLocation("actuallyadditions:itemPotionRingAdvanced", "inventory"));
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color, potionRingAdvanced);
            GameRegistry.addShapelessRecipe(new ItemStack(potionRingAdvanced, 1, i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i));
            GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemPotionRingAdvanced, 1, i), new ItemStack(potionRingAdvanced, 1, i));
        }
    }

}
