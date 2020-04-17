package net.guavy.prehistoriceclipse.client;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.guavy.prehistoriceclipse.client.animation.Animation;
import net.guavy.prehistoriceclipse.client.animation.AnimationFile;
import net.guavy.prehistoriceclipse.client.animation.AnimationRegistry;
import net.guavy.prehistoriceclipse.client.animation.ParsedAnimation;
import net.guavy.prehistoriceclipse.client.animation.bone.Bone;
import net.guavy.prehistoriceclipse.client.animation.bone.MovingBone;
import net.guavy.prehistoriceclipse.client.animation.bone.StaticBone;
import net.minecraft.entity.EntityType;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

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

                HashMap<String, Animation> animations = new HashMap<>();

                Iterator<Map.Entry<String, ParsedAnimation>> iterator = animationFile.animations.entrySet().iterator();
                while(iterator.hasNext()) {
                    Map.Entry<String, ParsedAnimation> parsedAnimation = iterator.next();
                    Animation animation = new Animation();

                    animation.length = parsedAnimation.getValue().animation_length;
                    animation.loop = parsedAnimation.getValue().loop;

                    Iterator<Map.Entry<String, JsonObject>> bonesIterator = parsedAnimation.getValue().bones.entrySet().iterator();
                    while(bonesIterator.hasNext()) {
                        Map.Entry<String, JsonObject> parsedBone = bonesIterator.next();

                        JsonElement rotationElement = parsedBone.getValue().get("rotation");
                        JsonElement positionElement = parsedBone.getValue().get("position");

                        Bone bone = null;

                        if(rotationElement != null) {

                            if(rotationElement.isJsonArray()) {
                                List<Float> rotations = new ArrayList<>();

                                for(JsonElement rotation : rotationElement.getAsJsonArray())
                                    rotations.add(rotation.getAsFloat());

                                List<Float> positions = new ArrayList<>();

                                if(positionElement != null) {

                                    for(JsonElement position : rotationElement.getAsJsonArray())
                                        positions.add(position.getAsFloat());
                                }
                                bone = new StaticBone(rotations, positions);
                            }
                            else if (rotationElement.isJsonObject()){
                                Map<Float, List<Float>> keyframes = new HashMap<>();

                                for (Map.Entry<String, JsonElement> parsedKeyframes : rotationElement.getAsJsonObject().entrySet()) {
                                    float time = Float.parseFloat(parsedKeyframes.getKey());

                                    List<Float> rotations = new ArrayList<>();

                                    for(JsonElement rotation : parsedKeyframes.getValue().getAsJsonArray())
                                        rotations.add(rotation.getAsFloat());

                                    keyframes.put(time, rotations);
                                }

                                bone = new MovingBone(keyframes);
                            }
                        } else if (positionElement != null) {
                            List<Float> positions = new ArrayList<>();

                            for(JsonElement position : positionElement.getAsJsonArray())
                                positions.add(position.getAsFloat());

                            bone = new StaticBone(new ArrayList<>(), positions);
                        }

                        if(bone != null)
                            animation.bones.put(parsedBone.getKey(), bone);

                        bonesIterator.remove();
                    }

                    animations.put(parsedAnimation.getKey(), animation);
                    iterator.remove();
                }

                AnimationRegistry.registeredAnimations.put(animationToRegister.getLeft(), animations);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
