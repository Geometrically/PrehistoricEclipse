package me.geometrically.prehistoric.server.entity.ai;

import me.geometrically.prehistoric.server.init.PEBlocks;
import me.geometrically.prehistoric.server.entity.EntityDinosaur;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class EntityAIDinoMate extends EntityAIBase {
    private final EntityDinosaur animal;
    private final Class <? extends EntityDinosaur > mateClass;
    World world;
    private EntityDinosaur targetMate;
    int spawnBabyDelay;
    double moveSpeed;


    public EntityAIDinoMate(EntityDinosaur animal, double moveSpeed)
    {
        this.animal = animal;
        this.world = animal.world;
        this.mateClass = animal.getClass();
        this.moveSpeed = moveSpeed;
        this.setMutexBits(3);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.animal.isInLove())
        {
            return false;
        }
        else
        {
            this.targetMate = this.getNearbyMate();
            return this.targetMate != null && this.animal.nestBlockPos() == null && this.targetMate.nestBlockPos() == null;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting()
    {
        return this.targetMate.isEntityAlive() && this.targetMate.isInLove() && this.spawnBabyDelay < 60;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask()
    {
        this.targetMate = null;
        this.spawnBabyDelay = 0;
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void updateTask()
    {
        this.animal.getLookHelper().setLookPositionWithEntity(this.targetMate, 10.0F, (float)this.animal.getVerticalFaceSpeed());
        this.animal.getNavigator().tryMoveToEntityLiving(this.targetMate, this.moveSpeed);
        ++this.spawnBabyDelay;

        if (this.spawnBabyDelay >= 60 && this.animal.getDistanceSqToEntity(this.targetMate) < 9.0D)
        {
            this.spawnNestWithEggs();
        }
    }

    /**
     * Loops through nearby animals and finds another animal of the same type that can be mated with. Returns the first
     * valid mate found.
     */
    private EntityDinosaur getNearbyMate()
    {
        List<EntityDinosaur> list = this.world.<EntityDinosaur>getEntitiesWithinAABB(this.mateClass, this.animal.getEntityBoundingBox().grow(8.0D));
        double d0 = Double.MAX_VALUE;
        EntityDinosaur entityanimal = null;

        for (EntityDinosaur entityanimal1 : list)
        {
            if (this.animal.canMateWith(entityanimal1) && this.animal.getDistanceSqToEntity(entityanimal1) < d0)
            {
                entityanimal = entityanimal1;
                d0 = this.animal.getDistanceSqToEntity(entityanimal1);
            }
        }

        return entityanimal;
    }
    private void spawnNestWithEggs(){
        Block nest = PEBlocks.NEST;
        BlockPos entityPos = new BlockPos(this.animal.posX, this.animal.posY, this.animal.posZ);
        double posX= entityPos.getX() + 0.5D;
        double posY= entityPos.getY() + 0.1D;
        double posZ= entityPos.getZ() + 0.5D;
        world.destroyBlock(entityPos, false);
        System.out.println("Test");
        Random random = this.animal.getRNG();
        int eggs = this.animal.getRNG().nextInt(3) + 4;
        EntityEgg egg1 = new EntityEgg(this.world, this.animal, this.targetMate);
        EntityEgg egg2 = new EntityEgg(this.world, this.animal, this.targetMate);
        EntityEgg egg3 = new EntityEgg(this.world, this.animal, this.targetMate);
        EntityEgg egg4 = new EntityEgg(this.world, this.animal, this.targetMate);
        egg1.setLocationAndAngles(posX + 0.25D, posY, posZ, random.nextFloat(), 0.125F);
        egg2.setLocationAndAngles(posX - 0.25D, posY, posZ, random.nextFloat(), 0.125F);
        egg3.setLocationAndAngles(posX, posY , posZ - 0.25F, random.nextFloat(), 0.125F);
        egg4.setLocationAndAngles(posX, posY, posZ + 0.25F, random.nextFloat(), 0.125F);
        this.world.spawnEntity(egg1);
        this.world.spawnEntity(egg2);
        this.world.spawnEntity(egg3);
        this.world.spawnEntity(egg4);

        if(eggs >= 5){
            EntityEgg egg5 = new EntityEgg(this.world, this.animal, this.targetMate);
            egg5.setLocationAndAngles(posX + 0.1F, posY, posZ + 0.1F, random.nextFloat(), 0.125F);
            this.world.spawnEntity(egg5);
        }
        if(eggs == 6){
            EntityEgg egg6 = new EntityEgg(this.world, this.animal, this.targetMate);
            egg6.setLocationAndAngles(posX - 0.1F, posY, posZ - 0.1F, random.nextFloat(), 0.125F);
            this.world.spawnEntity(egg6);
        }
        world.setBlockState(entityPos, nest.getDefaultState());
        this.animal.setNestBlockPos(entityPos);
        this.targetMate.setNestBlockPos(entityPos);

        this.animal.resetInLove();
        this.targetMate.resetInLove();
        this.animal.setGrowingAge(6000);
        this.targetMate.setGrowingAge(6000);
    }
}
