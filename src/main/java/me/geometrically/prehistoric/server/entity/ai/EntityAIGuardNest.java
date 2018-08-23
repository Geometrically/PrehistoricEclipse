package me.geometrically.prehistoric.server.entity.ai;

import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.server.entity.land.EntityDinosaur;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class EntityAIGuardNest extends EntityAIBase {

    private EntityDinosaur dinosaur;

    World world;

    private double speed;
    private double distance;

    public EntityAIGuardNest(EntityDinosaur dinosaur, double distance ,double speed){
        this.dinosaur = dinosaur;
        this.world = dinosaur.world;

        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public boolean shouldExecute(){
        return this.dinosaur.nestBlockPos() != null;
    }

    @Override
    public void updateTask(){
        if(MathHelper.sqrt(this.dinosaur.getDistanceSq(this.dinosaur.nestBlockPos())) > this.distance){
            this.dinosaur.getNavigator().tryMoveToXYZ(this.dinosaur.nestBlockPos().getX(), this.dinosaur.nestBlockPos().getY(), this.dinosaur.nestBlockPos().getZ(), this.speed);
        } else {
            List<EntityLiving> list = this.dinosaur.world.<EntityLiving>getEntitiesWithinAABB(EntityLiving.class, new AxisAlignedBB(this.dinosaur.nestBlockPos()).grow(15.0D));
            for (EntityLiving attacker : list)
            {
                if (attacker.getClass() != this.dinosaur.getClass() && !(attacker instanceof EntityEgg))
                {
                    this.dinosaur.setAttackTarget(attacker);
                }
            }
        }
    }

    @Override
    public boolean shouldContinueExecuting()
    {
        return this.dinosaur.nestBlockPos() != null;
    }
}
