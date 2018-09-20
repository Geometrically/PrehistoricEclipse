package me.geometrically.prehistoric.server.block;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import me.geometrically.prehistoric.server.init.PEItems;
import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockGrapeVine extends BlockVine {

    public BlockGrapeVine(String name){
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setSoundType(SoundType.PLANT);
        setCreativeTab(PrehistoricEclipse.creativeTab);
    }
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
        {
            worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(PEItems.GRAPES, 1)));
            worldIn.setBlockState(pos, this.getDefaultState());
            return true;
        }

        return false;
    }
    @Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        super.getDrops(drops, world, pos, state, 0);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        int k = 3 + fortune;

        for (int i = 0; i < 3 + fortune; ++i)
        {
            drops.add(new ItemStack(PEItems.GRAPES, 1, 0));
        }
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return PEItems.GRAPES;
    }
}

