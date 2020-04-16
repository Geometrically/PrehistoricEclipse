package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.client.animation.ParsedAnimation;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class AnimatedModel<T extends Entity> extends EntityModel<T> {

    public ParsedAnimation currentAnimation;
    public double animationProgress;

    private boolean firstRun = true;

    private final Map<String, ModelPart> modelParts;

    public AnimatedModel() {
        this.modelParts = new HashMap<>();
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float customAngle, float headYaw, float headPitch) {
        if(firstRun) {
            Field[] fields = this.getClass().getFields();

            for(Field field : fields) {
                try {
                    if(field.get(this) instanceof ModelPart) {
                        modelParts.put(field.getName(), (ModelPart)field.get(this));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            firstRun = false;
        }
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {

    }
}
