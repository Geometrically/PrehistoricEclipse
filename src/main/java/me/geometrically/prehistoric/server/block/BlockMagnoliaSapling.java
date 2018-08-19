package me.geometrically.prehistoric.server.block;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import me.geometrically.prehistoric.server.init.PEBlocks;
import net.minecraft.block.*;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockMagnoliaSapling extends BlockBush implements IGrowable {
    public static final PropertyEnum<BlockHalf> HALF = PropertyEnum.create("half", BlockHalf.class);

    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

    private static final AxisAlignedBB BOUNDS = new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.6F, 0.8F, 0.6F);

    public BlockMagnoliaSapling(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(SoundType.PLANT);
        setCreativeTab(PrehistoricEclipse.creativeTab);

        this.setDefaultState( this.blockState.getBaseState().withProperty(STAGE, 0).withProperty(HALF, BlockHalf.LOWER));
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        if (!world.isRemote) {
            super.updateTick(world, pos, state, rand);

            if (world.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                this.grow(world,rand, pos, state);
            }
        }
    }
    @Override
    public void grow(World world, Random rand, BlockPos pos, IBlockState state) {
        if (state.getValue(STAGE) == 0) {
            world.setBlockState(pos, state.cycleProperty(STAGE), 4);
        } else {
            this.generateTree(world, rand, pos, state);
        }
    }
    public void generateTree(World world, Random rand, BlockPos pos, IBlockState state) {
        if(!TerrainGen.saplingGrowTree(world, rand, pos)) return;
        WorldGenerator gen = (WorldGenerator)(rand.nextInt(10) == 0 ? new WorldGenBigTree(false) : new WorldGenTrees(false));
        boolean flag = false;
        int i = 0, j = 0;

        gen = new WorldGenTrees(true, 5, Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.DARK_OAK), PEBlocks.MAGNOLIA_LEAVES.getDefaultState(), false);
        IBlockState iblockstate = Blocks.AIR.getDefaultState();
        world.setBlockToAir(pos.up());
        if(flag)
        {
            world.setBlockState(pos.add(i, 0, j), iblockstate, 4);
            world.setBlockState(pos.add(i + 1, 0, j), iblockstate, 4);
            world.setBlockState(pos.add(i, 0, j + 1), iblockstate, 4);
            world.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate, 4);
        }
        else
        {
            world.setBlockState(pos, iblockstate, 4);
        }

        if(!gen.generate(world, rand, pos.add(i, 0, j)))
        {
            if(flag)
            {
                world.setBlockState(pos.add(i, 0, j), iblockstate, 4);
                world.setBlockState(pos.add(i + 1, 0, j), iblockstate, 4);
                world.setBlockState(pos.add(i, 0, j + 1), iblockstate, 4);
                world.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate, 4);
            }
            else
            {
                world.setBlockState(pos, iblockstate, 4);
            }
        }
    }
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, STAGE, HALF);
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(STAGE, Integer.valueOf((meta & 8) >> 3)).withProperty(HALF, BlockHalf.values()[meta & 0b111]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i |= state.getValue(STAGE) << 3;
        i |= ((BlockHalf) state.getValue(HALF)).ordinal();
        return i;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }
    @Override
    public boolean canUseBonemeal(World world, Random rand, BlockPos pos, IBlockState state) {
        return (double) world.rand.nextFloat() < 0.45D && state.getValue(HALF) != BlockHalf.UPPER;
    }
    @Override
    public boolean canGrow(World world, BlockPos pos, IBlockState state, boolean isClient){
        return true;
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state;
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        world.setBlockState(pos, this.getDefaultState().withProperty(HALF, BlockHalf.LOWER), 2);
        world.setBlockState(pos.up(), this.getDefaultState().withProperty(HALF, BlockHalf.UPPER), 2);
    }

    @Override
    protected void checkAndDropBlock(World world, BlockPos pos, IBlockState state) {
        if (!this.canBlockStay(world, pos, state)) {
            boolean upperPart = state.getValue(HALF) == BlockHalf.UPPER;
            BlockPos top = upperPart ? pos : pos.up();
            BlockPos bottom = upperPart ? pos.down() : pos;
            Block topBlock = upperPart ? this : world.getBlockState(top).getBlock();
            Block bottomBlock = upperPart ? world.getBlockState(bottom).getBlock() : this;

            if (!upperPart) {
                this.dropBlockAsItem(world, pos, state, 0);
            }

            if (topBlock == this) {
                world.setBlockState(top, Blocks.AIR.getDefaultState(), 3);
            }

            if (bottomBlock == this) {
                world.setBlockState(bottom, Blocks.AIR.getDefaultState(), 3);
            }
        }
    }

    @Override
    public boolean canBlockStay(World world, BlockPos pos, IBlockState state) {
        if (state.getBlock() != this) {
            return super.canBlockStay(world, pos, state);
        }
        if (state.getValue(HALF) == BlockHalf.UPPER) {
            return world.getBlockState(pos.down()).getBlock() == this;
        } else {
            IBlockState up = world.getBlockState(pos.up());
            return up.getBlock() == this && super.canBlockStay(world, pos, up);
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (state.getValue(HALF) == BlockHalf.UPPER) {
            return null;
        } else {
            return super.getItemDropped(state, rand, fortune);
        }
    }

    @Override
    public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        if (state.getValue(HALF) == BlockHalf.UPPER) {
            if (world.getBlockState(pos.down()).getBlock() == this) {
                if (!player.capabilities.isCreativeMode) {
                    IBlockState lowerBlock = world.getBlockState(pos.down());

                    if (lowerBlock.getBlock() == this) {
                        world.destroyBlock(pos.down(), true);
                    }
                } else {
                    world.setBlockToAir(pos.down());
                }
            }
        } else if (player.capabilities.isCreativeMode && world.getBlockState(pos.up()).getBlock() == this) {
            world.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 2);
        }

        super.onBlockHarvested(world, pos, state, player);
    }

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (state.getBlock() == this && state.getValue(HALF) == BlockHalf.LOWER && world.getBlockState(pos.up()).getBlock() == this) {
            world.setBlockToAir(pos.up());
        }

        return world.setBlockToAir(pos);
    }

    public enum BlockHalf implements IStringSerializable {
        UPPER, LOWER;

        @Override
        public String toString() {
            return this.getName();
        }

        @Override
        public String getName() {
            return this == UPPER ? "upper" : "lower";
        }
    }
}
