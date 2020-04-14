package net.guavy.prehistoriceclipse.init;

import net.guavy.prehistoriceclipse.PrehistoricEclipse;
import net.guavy.prehistoriceclipse.item.*;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PrehistoricItems {
    public static final List<Runnable> items = new ArrayList<>();

    public static final PEItem DAKOTARAPTOR_RAW = makeItem("dakotaraptor_raw", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(3).meat().saturationModifier(4).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem DAKOTARAPTOR_COOKED = makeItem("dakotaraptor_cooked", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(6).meat().saturationModifier(13).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem DAKOTARAPTOR_FEATHER = makeItem("dakotaraptor_feather", new Item.Settings().group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem DAKOTARAPTOR_CLAW = makeItem("dakotaraptor_claw", new Item.Settings().group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem DAKOTARAPTOR_SKULL = makeItem("dakotaraptor_skull", new Item.Settings().group(PrehistoricEclipse.ITEM_GROUP));

    public static final PEItem MONOLOPHOSAURUS_RAW = makeItem("monolophosaurus_raw", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(2).meat().saturationModifier(3).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem MONOLOPHOSAURUS_COOKED = makeItem("monolophosaurus_cooked", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(4).meat().saturationModifier(11).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem MONOLOPHOSAURUS_CREST = makeItem("monolophosaurus_crest", new Item.Settings().group(PrehistoricEclipse.ITEM_GROUP));

    public static final PEItem PLESIOSAURUS_RAW = makeItem("plesiosaurus_raw", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(3).meat().saturationModifier(6).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem PLESIOSAURUS_COOKED = makeItem("plesiosaurus_cooked", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(7).meat().saturationModifier(14).build())
            .group(PrehistoricEclipse.ITEM_GROUP));

    public static final PEItem REX_RAW = makeItem("rex_raw", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(5).meat().saturationModifier(8).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem REX_COOKED = makeItem("rex_cooked", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(8).meat().saturationModifier(16).build())
            .group(PrehistoricEclipse.ITEM_GROUP));

    public static final PEItem TITANOCERATOPS_RAW = makeItem("titanoceratops_raw", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(2).meat().saturationModifier(5).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    public static final PEItem TITANOCERATOPS_COOKED = makeItem("titanoceratops_cooked", new Item.Settings()
            .food(new FoodComponent.Builder().hunger(4).meat().saturationModifier(13).build())
            .group(PrehistoricEclipse.ITEM_GROUP));
    
    public static PEItem makeItem(String name, Item.Settings settings) {
        PEItem item = new PEItem(settings);
        
        items.add(() -> Registry.register(Registry.ITEM, new Identifier("pe", name), item));
        
        return item;
    }

    public static void Register() {
        items.forEach(Runnable::run);
    }
}
