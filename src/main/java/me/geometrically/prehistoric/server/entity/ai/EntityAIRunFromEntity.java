package me.geometrically.prehistoric.server.entity.ai.animation;

import com.dabigjoe.obsidianAPI.animation.ai.EntityAIAnimationBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class EntityAIRunFromEntity<T extends Entity> extends EntityAIAnimationBase {
    public static String name = "Run";
    //Slight tweak from vanilla AI to work with obsidian
    private final EntityCreature entity;
    private final double runSpeed;
    private final float avoidDistance;
    private final PathNavigate entityPathNavigate;
    private final Class<T> classToAvoid;
    protected T closestLivingEntity;
    private Path entityPathEntity;

    public EntityAIRunFromEntity(EntityCreature entity, Class<T> classToAvoid, float avoidDistance, double runSpeed) {
        super(name);
        this.setMutexBits(1);
        this.entity = entity;
        this.classToAvoid = classToAvoid;
        this.runSpeed = runSpeed;
        this.avoidDistance = avoidDistance;
        this.entityPathNavigate = entity.getNavigator();
    }

    @Override
    public boolean shouldExecute() {
        if (entity.getAttackTarget() != null) {
            List<T> list = this.entity.world.<T>getEntitiesWithinAABB(this.classToAvoid, this.entity.getEntityBoundingBox().grow((double) this.avoidDistance, 3.0D, (double) this.avoidDistance));

            if (list.isEmpty()) {
                return false;
            } else {
                this.closestLivingEntity = list.get(0);
                Vec3d vec3d = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.entity, 16, 7, new Vec3d(this.closestLivingEntity.posX, this.closestLivingEntity.posY, this.closestLivingEntity.posZ));

                if (vec3d == null) {
                    return false;
                } else if (this.closestLivingEntity.getDistanceSq(vec3d.x, vec3d.y, vec3d.z) < this.closestLivingEntity.getDistanceSqToEntity(this.entity)) {
                    return false;
                } else {
                    this.entityPathEntity = this.entityPathNavigate.getPathToXYZ(vec3d.x, vec3d.y, vec3d.z);
                    return this.entityPathEntity != null;
                }
            }
        }
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return !this.entityPathNavigate.noPath();
    }

    public void startExecuting() {
        this.entityPathNavigate.setPath(this.entityPathEntity, this.runSpeed);
        System.out.println("TEST");
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask() {
        this.closestLivingEntity = null;
    }

    public void updateTask() {
        this.entity.getNavigator().setSpeed(runSpeed);
    }
}