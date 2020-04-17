package net.guavy.prehistoriceclipse.entity;

import net.guavy.prehistoriceclipse.client.animation.Animation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class DinosaurEntity extends MobEntity {
    public Map<String, Animation> playableAnimations;

    public Animation currentAnimation;
    public float animationProgress;

    public final Map<String, ModelPart> modelParts;

    protected DinosaurEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);

        modelParts = new HashMap<>();
    }
}
