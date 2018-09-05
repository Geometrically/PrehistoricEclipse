package me.geometrically.prehistoric.server.entity.projectile;

import me.geometrically.prehistoric.server.init.PEItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IThrowableEntity;

public class EntityDakoArrow extends EntityTippedArrow implements IThrowableEntity {
    public EntityDakoArrow(final World worldIn) {
        super(worldIn);
    }

    public EntityDakoArrow(final World worldIn, final double x, final double y, final double z) {
        super(worldIn, x, y, z);
    }

    public EntityDakoArrow(final World worldIn, final EntityLivingBase shooter) {
        super(worldIn, shooter);
    }

    @Override
    public void setPotionEffect(final ItemStack stack) {
        super.setPotionEffect(new ItemStack(Items.ARROW));
    }

    @Override
    protected ItemStack getArrowStack() {
        return new ItemStack(PEItems.dakoArrow);
    }

    @Override
    public Entity getThrower() {
        return shootingEntity;
    }

    @Override
    public void setThrower(final Entity entity) {
        shootingEntity = entity;
    }
}