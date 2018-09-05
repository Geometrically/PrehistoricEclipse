package me.geometrically.prehistoric.server.entity.ai;

import me.geometrically.prehistoric.server.entity.flying.EntityAir;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;

import java.util.Random;

public class EntityAIFly extends EntityAIBase {
    private EntityAir entity;

    public EntityAIFly(EntityAir entity) {
        this.setMutexBits(1);
        this.entity = entity;
    }

    @Override
    public boolean shouldExecute() {
        EntityMoveHelper moveHelper = this.entity.getMoveHelper();

        if (!moveHelper.isUpdating()) {
            return true;
        } else {
            double x = moveHelper.getX() - this.entity.posX;
            double y = moveHelper.getY() - this.entity.posY;
            double z = moveHelper.getZ() - this.entity.posZ;
            double distance = x * x + y * y + z * z;
            return distance < 1.0D || distance > 3600.0D;
        }
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    @Override
    public void startExecuting() {
        Random random = this.entity.getRNG();
        double x = this.entity.posX + (double) ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
        double y = this.entity.posY + (double) ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
        double z = this.entity.posZ + (double) ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
        this.entity.getMoveHelper().setMoveTo(x, y, z, 1.0D);
    }
}