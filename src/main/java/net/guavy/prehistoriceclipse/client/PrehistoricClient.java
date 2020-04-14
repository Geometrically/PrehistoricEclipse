package net.guavy.prehistoriceclipse.client;

import net.fabricmc.api.ClientModInitializer;
import net.guavy.prehistoriceclipse.client.animation.AnimationRegistry;
import net.guavy.prehistoriceclipse.init.PrehistoricEntities;
import net.minecraft.util.Identifier;

public class PrehistoricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AnimationRegistry.INSTANCE.RegisterAnimations(PrehistoricEntities.ALLOSAURUS, new Identifier("pe", "austroraptor"));
    }
}
