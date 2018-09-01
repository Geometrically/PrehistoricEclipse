package me.geometrically.prehistoric.server.entity.land.herbivore;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIRunFromEntity;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityDakotaraptor;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityMonolophosaurus;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityTyrannosaurusRex;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityPachycephalosaurus extends EntityHerbivore {

    public EntityPachycephalosaurus(World world) {
        super(world);
        this.setSize(3.0F, 4.0F);
        this.tasks.addTask(3, new EntityAIRunFromEntity(this, EntityDakotaraptor.class, 30.0F, 2.0D));
        this.tasks.addTask(3, new EntityAIRunFromEntity(this, EntityMonolophosaurus.class, 30.0F, 2.0D));
        this.tasks.addTask(3, new EntityAIRunFromEntity(this, EntityTyrannosaurusRex.class, 30.0F, 2.0D));
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
    }

    @Override
    public EntityPachycephalosaurus createChild(EntityAgeable ageable) {
        return new EntityPachycephalosaurus(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture() {
        return new ResourceLocation(Reference.MOD_ID, "models/entity/pachy/male.png");
    }

    @Override
    public ResourceLocation getVariantTexture() {
        return new ResourceLocation(Reference.MOD_ID, "models/entity/pachy/female.png");
    }
}