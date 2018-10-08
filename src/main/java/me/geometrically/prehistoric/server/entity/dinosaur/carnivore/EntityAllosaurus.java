package me.geometrically.prehistoric.server.entity.dinosaur.carnivore;

//allo health 58
//allo attack 14

import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoMate;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAICall;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIEat;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.aquatic.EntityAquatic;
import me.geometrically.prehistoric.server.entity.dinosaur.EntityDinosaur;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityPlateosaurus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityAllosaurus extends EntityCarnivore{

    public EntityAllosaurus(World worldIn)
    {
        super(worldIn);
        this.setSize(2.0F, 2.0F);
        this.setTamed(false);
    }
    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.aiCall = new EntityAICall(this);
        this.aiEat = new EntityAIEat(this);
        this.aiStartle = new EntityAIStartle(this);
        this.tasks.addTask(2, this.aiEat);
        this.tasks.addTask(3, this.aiCall);
        this.tasks.addTask(7, new EntityAIDinoMate(this, 1.0D));
        this.tasks.addTask(8, this.aiStartle);
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 18.0F));
        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityLiving.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity entity) {
                return !(entity instanceof EntityAquatic);
            }
        }));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(58.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(14.0D);
    }

    public int getMaxSpawnedInChunk()
    {
        return 8;
    }
    @Override
    public EntityAllosaurus createChild(EntityAgeable ageable)
    {
        return new EntityAllosaurus(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/allo/male.png");
    }
    @Override
    public ResourceLocation getVariantTexture(){
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/allo/female.png");
    }
}