package me.geometrically.prehistoric.server.entity.aquatic;

import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAITargetWater;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityPlesiosaurus extends EntityAquatic {

    public EntityPlesiosaurus(World worldIn)
    {
        super(worldIn);
        this.setSize(2.0F, 1F);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(3, new EntityAIAttackMelee(this, 1.0D, false));
        this.targetTasks.addTask(0, new EntityAITargetWater(this, EntityLivingBase.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity p_apply_1_) { return p_apply_1_ instanceof EntitySaurichthys; }})
        );
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return super.attackEntityFrom(source, amount);
    }

    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/ples/male.png");
    }

    public ResourceLocation getVariantTexture(){
        return new ResourceLocation(Reference.MOD_ID, "models/entity/ples/female.png");
    }
    @Override
    public EntityPlesiosaurus createChild(EntityAgeable entity){
        return new EntityPlesiosaurus(this.world);
    }
}