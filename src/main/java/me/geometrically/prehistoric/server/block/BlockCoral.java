package me.geometrically.prehistoric.server.block;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCoral extends BlockBush{

    public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

    public static final AxisAlignedBB CORAL_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

    public BlockCoral(String name){
        super(Material.WATER);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PrehistoricEclipse.creativeTab);
    }
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return CORAL_AABB;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(LEVEL);
    }
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, LEVEL);
    }
    private boolean canPlaceBlockOn(Block ground) {
        return ground == Blocks.SAND || ground == Blocks.CLAY || ground == Blocks.GRAVEL || ground == Blocks.DIRT;
    }
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        // Place on sand/clay, aquatic here, aquatic up
        Block down = worldIn.getBlockState(pos.down()).getBlock();
        Block here = worldIn.getBlockState(pos).getBlock();
        Block up = worldIn.getBlockState(pos.up()).getBlock();

        return this.canPlaceBlockOn(down) && here == Blocks.WATER && up == Blocks.WATER;
    }
    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
        // Stay on sand/clay with aquatic up
        Block down = worldIn.getBlockState(pos.down()).getBlock();
        Block up = worldIn.getBlockState(pos.up()).getBlock();

        return this.canPlaceBlockOn(down) && up == Blocks.WATER;
    }
}
