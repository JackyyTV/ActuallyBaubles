package me.jacky1356400.actuallybaubles;

import de.ellpeck.actuallyadditions.mod.items.InitItems;
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
    public static ItemMagnetRingBauble magnetRing;
    public static ItemPotionRingAdvancedBauble potionRingAdvanced;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onItemRegistry(RegistryEvent.Register<Item> event) {
        ITEMS.add(new ItemMagnetRingBauble("magnet_ring_bauble"));
        ITEMS.add(new ItemPotionRingAdvancedBauble(true, "potion_ring_advanced_bauble"));
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public void onRecipeRegistry(RegistryEvent.Register<IRecipe> event) {
        Item magnetRingOld = Item.getByNameOrId("actuallyadditions:item_suction_ring");
        Item potionRingOld = Item.getByNameOrId("actuallyadditions:item_potion_ring_advanced");
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "magnet_ring_to_bauble"), new ResourceLocation(MODID, "magnet_ring_to_bauble"), new ItemStack(magnetRing, 1), new Ingredient[]{Ingredient.fromStacks(new ItemStack[]{new ItemStack(magnetRingOld, 1)})});
        GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_magnet_ring"), new ResourceLocation(MODID, "bauble_to_magnet_ring"), new ItemStack(magnetRingOld, 1), new Ingredient[]{Ingredient.fromStacks(new ItemStack[]{new ItemStack(magnetRing, 1)})});
        for (int i = 0; i < ALL_RINGS.length; i++) {
            GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "potion_ring_to_bauble_" + i), new ResourceLocation(MODID, "potion_ring_to_bauble_" + i), new ItemStack(potionRingAdvanced, 1, i), new Ingredient[]{Ingredient.fromStacks(new ItemStack[]{new ItemStack(potionRingOld, 1, i)})});
            GameRegistry.addShapelessRecipe(new ResourceLocation(MODID, "bauble_to_potion_ring_" + i), new ResourceLocation(MODID, "bauble_to_potion_ring_" + i), new ItemStack(potionRingOld, 1, i), new Ingredient[]{Ingredient.fromStacks(new ItemStack[]{new ItemStack(potionRingAdvanced, 1, i)})});
        }
    }

    @SubscribeEvent @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler((stack, tintIndex) -> stack.getItemDamage() >= ALL_RINGS.length ? 0xFFFFFF : ALL_RINGS[stack.getItemDamage()].color, potionRingAdvanced);
    }

}
