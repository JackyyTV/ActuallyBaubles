package jackyy.actuallybaubles;

import jackyy.actuallybaubles.proxy.CommonProxy;
import jackyy.actuallybaubles.registry.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = ActuallyBaubles.MODNAME, dependencies = ActuallyBaubles.DEPENDS, acceptedMinecraftVersions = ActuallyBaubles.MCVERSION, certificateFingerprint = "@FINGERPRINT@", useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.2";
    public static final String MCVERSION = "[1.10,1.11)";
    public static final String MODID = "actuallybaubles";
    public static final String MODNAME = "ActuallyBaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:Baubles;";
    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.magnetRing;
        }
    };

    public static Logger logger = LogManager.getLogger(MODNAME);

    @SidedProxy(serverSide = "jackyy.actuallybaubles.proxy.CommonProxy", clientSide = "jackyy.actuallybaubles.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void onFingerprintViolation(FMLFingerprintViolationEvent event) {
        logger.warn("Invalid fingerprint detected! The file " + event.getSource().getName() + " may have been modified. This will NOT be supported by the mod author!");
    }

}
