package me.geometrically.prehistoric.server.entity;

import com.dabigjoe.obsidianAPI.animation.wrapper.IEntityAnimated;
import com.google.common.base.Optional;
import me.geometrically.prehistoric.server.entity.ai.EntityAIGuardNest;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIEat;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;


public class EntityDinosaur extends EntityTameable implements IEntityAnimated,IGenderable{

    private static final DataParameter<Optional<BlockPos>> NEST_BLOCK_POS = EntityDataManager.<Optional<BlockPos>>createKey(EntityDinosaur.class, DataSerializers.OPTIONAL_BLOCK_POS);
    private static final DataParameter<Integer> VARIANT = EntityDataManager.<Integer>createKey(EntityDinosaur.class, DataSerializers.VARINT);

    protected EntityAIEat aiEat;

    public boolean isAttacking = false;
    private int attackingTimer = 0;

    public EntityDinosaur(World world){
        super(world);
    }

    @Override
    protected void initEntityAI() {
        this.aiSit = new EntityAISit(this);
        this.tasks.addTask(3, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(4, new EntityAIGuardNest(this, 15.0D, 1.0D));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(7, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
        this.tasks.addTask(9, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(10, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
    }

    public EntityDinosaur createChild(EntityAgeable dinosaur){
        return new EntityDinosaur(this.world);
    }
    @Override
    public void onLivingUpdate(){
        if(!this.isInLove() && this.growingAge == 0){
            if(this.getRNG().nextInt(1800) == 0){
                this.setInLove(null);
            }
        }
        if(this.getAttackTarget() != null){
            float f = this.rotationYaw * 0.017453292F;
            this.motionX -= (double)(MathHelper.sin(f) * 0.001F);
            this.motionZ += (double)(MathHelper.cos(f) * 0.001F);
        }
        if(!this.world.isRemote){
            if(this.isAttacking){
                this.attackingTimer++;
                if(this.attackingTimer >= 20){
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
    public boolean isBreedingItem(ItemStack stack)
    {
        return false;
    }
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(NEST_BLOCK_POS, Optional.absent());
        this.dataManager.register(VARIANT, Integer.valueOf(0));
    }

    @Override
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
    }
    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
        this.isAttacking = true;
        if (flag)
        {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }
    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        if (this.isTamed()) {
            if (!itemstack.isEmpty()) {
                if (itemstack.getItem() instanceof ItemFood) {
                    ItemFood itemfood = (ItemFood) itemstack.getItem();

                    if (itemfood.isWolfsFavoriteMeat()) {
                        if (this.aiEat != null) {
                            this.aiEat.execute = true;
                        }
                        if (!player.capabilities.isCreativeMode) {
                            itemstack.shrink(1);
                        }

                        this.heal((float) itemfood.getHealAmount(itemstack));
                        return true;
                    }
                }
            }

            if (this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(itemstack)) {
                this.aiSit.setSitting(!this.isSitting());
                this.isJumping = false;
                this.navigator.clearPathEntity();
                this.setAttackTarget((EntityLivingBase) null);
            }
        } else if (itemstack.getItem() == Items.BONE && this.isChild())
        {
            if (!player.capabilities.isCreativeMode)
            {
                itemstack.shrink(1);
            }

            if (!this.world.isRemote)
            {
                if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player))
                {
                    this.setTamedBy(player);
                    this.navigator.clearPathEntity();
                    this.setAttackTarget((EntityLivingBase)null);
                    this.aiSit.setSitting(true);
                    this.setHealth(20.0F);
                    this.playTameEffect(true);
                    this.world.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(player, hand);
    }
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        if(nestBlockPos() != null) compound.setTag("nest" ,NBTUtil.createPosTag(nestBlockPos()));

        compound.setInteger("Variant", this.getVariant());
    }

    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        if(compound.hasKey("nest")){
            this.setNestBlockPos(NBTUtil.getPosFromTag(compound.getCompoundTag("nest")));
        }
        this.setVariant(compound.getInteger("Variant"));
    }

    public void setNestBlockPos(@Nullable BlockPos pos)
    {
        this.dataManager.set(NEST_BLOCK_POS, Optional.fromNullable(pos));
    }

    public int getVariant()
    {
        return MathHelper.clamp(((Integer)this.dataManager.get(VARIANT)).intValue(), 0, 1);
    }

    public void setVariant(int variant)
    {
        this.dataManager.set(VARIANT, Integer.valueOf(variant));
    }

    @Override
    public ResourceLocation getDefaultTexture(){
        return null;
    }

    @Override
    public ResourceLocation getVariantTexture(){
        return null;
    }

    @Nullable
    public BlockPos nestBlockPos(){
        return (BlockPos)((Optional)this.dataManager.get(NEST_BLOCK_POS)).orNull();
    }

    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        this.setVariant(this.getRNG().nextInt(2));
        return super.onInitialSpawn(difficulty, livingdata);
    }
}
