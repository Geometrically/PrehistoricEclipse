package me.geometrically.prehistoric.server.entity.ai.animation;

import com.dabigjoe.obsidianAPI.animation.ai.EntityAIAnimationBase;
import net.minecraft.entity.EntityCreature;

public class EntityAIEat extends EntityAIAnimationBase {
    private EntityCreature entity;
    public static String name = "Eat";
    private final int limit = 25;
    private int counter = 0;

    public boolean execute;

    public EntityAIEat(EntityCreature entity) {
        super(name);
        this.setMutexBits(7);
        this.entity = entity;
        this.execute = false;
    }
    @Override
    public void startExecuting() {
        super.startExecuting();
        counter = 0;
    }
    @Override
    public void resetTask() {
        super.resetTask();
        this.execute = false;
        counter = 0;
    }
    @Override
    public boolean shouldExecute(){
        return this.execute;
    }
    @Override
    public boolean shouldContinueExecuting()
    {
        if(counter < limit) {
            counter++;
            return true;
        }
        return false;
    }
}