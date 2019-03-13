package me.geometrically.prehistoric.server.block;


import me.geometrically.prehistoric.server.PrehistoricEclipse;
import me.geometrically.prehistoric.server.world.teleporter.PrehistoricTeleporter;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class BlockTimeMachine extends BlockPrehistoric {
    public BlockTimeMachine() {
        super("time_machine", Material.CIRCUITS);
        this.setCreativeTab(PrehistoricEclipse.creativeTab);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        } else {
            double x = pos.getX();
            double y = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(46).getTopSolidOrLiquidBlock(pos).getY() + 2;

            double z = pos.getZ();
            PrehistoricTeleporter.teleportToDimension(playerIn, 46, x, y, z);

            return true;
        }
    }
}