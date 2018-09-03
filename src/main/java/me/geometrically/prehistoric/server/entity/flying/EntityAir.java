package me.geometrically.prehistoric.server.entity.flying;

import me.geometrically.prehistoric.server.entity.EntityPrehistoric;
import me.geometrically.prehistoric.server.entity.ai.EntityAIFly;
import me.geometrically.prehistoric.server.entity.ai.EntityFlyHelper;
import me.geometrically.prehistoric.server.entity.ai.PathNavigateFlying;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityFlying;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityAir extends EntityPrehistoric implements EntityFlying {

    public EntityAir(World world) {
        super(world);
        this.moveHelper = new EntityFlyHelper(this);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIFly(this, 0.75D, 1));
    }

    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    public void fall(float distance, float damageMultiplier) {
    }

    @Override
    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }

    @Override
    protected PathNavigate createNavigator(World world) {
        return new PathNavigateFlying(this, world);
    }

}