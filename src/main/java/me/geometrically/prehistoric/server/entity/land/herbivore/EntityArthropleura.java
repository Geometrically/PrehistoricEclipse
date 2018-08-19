package me.geometrically.prehistoric.server.entity.land.herbivore;

import me.geometrically.prehistoric.server.Reference;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityArthropleura extends EntityHerbivore{

    public EntityArthropleura(World world){
        super(world);
        this.setSize(0.5F, 0.5F);
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
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
    }

    @Override
    public EntityArthropleura createChild(EntityAgeable ageable){
        return new EntityArthropleura(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/arthro/male.png");
    }
    @Override
    public ResourceLocation getVariantTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/arthro/female.png");
    }
}
