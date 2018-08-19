package me.geometrically.prehistoric.server.entity.water;

import com.dabigjoe.obsidianAPI.animation.wrapper.IEntityAnimated;
import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.entity.EntityDinosaur;
import me.geometrically.prehistoric.server.entity.IGenderable;
import me.geometrically.prehistoric.server.entity.ai.EntityAISwim;
import me.geometrically.prehistoric.server.entity.ai.EntityAITargetWater;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityWater extends EntityAnimal implements IEntityAnimated, IGenderable{

    private static final DataParameter<Boolean> MOVING = EntityDataManager.<Boolean>createKey(EntityWater.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> VARIANT = EntityDataManager.<Integer>createKey(EntityDinosaur.class, DataSerializers.VARINT);

    public boolean isAttacking = false;
    private int attackingTimer = 0;

    public EntityWater(World world) {
        super(world);
        this.moveHelper = new EntityWater.MoveHelper();
        this.tasks.addTask(1, new EntityAISwim(this));
        this.navigator = new PathNavigateSwimmer(this, world);
    }

    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
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
        if(!this.world.isRemote){
            if(this.isAttacking){
                this.attackingTimer++;
                if(this.attackingTimer >= 20){
                    this.isAttacking = false;
                    this.attackingTimer = 0;
                }
            } else {
                this.attackingTimer = 0;
            }
        }
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
        this.dataManager.register(VARIANT, Integer.valueOf(0));
    }
    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setInteger("Variant", this.getVariant());
    }
    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setVariant(compound.getInteger("Variant"));
    }
    @Override
    public boolean isMoving(){
        return ((Boolean)this.dataManager.get(MOVING)).booleanValue();
    }

    private void setMoving(boolean moving)
    {
        this.dataManager.set(MOVING, Boolean.valueOf(moving));
    }

    public int getVariant()
    {
        return MathHelper.clamp(((Integer)this.dataManager.get(VARIANT)).intValue(), 0, 1);
    }

    public void setVariant(int variant)
    {
        this.dataManager.set(VARIANT, Integer.valueOf(variant));
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return null;
    }

    @Override
    public ResourceLocation getVariantTexture(){
        return null;
    }

    class MoveHelper extends EntityMoveHelper {
        private EntityWater waterEntity = EntityWater.this;

        public MoveHelper() {
            super(EntityWater.this);
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
    public EntityWater createChild(EntityAgeable entity){
        return new EntityWater(this.world);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
        this.isAttacking = true;
        if (flag)
        {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }
}
