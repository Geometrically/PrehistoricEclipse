package me.geometrically.prehistoric.server.entity.land.herbivore;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityVelociraptor;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityProtoceratops extends EntityHerbivore{

    public EntityProtoceratops(World world){
        super(world);
        this.setSize(2.0F, 2.0F);
    }

    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityVelociraptor.class, 10.0F, 1.0D, 2.0D));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(18.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
    }

    @Override
    public EntityProtoceratops createChild(EntityAgeable ageable){
        return new EntityProtoceratops(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/proto/male.png");
    }
    @Override
    public ResourceLocation getVariantTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/proto/female.png");
    }
}