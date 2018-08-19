package me.geometrically.prehistoric.server.entity.projectile;

import me.geometrically.prehistoric.server.init.PEItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityDakoArrow extends EntityArrow{
    public EntityDakoArrow(World worldIn)
    {
        super(worldIn);
        this.setDamage(4.0D);
    }

    public EntityDakoArrow(World worldIn, EntityLivingBase shooter)
    {
        super(worldIn, shooter);
    }

    public EntityDakoArrow(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    protected ItemStack getArrowStack()
    {
        return new ItemStack(PEItems.dakoArrow);
    }


}
