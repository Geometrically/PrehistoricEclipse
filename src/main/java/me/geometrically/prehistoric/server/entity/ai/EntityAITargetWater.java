package me.geometrically.prehistoric.server.entity.ai;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import me.geometrically.prehistoric.server.entity.water.EntityWater;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class EntityAITargetWater<T extends EntityLivingBase> extends EntityAINearestAttackableTarget<T> {
    private final EntityWater tameable;

    public EntityAITargetWater(EntityWater entityIn, Class<T> classTarget, boolean checkSight, Predicate<? super T > targetSelector)
    {
        super(entityIn, classTarget, 10, checkSight, false, targetSelector);
        this.tameable = entityIn;
    }
    public boolean shouldExecute()
    {
        if (this.taskOwner.getRNG().nextInt(10) != 0)
        {
            return false;
        }
        else if (this.targetClass != EntityPlayer.class && this.targetClass != EntityPlayerMP.class)
        {
            List<T> list = this.taskOwner.world.<T>getEntitiesWithinAABB(this.targetClass, this.getTargetableArea(this.getTargetDistance()), this.targetEntitySelector);

            if (list.isEmpty())
            {
                return false;
            }
            else
            {
                Collections.sort(list, this.sorter);
                this.targetEntity = list.get(0);
                return this.targetEntity.isInWater();
            }
        }
        else
        {
            this.targetEntity = (T)this.taskOwner.world.getNearestAttackablePlayer(this.taskOwner.posX, this.taskOwner.posY + (double)this.taskOwner.getEyeHeight(), this.taskOwner.posZ, this.getTargetDistance(), this.getTargetDistance(), new Function<EntityPlayer, Double>()
            {
                @Nullable
                public Double apply(@Nullable EntityPlayer p_apply_1_)
                {
                    ItemStack itemstack = p_apply_1_.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

                    if (itemstack.getItem() == Items.SKULL)
                    {
                        int i = itemstack.getItemDamage();
                        boolean flag = EntityAITargetWater.this.taskOwner instanceof EntitySkeleton && i == 0;
                        boolean flag1 = EntityAITargetWater.this.taskOwner instanceof EntityZombie && i == 2;
                        boolean flag2 = EntityAITargetWater.this.taskOwner instanceof EntityCreeper && i == 4;

                        if (flag || flag1 || flag2)
                        {
                            return 0.5D;
                        }
                    }

                    return 1.0D;
                }
            }, (Predicate<EntityPlayer>)this.targetEntitySelector);
            return this.targetEntity != null && this.targetEntity.isInWater();
        }
    }
}
