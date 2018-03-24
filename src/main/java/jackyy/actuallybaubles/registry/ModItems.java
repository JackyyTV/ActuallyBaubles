package jackyy.actuallybaubles.registry;

import jackyy.actuallybaubles.item.ItemBatteryBauble;
import jackyy.actuallybaubles.item.ItemMagnetRingBauble;
import jackyy.actuallybaubles.item.ItemPotionRingAdvancedBauble;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

public class ModItems {

    public static ItemMagnetRingBauble magnetRing = new ItemMagnetRingBauble("magnet_ring_bauble");
    public static ItemPotionRingAdvancedBauble potionRingAdvanced = new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble");
    public static ItemBatteryBauble battery = new ItemBatteryBauble("battery_bauble", 1000000, 5000);
    public static ItemBatteryBauble batteryDouble = new ItemBatteryBauble("battery_double_bauble", 2000000, 10000);
    public static ItemBatteryBauble batteryTriple = new ItemBatteryBauble("battery_triple_bauble", 4000000, 15000);
    public static ItemBatteryBauble batteryQuadruple = new ItemBatteryBauble("battery_quadruple_bauble", 8000000, 20000);
    public static ItemBatteryBauble batteryQuintuple = new ItemBatteryBauble("battery_quintuple_bauble", 16000000, 25000);

    public static void init() {
        GameRegistry.register(magnetRing);
        GameRegistry.register(potionRingAdvanced);
        GameRegistry.register(battery.setUnlocalizedName("actuallyadditions.itemBattery"));
        GameRegistry.register(batteryDouble.setUnlocalizedName("actuallyadditions.itemBatteryDouble"));
        GameRegistry.register(batteryTriple.setUnlocalizedName("actuallyadditions.itemBatteryTriple"));
        GameRegistry.register(batteryQuadruple.setUnlocalizedName("actuallyadditions.itemBatteryQuadruple"));
        GameRegistry.register(batteryQuintuple.setUnlocalizedName("actuallyadditions.itemBatteryQuintuple"));
    }

    @SideOnly(Side.CLIENT)
    public static void initClient() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.magnetRing, 0, new ModelResourceLocation("actuallyadditions:itemSuctionRing", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.battery, 0, new ModelResourceLocation("actuallyadditions:itemBattery", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.batteryDouble, 0, new ModelResourceLocation("actuallyadditions:itemBatteryDouble", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.batteryTriple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryTriple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.batteryQuadruple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryQuadruple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.batteryQuintuple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryQuintuple", "inventory"));
        for (int i = 0; i < ALL_RINGS.length; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.potionRingAdvanced, i, new ModelResourceLocation("actuallyadditions:itemPotionRingAdvanced", "inventory"));
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color, ModItems.potionRingAdvanced);
        }
    }

}
