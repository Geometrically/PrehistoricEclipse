package me.geometrically.prehistoric.server.entity.ai;

import me.geometrically.prehistoric.server.entity.aquatic.EntityAquatic;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.util.math.MathHelper;

public class EntitySwimHelper extends EntityMoveHelper {
    private EntityAquatic entity;

    public EntitySwimHelper(EntityAquatic entity) {
        super(entity);
        this.entity = entity;
    }

    @Override
    public void onUpdateMoveHelper() {
        if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.entity.getNavigator().noPath()) {
            double distanceX = this.posX - this.entity.posX;
            double distanceY = this.posY - this.entity.posY;
            double distanceZ = this.posZ - this.entity.posZ;
            double distance = Math.abs(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
            distance = (double) MathHelper.sqrt(distance);
            distanceY /= distance;
            float f = (float) (Math.atan2(distanceZ, distanceX) * 180.0D / Math.PI) - 90.0F;
            this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, f, 30.0F);
            this.entity.setAIMoveSpeed((float) (this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * this.speed));
            this.entity.motionY += (double) this.entity.getAIMoveSpeed() * distanceY * 0.05D;
            this.entity.isSwimming = true;
        } else {
            this.entity.setAIMoveSpeed(0.0F);
            this.entity.isSwimming = false;
        }
    }
}