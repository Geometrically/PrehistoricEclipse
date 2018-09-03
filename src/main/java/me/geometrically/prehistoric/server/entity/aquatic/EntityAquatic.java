package me.geometrically.prehistoric.server.entity.aquatic;

import me.geometrically.prehistoric.server.entity.EntityPrehistoric;
import me.geometrically.prehistoric.server.entity.ai.EntityAISwim;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityAquatic extends EntityPrehistoric {

    private static final DataParameter<Boolean> MOVING = EntityDataManager.<Boolean>createKey(EntityAquatic.class, DataSerializers.BOOLEAN);

    public EntityAquatic(World world) {
        super(world);
        this.moveHelper = new EntityAquatic.MoveHelper();
        this.tasks.addTask(1, new EntityAISwim(this));
        this.navigator = new PathNavigateSwimmer(this, world);
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
    public float getEyeHeight() {
        return this.height * 0.5F;
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
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(MOVING, Boolean.valueOf(false));
    }
    @Override
    public boolean isMoving(){
        return ((Boolean)this.dataManager.get(MOVING)).booleanValue();
    }

    private void setMoving(boolean moving)
    {
        this.dataManager.set(MOVING, Boolean.valueOf(moving));
    }

    @Override
    public EntityAquatic createChild(EntityAgeable entity) {
        return new EntityAquatic(this.world);
    }

    class MoveHelper extends EntityMoveHelper {
        private EntityAquatic waterEntity = EntityAquatic.this;

        public MoveHelper() {
            super(EntityAquatic.this);
        }

        @Override
        public void onUpdateMoveHelper() {
            if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.waterEntity.getNavigator().noPath()) {
                double distanceX = this.posX - this.waterEntity.posX;
                double distanceY = this.posY - this.waterEntity.posY;
                double distanceZ = this.posZ - this.waterEntity.posZ;
                double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
                distance = (double) MathHelper.sqrt(distance);
                distanceY /= distance;
                float f = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;
                this.waterEntity.rotationYaw = this.limitAngle(this.waterEntity.rotationYaw, f, 30.0F);
                this.waterEntity.setAIMoveSpeed((float) (this.waterEntity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * this.speed));
                this.waterEntity.motionY += (double) this.waterEntity.getAIMoveSpeed() * distanceY * 0.05D;
                this.waterEntity.setMoving(true);
            } else {
                this.waterEntity.setAIMoveSpeed(0.0F);
                this.waterEntity.setMoving(false);
            }
        }
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
