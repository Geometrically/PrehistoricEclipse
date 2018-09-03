package me.geometrically.prehistoric.server.entity.dinosaur.herbivore;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDefense;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityCarnivore;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityTitanoceratops extends EntityHerbivore{

    public EntityTitanoceratops(World world){
        super(world);
        this.setSize(3.0F, 4.0F);
    }

    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 15.0F));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityCarnivore.class, 15.0F));
        this.tasks.addTask(3, new EntityAIDefense(this, 8.0F));
        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityCarnivore.class, true));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(14.0D);
    }

    @Override
    public EntityTitanoceratops createChild(EntityAgeable ageable){
        return new EntityTitanoceratops(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/titan/titanoceratops.png");
    }
}
