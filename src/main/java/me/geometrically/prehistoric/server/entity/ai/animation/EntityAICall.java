package me.geometrically.prehistoric.server.entity.ai.animation;

import com.dabigjoe.obsidianAPI.animation.ai.EntityAIAnimationBase;
import net.minecraft.entity.EntityCreature;

public class EntityAICall extends EntityAIAnimationBase {

    private static EntityCreature entity;
    public static String name = "Call";
    private final int limit = 50;
    private int counter = 0;
    public boolean execute = false;

    public EntityAICall(EntityCreature entity) {
        super(name);
        this.entity = entity;
        this.setMutexBits(7);
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
        counter = 0;
    }

    @Override
    public void resetTask() {
        this.execute = false;

        counter = 0;
        super.resetTask();
    }

    @Override
    public boolean shouldExecute() {

        return this.execute;
    }
    @Override
    public boolean shouldContinueExecuting() {
        if (counter < limit) {
            counter++;
            return true;
        }
        return false;
    }
}