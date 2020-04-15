package net.guavy.prehistoriceclipse.client.animation;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AnimationRegistry {
    public static final Map<EntityType<?>, Map<String, Animation>> registeredAnimations = new HashMap<>();

    public static final List<Pair<EntityType<?>, Identifier>> animationsToRegister = new ArrayList<>();

    public static void addEntityAnimations(EntityType<?> entityType, Identifier identifier) {
        animationsToRegister.add(new Pair<>(entityType, identifier));
    }
}
