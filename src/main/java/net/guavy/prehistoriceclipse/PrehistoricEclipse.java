package net.guavy.prehistoriceclipse;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.guavy.prehistoriceclipse.client.AnimationReloadListener;
import net.guavy.prehistoriceclipse.client.animation.AnimationRegistry;
import net.guavy.prehistoriceclipse.init.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

import java.io.IOException;


public class PrehistoricEclipse implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("pe", "general"),
            () -> new ItemStack(PrehistoricItems.DAKOTARAPTOR_SKULL));

    @Override
    public void onInitialize() {
        PrehistoricEntities.Register();
        PrehistoricItems.Register();

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new AnimationReloadListener());

        AnimationRegistry.addEntityAnimations(PrehistoricEntities.ALLOSAURUS, new Identifier("pe", "animations/allosaurus.json"));
        AnimationRegistry.addEntityAnimations(PrehistoricEntities.AUSTRORAPTOR, new Identifier("pe", "animations/austroraptor.json"));
    }
}
