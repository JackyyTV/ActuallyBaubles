package me.jacky1356400.actuallybaubles.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;
import static me.jacky1356400.actuallybaubles.ActuallyBaubles.*;

public class ClientProxy extends CommonProxy {

    public void init(FMLInitializationEvent event) {
        super.init(event);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(magnetRing, 0, new ModelResourceLocation("actuallyadditions:itemSuctionRing", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(battery, 0, new ModelResourceLocation("actuallyadditions:itemBattery", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryDouble, 0, new ModelResourceLocation("actuallyadditions:itemBatteryDouble", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryTriple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryTriple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryQuadruple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryQuadruple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(batteryQuintuple, 0, new ModelResourceLocation("actuallyadditions:itemBatteryQuintuple", "inventory"));
        for (int i = 0; i < ALL_RINGS.length; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(potionRingAdvanced, i, new ModelResourceLocation("actuallyadditions:itemPotionRingAdvanced", "inventory"));
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color, potionRingAdvanced);
        }
    }

}
