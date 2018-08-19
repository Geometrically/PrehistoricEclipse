package me.geometrically.prehistoric.server.world;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import me.geometrically.prehistoric.server.world.gen.ChunkGeneratorPreclipse;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderPreclipse extends WorldProvider{

    @Override
    protected void init() {
        this.hasSkyLight = true;
        this.biomeProvider = new BiomeProviderPreclipse(world.getSeed(), world.getWorldInfo().getTerrainType());
        setDimension(46);
    }

    @Override
    public DimensionType getDimensionType() {
        return PrehistoricEclipse.dimensionType;
    }

    @Override
    public IChunkGenerator createChunkGenerator()
    {
        return new ChunkGeneratorPreclipse(world, world.getSeed(), true);
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

    @Override
    public String getSaveFolder() {
        return "The_Preclipse";
    }
}
