package net.guavy.prehistoriceclipse.entity.ai;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.entity.ai.TargetFinder;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.Vec3d;

public class DinosaurWanderGoal extends Goal {
    private final DinosaurEntity dinosaur;

    private Vec3d target;
    private double speed;
    private int chance;

    public DinosaurWanderGoal(DinosaurEntity dinosaur, int chance, double speed) {
        this.dinosaur = dinosaur;
        this.speed = speed;
        this.chance = chance;
    }

    @Override
    public boolean canStart() {
        if(dinosaur.hasPassengers() || this.dinosaur.getDespawnCounter() >= 100)
            return false;
        else if(this.dinosaur.getRandom().nextInt(this.chance) == 0){
            Vec3d wanderTarget = this.getWanderTarget();

            if(wanderTarget != null) {
                this.target = wanderTarget;

                return true;
            }

            return false;
        }

        return false;
    }

    public boolean shouldContinue() {
        return !this.dinosaur.getNavigation().isIdle() && !this.dinosaur.hasPassengers();
    }

    @Override
    public void start() {
        this.dinosaur.getNavigation().startMovingTo(target.x, target.y, target.z, this.speed);
    }

    public void stop() {
        this.dinosaur.getNavigation().stop();
        super.stop();
    }

    protected Vec3d getWanderTarget() {
        return TargetFinder.findGroundTarget(this.dinosaur, 30, 7, 0, dinosaur.getRotationVec(0.0F), 0.185);
    }
}
