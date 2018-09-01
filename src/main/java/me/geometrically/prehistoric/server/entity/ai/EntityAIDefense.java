package me.geometrically.prehistoric.server.entity.ai;

import com.dabigjoe.obsidianAPI.animation.ai.EntityAIAnimationBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;

import java.util.List;

public class EntityAIDefense extends EntityAIAnimationBase {
    public static String name = "Defense";
    private final EntityCreature entity;
    private final float radius;
    private final int limit = 25;
    private int counter = 0;

    public EntityAIDefense(EntityCreature entity, float radius) {
        super(name);
        this.setMutexBits(1);
        this.entity = entity;
        this.radius = radius;
    }

    @Override
    public boolean shouldExecute() {
        List<EntityLiving> list = this.entity.world.<EntityLiving>getEntitiesWithinAABB(EntityLiving.class, this.entity.getEntityBoundingBox().grow((double) this.radius, 3.0D, (double) this.radius));
        if (list.isEmpty()) {
            return false;
        } else {
            return this.entity.getRNG().nextInt(10) == 0;
        }
    }

    @Override
    public boolean shouldContinueExecuting() {
        if (counter < limit) {
            counter++;
            return true;
        }
        return false;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
        this.counter = 0;
    }

    @Override
    public void resetTask() {
        super.resetTask();
        this.counter = 0;
    }
}