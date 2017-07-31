package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
import me.jacky1356400.actuallybaubles.item.ItemBatteryBauble;
import me.jacky1356400.actuallybaubles.item.ItemMagnetRingBauble;
import me.jacky1356400.actuallybaubles.item.ItemPotionRingAdvancedBauble;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

import static de.ellpeck.actuallyadditions.mod.items.ItemPotionRing.ALL_RINGS;

@Mod(modid = ActuallyBaubles.MODID, version = ActuallyBaubles.VERSION, name = ActuallyBaubles.MODNAME, dependencies = ActuallyBaubles.DEPENDS, useMetadata = true)
public class ActuallyBaubles {

    public static final String VERSION = "1.0";
    public static final String MODID = "actuallybaubles";
    public static final String MODNAME = "ActuallyBaubles";
    public static final String DEPENDS = "required-after:actuallyadditions;required-after:baubles;";
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(InitItems.itemMisc, 1 , 6);
        }
        @Override
        public String getTranslatedTabLabel() {
            return "Actually Baubles";
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
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onItemRegistry(RegistryEvent.Register<Item> event) {
        ITEMS.add(magnetRing);
        ITEMS.add(potionRingAdvanced);
        ITEMS.add(battery.setUnlocalizedName("actuallyadditions.item_battery"));
        ITEMS.add(batteryDouble.setUnlocalizedName("actuallyadditions.item_battery_double"));
        ITEMS.add(batteryTriple.setUnlocalizedName("actuallyadditions.item_battery_triple"));
        ITEMS.add(batteryQuadruple.setUnlocalizedName("actuallyadditions.item_battery_quadruple"));
        ITEMS.add(batteryQuintuple.setUnlocalizedName("actuallyadditions.item_battery_quintuple"));
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public void onRecipeRegistry(RegistryEvent.Register<IRecipe> event) {
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "magnet_ring_to_bauble"), new ResourceLocation(MODID, "magnet_ring_to_bauble"), new ItemStack(magnetRing, 1), Ingredient.fromStacks(new ItemStack(InitItems.itemMagnetRing, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_magnet_ring"), new ResourceLocation(MODID, "bauble_to_magnet_ring"), new ItemStack(InitItems.itemMagnetRing, 1), Ingredient.fromStacks(new ItemStack(magnetRing, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "battery_to_bauble_1"), new ResourceLocation(MODID, "battery_to_bauble_1"), new ItemStack(battery, 1), Ingredient.fromStacks(new ItemStack(InitItems.itemBattery, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "battery_to_bauble_2"), new ResourceLocation(MODID, "battery_to_bauble_2"), new ItemStack(batteryDouble, 1), Ingredient.fromStacks(new ItemStack(InitItems.itemBatteryDouble, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "battery_to_bauble_3"), new ResourceLocation(MODID, "battery_to_bauble_3"), new ItemStack(batteryTriple, 1), Ingredient.fromStacks(new ItemStack(InitItems.itemBatteryTriple, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "battery_to_bauble_4"), new ResourceLocation(MODID, "battery_to_bauble_4"), new ItemStack(batteryQuadruple, 1), Ingredient.fromStacks(new ItemStack(InitItems.itemBatteryQuadruple, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "battery_to_bauble_5"), new ResourceLocation(MODID, "battery_to_bauble_5"), new ItemStack(batteryQuintuple, 1), Ingredient.fromStacks(new ItemStack(InitItems.itemBatteryQuintuple, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_battery_1"), new ResourceLocation(MODID, "bauble_to_battery_1"), new ItemStack(InitItems.itemBattery, 1), Ingredient.fromStacks(new ItemStack(battery, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_battery_2"), new ResourceLocation(MODID, "bauble_to_battery_2"), new ItemStack(InitItems.itemBatteryDouble, 1), Ingredient.fromStacks(new ItemStack(batteryDouble, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_battery_3"), new ResourceLocation(MODID, "bauble_to_battery_3"), new ItemStack(InitItems.itemBatteryTriple, 1), Ingredient.fromStacks(new ItemStack(batteryTriple, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_battery_4"), new ResourceLocation(MODID, "bauble_to_battery_4"), new ItemStack(InitItems.itemBatteryQuadruple, 1), Ingredient.fromStacks(new ItemStack(batteryQuadruple, 1)));
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_battery_5"), new ResourceLocation(MODID, "bauble_to_battery_5"), new ItemStack(InitItems.itemBatteryQuintuple, 1), Ingredient.fromStacks(new ItemStack(batteryQuintuple, 1)));
        for (int i = 0; i < ALL_RINGS.length; i++) {
            GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "potion_ring_to_bauble_" + i), new ResourceLocation(MODID, "potion_ring_to_bauble_" + i), new ItemStack(potionRingAdvanced, 1, i), Ingredient.fromStacks(new ItemStack(InitItems.itemPotionRingAdvanced, 1, i)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_potion_ring_" + i), new ResourceLocation(MODID, "bauble_to_potion_ring_" + i), new ItemStack(InitItems.itemPotionRingAdvanced, 1, i), Ingredient.fromStacks(new ItemStack(potionRingAdvanced, 1, i)));
        }
    }

    @SubscribeEvent @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color, potionRingAdvanced);
    }

}
