package net.guavy.prehistoriceclipse.client;

import com.google.gson.Gson;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.guavy.prehistoriceclipse.client.animation.AnimationFile;
import net.guavy.prehistoriceclipse.client.animation.AnimationRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AnimationReloadListener implements SimpleSynchronousResourceReloadListener {
    @Override
    public Identifier getFabricId() {
        return new Identifier("pe",  "animations");
    }

    @Override
    public void apply(ResourceManager manager) {
        try {
            for (Pair<EntityType<?>, Identifier> animationToRegister : AnimationRegistry.animationsToRegister) {
                InputStream stream = manager.getResource(animationToRegister.getRight()).getInputStream();
                Reader reader = new InputStreamReader(stream);

                AnimationFile animationFile = new Gson().fromJson(reader, AnimationFile.class);

                AnimationRegistry.registeredAnimations.put(animationToRegister.getLeft(), animationFile.animations);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
