package me.geometrically.prehistoric.server.entity.land.carnivore;

import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoMate;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAICall;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIEat;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityPlateosaurus;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityDakotaraptor extends EntityCarnivore{

    public EntityDakotaraptor(World worldIn)
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
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 25.0F));
        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityPlateosaurus.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity p_apply_1_) { return p_apply_1_ instanceof EntityPlateosaurus; }
        }));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        //run speed = 0.38
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
    }

    public int getMaxSpawnedInChunk()
    {
        return 8;
    }
    @Override
    public EntityDakotaraptor createChild(EntityAgeable ageable)
    {
        return new EntityDakotaraptor(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/dako/dakotaraptor.png");
    }
}
