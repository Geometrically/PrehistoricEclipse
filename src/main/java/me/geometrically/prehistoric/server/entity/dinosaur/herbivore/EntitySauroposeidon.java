package me.geometrically.prehistoric.server.entity.dinosaur.herbivore;

import me.geometrically.prehistoric.server.Reference;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntitySauroposeidon extends EntityHerbivore {

    public EntitySauroposeidon(World world) {
        super(world);
        this.setSize(5F, 8F);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 15.0F));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(22.0D);
    }

    @Override
    public EntitySauroposeidon createChild(EntityAgeable ageable) {
        return new EntitySauroposeidon(this.world);
    }

    @Override
    public ResourceLocation getDefaultTexture() {
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/saur/male.png");
    }
}
