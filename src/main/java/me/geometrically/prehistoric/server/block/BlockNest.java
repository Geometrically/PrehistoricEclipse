package me.geometrically.prehistoric.server.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockNest extends BlockPrehistoric
{
    public static final AxisAlignedBB AXIS_ALIGNED_BB = new AxisAlignedBB(0.2D, 0, 0.2D, 0.8D, 0.2D, 0.8D);

    public BlockNest()
    {
        super("nest", Material.CLOTH);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AXIS_ALIGNED_BB;
    }
}