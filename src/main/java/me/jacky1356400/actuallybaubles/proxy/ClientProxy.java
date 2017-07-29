package me.jacky1356400.actuallybaubles.proxy;

import me.jacky1356400.actuallybaubles.ActuallyBaublesItems;
import me.jacky1356400.actuallybaubles.ActuallyBaublesRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    public void preInit(FMLPreInitializationEvent e){
        super.preInit(e);
    }

    public void init(FMLInitializationEvent e){
        super.init(e);
        ActuallyBaublesItems.initModels();
        ActuallyBaublesRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent e){
        super.postInit(e);
    }

}
