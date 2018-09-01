package me.geometrically.prehistoric.server.entity;

import com.dabigjoe.obsidianAPI.animation.wrapper.IEntityAnimated;
import me.geometrically.prehistoric.server.entity.land.EntityDinosaur;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityPrehistoric extends EntityTameable implements IEntityAnimated {

    private static final DataParameter<Integer> VARIANT = EntityDataManager.<Integer>createKey(EntityDinosaur.class, DataSerializers.VARINT);

    public boolean isAttacking = false;
    private int attackingTimer = 0;

    public EntityPrehistoric(World world) {
        super(world);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(VARIANT, Integer.valueOf(0));
    }

    public int getVariant() {
        return MathHelper.clamp(((Integer) this.dataManager.get(VARIANT)).intValue(), 0, 1);
    }

    public void setVariant(int variant) {
        this.dataManager.set(VARIANT, Integer.valueOf(variant));
    }

    public ResourceLocation getDefaultTexture() {
        return null;
    }

    public ResourceLocation getVariantTexture() {
        return this.getDefaultTexture();
    }

    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        this.setVariant(this.getRNG().nextInt(2));
        return super.onInitialSpawn(difficulty, livingdata);
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("Variant", this.getVariant());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setVariant(compound.getInteger("Variant"));
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float) ((int) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
        this.isAttacking = true;
        if (flag) {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }

    @Override
    public void onLivingUpdate() {
        if (!this.world.isRemote) {
            if (this.isAttacking) {
                this.attackingTimer++;
                if (this.attackingTimer >= 30) {
                    this.isAttacking = false;
                    this.attackingTimer = 0;
                }
            } else {
                this.attackingTimer = 0;
            }
        }
        super.onLivingUpdate();
    }

    @Override
    public boolean isMoving() {
        return limbSwingAmount > 0.02F;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    public EntityPrehistoric createChild(EntityAgeable dinosaur) {
        return new EntityPrehistoric(this.world);
    }

}
