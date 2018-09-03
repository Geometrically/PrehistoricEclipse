package me.geometrically.prehistoric.server.entity.dinosaur.carnivore;


import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoMate;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAICall;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityPlateosaurus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityMonolophosaurus extends EntityCarnivore {

    public EntityMonolophosaurus(World world){
        super(world);
        this.setSize(2.0F, 1.8F);
    }
    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.aiCall = new EntityAICall(this);
        this.aiStartle = new EntityAIStartle(this);
        this.tasks.addTask(2, this.aiCall);
        this.tasks.addTask(5, this.aiStartle);
        this.tasks.addTask(7, new EntityAIDinoMate(this, 1.0D));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 20.0F));
        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityPlateosaurus.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity entity) {
                return entity instanceof EntityPlateosaurus;
            }
        }));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
    }
    @Override
    public void onLivingUpdate() {
        if (this.getCustomNameTag().equals("Sanic")) {
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(2.0D);
        }
        super.onLivingUpdate();
    }
    @Override
    public EntityMonolophosaurus createChild(EntityAgeable entity){
        return new EntityMonolophosaurus(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/mono/male.png");
    }
    @Override
    public ResourceLocation getVariantTexture(){
        return new ResourceLocation(Reference.MOD_ID,"models/entity/mono/female.png");
    }
}
