package jackyy.actuallybaubles.proxy;

import jackyy.actuallybaubles.registry.ModItems;
import jackyy.actuallybaubles.registry.ModRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
        ModItems.init();
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

}
