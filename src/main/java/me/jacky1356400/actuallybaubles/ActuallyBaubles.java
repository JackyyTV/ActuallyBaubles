package me.jacky1356400.actuallybaubles;

import me.jacky1356400.actuallybaubles.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = "ActuallyBaubles", dependencies = ActuallyBaubles.DEPENDS, useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.0";
    public static final String MODID = "actuallybaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:Baubles;";

    @SidedProxy(serverSide = "me.jacky1356400.actuallybaubles.proxy.CommonProxy", clientSide = "me.jacky1356400.actuallybaubles.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }

}
