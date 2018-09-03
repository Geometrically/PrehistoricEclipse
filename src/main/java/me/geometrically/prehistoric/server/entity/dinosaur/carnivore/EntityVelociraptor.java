package me.geometrically.prehistoric.server.entity.dinosaur.carnivore;

import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoMate;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityProtoceratops;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityVelociraptor extends EntityCarnivore {

    public EntityVelociraptor(World world){
        super(world);
        this.setSize(2.0F, 2.0F);
    }
    @Override
    protected void initEntityAI()
    {
        this.aiStartle = new EntityAIStartle(this);
        this.tasks.addTask(4, new EntityAIDinoMate(this, 1.0D));
        this.tasks.addTask(7, new EntityAIDinoMate(this, 1.0D));
        this.tasks.addTask(5, this.aiStartle);
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 15.0F));
        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityProtoceratops.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity entity) {
                return entity instanceof EntityProtoceratops;
            }
        }));
        super.initEntityAI();
    }
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
    }
    @Override
    public boolean isMoving() {
        return limbSwingAmount > 0.02F;
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
    public EntityVelociraptor createChild(EntityAgeable entity){
        return new EntityVelociraptor(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID ,"models/entity/velo/velociraptor.png");
    }
}
