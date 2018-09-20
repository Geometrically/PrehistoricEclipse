package me.geometrically.prehistoric.server.init;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.item.ItemDakotaraptorArrow;
import me.geometrically.prehistoric.server.item.ItemHuntersBow;
import me.geometrically.prehistoric.server.item.PEFood;
import me.geometrically.prehistoric.server.item.PEItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PEItems {
    public static final Item DAKOTARAPTOR_SKULL = new PEItem("dakotaraptor_skull");
    ;
    public static final Item DAKOTARAPTOR_CLAW = new PEItem("dakotaraptor_claw");
    public static final Item DAKOTARAPTOR_FEATHER = new PEItem("dakotaraptor_feather");
    public static final Item DAKOTARAPTOR_BEEF = new PEFood("dakotaraptor_cooked", 8, false);
    public static final Item DAKOTARAPTOR_MEAT = new PEFood("dakotaraptor_raw", 4, true);
    public static final Item DAKOTARAPTOR_ARROW = new ItemDakotaraptorArrow();
    public static final Item MONOLOPHOSAURUS_CREST = new PEItem("monolophosaurus_crest");
    public static final Item MONOLOPHOSAURUS_BEEF = new PEFood("monolophosaurus_cooked", 5, false);
    public static final Item MONOLOPHOSAURUS_MEAT = new PEFood("monolophosaurus_raw", 2, true);
    public static final Item HUNTERS_BOW = new ItemHuntersBow();
    public static final Item GRAPES = new PEFood("grapes", 4, false);

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static void preInit() throws IllegalAccessException {
        for (Field field : PEItems.class.getDeclaredFields()) {
            Object obj = field.get(null);
            if (obj instanceof Item) {
                Item block = (Item) obj;
                ITEMS.add(block);
            }
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (Item item : ITEMS) {
            registerRender(item);
        }
    }
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
