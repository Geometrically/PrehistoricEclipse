package me.geometrically.prehistoric.server.entity.flying;

import me.geometrically.prehistoric.server.entity.EntityPrehistoric;
import me.geometrically.prehistoric.server.entity.ai.EntityAIFly;
import me.geometrically.prehistoric.server.entity.ai.EntityFlyHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityFlying;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityAir extends EntityPrehistoric implements EntityFlying {

    public EntityAir(World world) {
        super(world);
        this.moveHelper = new EntityFlyHelper(this);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIFly(this));
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
    }

    @Override
    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        if (this.isInWater()) {
            this.moveRelative(strafe, forward, 0.02F, 0F);
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.800000011920929D;
            this.motionY *= 0.800000011920929D;
            this.motionZ *= 0.800000011920929D;
        } else if (this.isInLava()) {
            this.moveRelative(strafe, forward, 0.02F, 0F);
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.5D;
            this.motionY *= 0.5D;
            this.motionZ *= 0.5D;
        } else {
            float friction = 0.91F;

            if (this.onGround) {
                friction = this.world.getBlockState(new BlockPos(MathHelper.floor(this.posX), MathHelper.floor(this.getEntityBoundingBox().minY) - 1, MathHelper.floor(this.posZ))).getBlock().slipperiness * 0.91F;
            }

            float f3 = 0.16277136F / (friction * friction * friction);
            this.moveRelative(strafe, forward, this.onGround ? f3 * 0.1F : 0.02F, 0F);
            friction = 0.91F;

            if (this.onGround) {
                friction = this.world.getBlockState(new BlockPos(MathHelper.floor(this.posX), MathHelper.floor(this.getEntityBoundingBox().minY) - 1, MathHelper.floor(this.posZ))).getBlock().slipperiness * 0.91F;
            }

            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double) friction;
            this.motionY *= (double) friction;
            this.motionZ *= (double) friction;
        }

        this.prevLimbSwingAmount = this.limbSwingAmount;
        double moveX = this.posX - this.prevPosX;
        double moveZ = this.posZ - this.prevPosZ;
        float dist = MathHelper.sqrt(moveX * moveX + moveZ * moveZ) * 4.0F;

        if (dist > 1.0F) {
            dist = 1.0F;
        }

        this.limbSwingAmount += (dist - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;
    }

}