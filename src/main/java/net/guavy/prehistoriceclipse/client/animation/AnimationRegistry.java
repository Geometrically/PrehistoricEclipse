package net.guavy.prehistoriceclipse.client.animation;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

import java.io.*;

public final class AnimationRegistry {
    public static final AnimationRegistry INSTANCE = new AnimationRegistry();

    private AnimationRegistry() {

    }

    public <T extends Entity> void RegisterAnimations(EntityType<T> entityType, Identifier identifier) {
        Identifier id = new Identifier("pe", "animations/austroraptor.json");

        try {
            InputStream stream = MinecraftClient.getInstance().getResourceManager().getResource(id).getInputStream();
            Reader reader = new InputStreamReader(stream);

            AnimationFile animationFile = new Gson().fromJson(reader, AnimationFile.class);

            System.out.println(animationFile.formatVersion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
