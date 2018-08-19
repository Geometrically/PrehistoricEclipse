package me.geometrically.prehistoric.server.init;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.item.ItemDakotaraptorArrow;
import me.geometrically.prehistoric.server.item.ItemHuntersBow;
import me.geometrically.prehistoric.server.item.PEItem;
import me.geometrically.prehistoric.server.item.PEFood;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PEItems {

    public static final Item.ToolMaterial MONO_MATERIAL = EnumHelper.addToolMaterial("Mono", 4, 13000, 13.0F, 10.0f, 24);

    public static Item dakoSkull = new PEItem("dakotaraptor_skull");;
    public static Item dakoClaw = new PEItem("dakotaraptor_claw");
    public static Item dakoFeather = new PEItem("dakotaraptor_feather");
    public static Item dakoBeef = new PEFood("dakotaraptor_cooked", 8, false);
    public static Item dakoMeat = new PEFood("dakotaraptor_raw", 4, true);

    public static Item monoCrest = new PEItem("monolophosaurus_crest");
    public static Item monoBeef = new PEFood("monolophosaurus_cooked", 5, false);
    public static Item monoMeat = new PEFood("monolophosaurus_raw", 2, true);

    public static Item huntersBow = new ItemHuntersBow();
    public static Item dakoArrow = new ItemDakotaraptorArrow();

    public static Item grapes = new PEFood("grapes", 4, false);
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(monoCrest,dakoSkull, dakoFeather, dakoMeat, dakoBeef, huntersBow, dakoArrow, monoBeef, monoMeat, grapes);
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(monoCrest);
        registerRender(dakoSkull);
        registerRender(dakoFeather);
        registerRender(dakoMeat);
        registerRender(dakoBeef);
        registerRender(huntersBow);
        registerRender(dakoArrow);
        registerRender(monoBeef);
        registerRender(monoMeat);
        registerRender(grapes);
    }
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
