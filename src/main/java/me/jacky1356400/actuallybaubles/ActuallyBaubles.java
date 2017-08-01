package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import me.jacky1356400.actuallybaubles.item.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = "ActuallyBaubles", dependencies = ActuallyBaubles.DEPENDS, useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.1";
    public static final String MODID = "actuallybaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:baubles;";
    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public String getTranslatedTabLabel() {
            return "Actually Baubles";
        }
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(InitItems.itemMisc, 1, 6);
        }
    };
    public static ItemMagnetRingBauble magnetRing = new ItemMagnetRingBauble("magnet_ring_bauble");
    public static ItemPotionRingAdvancedBauble potionRingAdvanced = new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble");
    public static ItemBatteryBauble battery = new ItemBatteryBauble("battery_bauble", 200000, 1000);
    public static ItemBatteryBauble batteryDouble = new ItemBatteryBauble("battery_double_bauble", 350000, 5000);
    public static ItemBatteryBauble batteryTriple = new ItemBatteryBauble("battery_triple_bauble", 600000, 10000);
    public static ItemBatteryBauble batteryQuadruple = new ItemBatteryBauble("battery_quadruple_bauble", 1000000, 30000);
    public static ItemBatteryBauble batteryQuintuple = new ItemBatteryBauble("battery_quintuple_bauble", 2000000, 100000);
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.register(magnetRing);
        GameRegistry.register(potionRingAdvanced);
        GameRegistry.register(battery.setUnlocalizedName("actuallyadditions.item_battery"));
        GameRegistry.register(batteryDouble.setUnlocalizedName("actuallyadditions.item_battery_double"));
        GameRegistry.register(batteryTriple.setUnlocalizedName("actuallyadditions.item_battery_triple"));
        GameRegistry.register(batteryQuadruple.setUnlocalizedName("actuallyadditions.item_battery_quadruple"));
        GameRegistry.register(batteryQuintuple.setUnlocalizedName("actuallyadditions.item_battery_quintuple"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(magnetRing, 0, new ModelResourceLocation("actuallyadditions:item_suction_ring", "inventory"));
        GameRegistry.addShapelessRecipe(new ItemStack(magnetRing), InitItems.itemMagnetRing);
        GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemMagnetRing), magnetRing);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(battery, 0, new ModelResourceLocation("actuallyadditions:item_battery", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryDouble, 0, new ModelResourceLocation("actuallyadditions:item_battery_double", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryTriple, 0, new ModelResourceLocation("actuallyadditions:item_battery_triple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryQuadruple, 0, new ModelResourceLocation("actuallyadditions:item_battery_quadruple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryQuintuple, 0, new ModelResourceLocation("actuallyadditions:item_battery_quintuple", "inventory"));
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
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(potionRingAdvanced, i, new ModelResourceLocation("actuallyadditions:item_potion_ring_advanced", "inventory"));
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color, potionRingAdvanced);
            GameRegistry.addShapelessRecipe(new ItemStack(potionRingAdvanced, 1, i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i));
            GameRegistry.addShapelessRecipe(new ItemStack(InitItems.itemPotionRingAdvanced, 1, i), new ItemStack(potionRingAdvanced, 1, i));
        }
    }

}
