package me.geometrically.prehistoric.server.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class EntityEgg extends EntityLiving{

    private static final DataParameter<Integer> TIME_UNTIL_HATCH = EntityDataManager.<Integer>createKey(EntityEgg.class, DataSerializers.VARINT);

    private EntityAnimal parent;
    private EntityAnimal mate;

    public EntityEgg(World world){
        super(world);
        this.setSize(0.1F, 0.1F);
    }
    public EntityEgg(World world, EntityAnimal parent, EntityAnimal mate){
        super(world);
        this.setSize(0.1F, 0.1F);
        this.parent = parent;
        this.mate = mate;
    }

    @Override
    public void onLivingUpdate(){
        this.motionX = 0;
        this.motionY = 0;
        this.motionZ = 0;
        
        if((this.getRNG().nextInt(4) == 0)){
            if(!this.world.isRemote){
                if(this.timeUntilHatch() <= 0){
                    if(this.parent != null){
                        EntityAgeable babyDino = this.parent.createChild(this.mate);
                        babyDino.setGrowingAge(-24000);
                        babyDino.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
                        this.world.spawnEntity(babyDino);
                        this.setDead();
                    }
                } else {
                    this.setTime(this.timeUntilHatch() - 1);
                }
            }
        }
        super.onLivingUpdate();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("HatchTime", this.timeUntilHatch());
    }
    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setTime(compound.getInteger("HatchTime"));
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(TIME_UNTIL_HATCH, 1000);
    }

    private void setTime(int time)
    {
        this.dataManager.set(TIME_UNTIL_HATCH, time);
    }

    public int timeUntilHatch(){
        return this.dataManager.get(TIME_UNTIL_HATCH);
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        if(!this.world.isRemote){
            ItemStack itemstack = player.getHeldItem(hand);
            player.inventory.addItemStackToInventory(new ItemStack(Items.EGG));
            return true;
        }
        return false;
    }
    @Override
    protected boolean canDespawn()
    {
        return false;
    }
}
