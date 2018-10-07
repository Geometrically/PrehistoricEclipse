package me.geometrically.prehistoric.server.block;


import me.geometrically.prehistoric.server.PrehistoricEclipse;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockIncubator extends BlockPrehistoric {
    public BlockIncubator() {
        super("incubator", Material.CIRCUITS);
        this.setCreativeTab(PrehistoricEclipse.creativeTab);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}