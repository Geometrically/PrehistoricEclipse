package me.geometrically.prehistoric.server.entity.land.herbivore;

import me.geometrically.prehistoric.server.Reference;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityPlateosaurus extends EntityHerbivore{

    public EntityPlateosaurus(World world){
        super(world);
        this.setSize(3.0F, 4.0F);
    }

    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
    }

    @Override
    public EntityPlateosaurus createChild(EntityAgeable ageable){
        return new EntityPlateosaurus(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/plateo/male.png");
    }
    @Override
    public ResourceLocation getVariantTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/plateo/female.png");
    }
}