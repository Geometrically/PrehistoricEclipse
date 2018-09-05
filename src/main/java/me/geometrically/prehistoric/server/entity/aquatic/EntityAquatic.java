package me.geometrically.prehistoric.server.entity.aquatic;

import me.geometrically.prehistoric.server.entity.EntityPrehistoric;
import me.geometrically.prehistoric.server.entity.ai.EntityAISwim;
import me.geometrically.prehistoric.server.entity.ai.EntitySwimHelper;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.MoverType;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAquatic extends EntityPrehistoric {

    public boolean isSwimming;

    public EntityAquatic(World world) {
        super(world);
        this.moveHelper = new EntitySwimHelper(this);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(1, new EntityAISwim(this));
    }

    @Override
    protected PathNavigate createNavigator(World world) {
        return new PathNavigateSwimmer(this, world);
    }

    @Override
    public void onEntityUpdate() {
        int air = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !this.isInWater()) {
            --air;
            this.setAir(air);

            if (this.getAir() == -20) {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0F);
            }
        } else {
            this.setAir(300);
        }
    }
    @Override
    public void onLivingUpdate(){
        super.onLivingUpdate();
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        if (this.isServerWorld() && this.isInWater()) {
            this.moveRelative(strafe, vertical, forward, 0.1F);
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.7D;
            this.motionY *= 0.7D;
            this.motionZ *= 0.7D;
        } else {
            super.travel(strafe, vertical, forward);
        }
    }
    @Override
    public boolean isMoving(){
        return isSwimming;
    }
    @Override
    public EntityAquatic createChild(EntityAgeable entity) {
        return new EntityAquatic(this.world);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean getCanSpawnHere() {
        return true;
    }

    @Override
    public boolean isPushedByWater() {
        return false;
    }
}
