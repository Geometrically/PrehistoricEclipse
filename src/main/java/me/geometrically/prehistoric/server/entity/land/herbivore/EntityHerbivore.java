package me.geometrically.prehistoric.server.entity.land.herbivore;

import me.geometrically.prehistoric.server.entity.EntityDinosaur;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoEatGrass;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityHerbivore extends EntityDinosaur{

    public EntityHerbivore(World world){
        super(world);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAIDinoEatGrass(this));
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (!this.isEntityInvulnerable(source)) {
            if(source.getTrueSource() instanceof EntityPlayer){
                this.setAttackTarget((EntityPlayer)source.getTrueSource());
            }
            return super.attackEntityFrom(source, amount);
        } else {
            return false;
        }
    }
}
