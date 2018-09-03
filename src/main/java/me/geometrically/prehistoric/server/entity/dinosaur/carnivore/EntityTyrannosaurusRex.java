package me.geometrically.prehistoric.server.entity.dinosaur.carnivore;

import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoMate;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAICall;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIEat;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.dinosaur.EntityDinosaur;
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

public class EntityTyrannosaurusRex extends EntityCarnivore{

    public EntityTyrannosaurusRex(World worldIn)
    {
        super(worldIn);
        this.setSize(3.0F, 6.0F);
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
        this.targetTasks.addTask(5, new EntityAITargetNonTamed(this, EntityDinosaur.class, true, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity entity) {
                return entity instanceof EntityDakotaraptor || entity instanceof EntityMonolophosaurus || entity instanceof EntityPlateosaurus;
            }
        }));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
    }

    public int getMaxSpawnedInChunk()
    {
        return 8;
    }
    @Override
    public EntityTyrannosaurusRex createChild(EntityAgeable ageable)
    {
        return new EntityTyrannosaurusRex(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/trex/rex.png");
    }
}
