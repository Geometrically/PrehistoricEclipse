package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.client.animation.AnimationRegistry;
import net.guavy.prehistoriceclipse.client.animation.bone.Bone;
import net.guavy.prehistoriceclipse.client.animation.bone.MovingBone;
import net.guavy.prehistoriceclipse.client.animation.bone.StaticBone;
import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.guavy.prehistoriceclipse.util.Util;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

import java.lang.reflect.Field;
import java.util.*;

public class AnimatedModel<T extends DinosaurEntity> extends EntityModel<T> {
    
    private boolean firstRun = true;

    public AnimatedModel() { }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float customAngle, float headYaw, float headPitch) {

    }

    @Override
    public void animateModel(T entity, float limbAngle, float limbDistance, float tickDelta) {
        if(firstRun) {
            entity.playableAnimations = AnimationRegistry.registeredAnimations.get(entity.getType());

            entity.currentAnimation = entity.playableAnimations.get("Idle");

            Field[] fields = this.getClass().getFields();

            for(Field field : fields) {
                try {
                    if(field.get(this) instanceof ModelPart) {
                        entity.modelParts.put(field.getName(), (ModelPart)field.get(this));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            firstRun = false;
        } else if(entity.currentAnimation != null) {
            System.out.println(entity.playableAnimations);
            entity.animationProgress += tickDelta * 50 /1000;

            Iterator<Map.Entry<String, Bone>> iterator = entity.currentAnimation.bones.entrySet().iterator();

            while(iterator.hasNext()) {
                Map.Entry<String, Bone> boneEntry = iterator.next();

                ModelPart modelPart = entity.modelParts.get(boneEntry.getKey());

                if(boneEntry.getValue() instanceof StaticBone && modelPart != null) {
                    StaticBone bone = (StaticBone) boneEntry.getValue();

                    if(bone.rotation.size() == 3) {
                        modelPart.pitch = (float) Math.toRadians((double) bone.rotation.get(0));
                        modelPart.yaw = (float) Math.toRadians((double) bone.rotation.get(1));
                        modelPart.roll = (float) Math.toRadians((double) bone.rotation.get(2));
                    }

                    if(bone.position.size() == 3) {
                        //TODO Use reflection to edit cuboids, is this needed?!?!
                    }

                } else if (boneEntry.getValue() instanceof MovingBone && modelPart != null) {
                    MovingBone bone = (MovingBone) boneEntry.getValue();

                    Set<Float> keysSet = bone.keyframes.keySet();
                    Float[] keys = keysSet.toArray(new Float[0]);

                    Arrays.sort(keys);

                    float[] currentKeys = Util.getInBetweenNumbers(entity.animationProgress, keys);

                    if(currentKeys.length == 2) {
                        modelPart.pitch = (float) Math.toRadians(MathHelper.lerp(entity.animationProgress - currentKeys[0], bone.keyframes.get(currentKeys[0]).get(0), bone.keyframes.get(currentKeys[1]).get(0)));
                        modelPart.yaw = (float) Math.toRadians(MathHelper.lerp(entity.animationProgress - currentKeys[0], bone.keyframes.get(currentKeys[0]).get(1), bone.keyframes.get(currentKeys[1]).get(1)));
                        modelPart.roll = (float) Math.toRadians(MathHelper.lerp(entity.animationProgress - currentKeys[0], bone.keyframes.get(currentKeys[0]).get(2), bone.keyframes.get(currentKeys[1]).get(2)));
                    }
                }

                iterator.remove();
            }

            if(entity.animationProgress > entity.currentAnimation.length) {
                /*if(entity.currentAnimation.loop)
                    entity.animationProgress = 0;
                else
                    entity.currentAnimation = null;*/
                entity.animationProgress = 0;
            }
        }
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {

    }
}
