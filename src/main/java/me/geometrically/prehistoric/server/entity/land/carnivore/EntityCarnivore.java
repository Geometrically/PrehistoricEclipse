package me.geometrically.prehistoric.server.entity.land.carnivore;

import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAICall;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.EntityDinosaur;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityCarnivore extends EntityDinosaur {

    protected EntityAICall aiCall;
    protected EntityAIStartle aiStartle;
    public EntityCarnivore(World world){
        super(world);
    }

    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntityPlayer.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity p_apply_1_) { return p_apply_1_ instanceof EntityPlayer; }})
        );
    }


    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
    }
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    @Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if(!this.isEntityInvulnerable(source)){
            if(this.aiStartle != null){
                this.aiStartle.execute = true;
            }
            if(this.getHealth() < 25.0F && this.getHealth() + amount > 25.0F && this.aiCall != null) {
                this.aiCall.execute = true;
                if (source.getTrueSource() != null) {
                    double distance2 = 32.0D;
                    double d4 = -1.0D;
                    for (int i = 0; i < this.world.loadedEntityList.size(); ++i) {
                        Entity currE = (Entity) world.loadedEntityList.get(i);

                        if (currE instanceof EntityMonolophosaurus && currE != this) {
                            double d5 = currE.getDistanceSq(this.posX, this.posY, this.posZ);

                            if ((distance2 < 0.0D || d5 < distance2 * distance2) && (d4 == -1.0D || d5 < d4)) {
                                d4 = d5;
                                if (source.getTrueSource() instanceof EntityLivingBase)
                                    ((EntityMonolophosaurus) currE).setAttackTarget((EntityLivingBase) source.getTrueSource());
                            }
                        }
                    }
                }
            }
            return super.attackEntityFrom(source, amount);
        } else {
            return false;
        }
    }
    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
    }
}
