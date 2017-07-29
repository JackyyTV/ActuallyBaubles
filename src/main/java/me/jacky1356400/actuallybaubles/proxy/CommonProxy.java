package me.jacky1356400.actuallybaubles.proxy;

import me.jacky1356400.actuallybaubles.ActuallyBaublesItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
    }

    public void init(FMLInitializationEvent e){
        ActuallyBaublesItems.init();
    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
