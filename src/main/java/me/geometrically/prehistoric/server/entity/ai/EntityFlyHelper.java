package me.geometrically.prehistoric.server.entity.ai;

import me.geometrically.prehistoric.server.entity.flying.EntityAir;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;

public class EntityFlyHelper extends EntityMoveHelper {
    private EntityAir entity;
    private int timer;

    public EntityFlyHelper(EntityAir entity) {
        super(entity);
        this.entity = entity;
    }

    @Override
    public void onUpdateMoveHelper() {
        if (this.action == EntityMoveHelper.Action.MOVE_TO) {
            double distanceX = this.posX - this.entity.posX;
            double distanceY = this.posY - this.entity.posY;
            double distanceZ = this.posZ - this.entity.posZ;
            double distance = distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ;

            if (this.timer-- <= 0) {
                this.timer += this.entity.getRNG().nextInt(5) + 2;
                distance = (double) MathHelper.sqrt(distance);

                if (this.isNotColliding(this.posX, this.posY, this.posZ, distance)) {
                    this.entity.motionX += distanceX / distance * 0.1D;
                    this.entity.motionY += distanceY / distance * 0.1D;
                    this.entity.motionZ += distanceZ / distance * 0.1D;
                } else {
                    this.action = EntityMoveHelper.Action.WAIT;
                }
            }
        }
    }

    private boolean isNotColliding(double x, double y, double z, double distance) {
        double d0 = (x - this.entity.posX) / distance;
        double d1 = (y - this.entity.posY) / distance;
        double d2 = (z - this.entity.posZ) / distance;
        AxisAlignedBB bounds = this.entity.getEntityBoundingBox();

        for (int i = 1; (double) i < distance; ++i) {
            bounds = bounds.offset(d0, d1, d2);

            if (!this.entity.world.getCollisionBoxes(this.entity, bounds).isEmpty()) {
                return false;
            }
        }

        return true;
    }
}