package me.geometrically.prehistoric.server.world;

import me.geometrically.prehistoric.server.init.PEBiomes;
import me.geometrically.prehistoric.server.world.gen.layer.GenLayerPreclipse;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BiomeProviderPreclipse extends BiomeProvider {
    private GenLayer biomeToUse;
    private GenLayer biomeIndexLayer;
    private BiomeCache biomeCache;
    private List<Biome> biomesToSpawnIn;

    public BiomeProviderPreclipse()
    {
        biomeCache = new BiomeCache(this);
        biomesToSpawnIn = new ArrayList<Biome>();
        biomesToSpawnIn.add(PEBiomes.DAWN_JUNGLE);
        biomesToSpawnIn.add(PEBiomes.DAWN_FOREST);
        biomesToSpawnIn.add(PEBiomes.MESA);
        biomesToSpawnIn.add(PEBiomes.SWAMP);
        biomesToSpawnIn.add(PEBiomes.DESERT);
        biomesToSpawnIn.add(PEBiomes.MAGNOLIA_FOREST);
        biomesToSpawnIn.add(PEBiomes.PLAINS);
        biomesToSpawnIn.add(PEBiomes.OCEAN);
        biomesToSpawnIn.add(PEBiomes.DEEP_OCEAN);
        biomesToSpawnIn.add(PEBiomes.STREAM);
    }

    public BiomeProviderPreclipse(long par1, WorldType par3WorldType)
    {
        this();
        GenLayer[] agenlayer = GenLayerPreclipse.makeTheWorld(par1);
        biomeToUse = agenlayer[0];
        biomeIndexLayer = agenlayer[1];
    }

    public BiomeProviderPreclipse(World world)
    {
        this(world.getSeed(), world.getWorldInfo().getTerrainType());
    }

    @Override
    public List<Biome> getBiomesToSpawnIn()
    {
        return biomesToSpawnIn;
    }

    @Override
    public Biome getBiome(BlockPos pos)
    {
        return this.getBiome(pos, (Biome)null);
    }

    @Override
    public Biome getBiome(BlockPos pos, Biome biomegen)
    {
        Biome biome = biomeCache.getBiome(pos.getX(), pos.getZ(), biomegen);
        if (biome == null)
            return PEBiomes.PLAINS;

        return biome;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public float getTemperatureAtHeight(float par1, int par2) {
        return par1;
    }

    @Override
    public Biome[] getBiomesForGeneration(Biome[] par1ArrayOfBiome, int par2, int par3, int par4, int par5)
    {
        if (par1ArrayOfBiome == null || par1ArrayOfBiome.length < par4 * par5)
            par1ArrayOfBiome = new Biome[par4 * par5];

        int[] aint = biomeToUse.getInts(par2, par3, par4, par5);

        for (int i = 0; i < par4 * par5; ++i)
            if (aint[i] >= 0 && aint[i] <= Biome.REGISTRY.getKeys().size())
                par1ArrayOfBiome[i] = Biome.getBiome(aint[i]);
            else
                par1ArrayOfBiome[i] = PEBiomes.PLAINS;

        return par1ArrayOfBiome;
    }

    @Override
    public Biome[] getBiomes(Biome[] par1ArrayOfBiome, int par2, int par3, int par4, int par5)
    {
        return getBiomes(par1ArrayOfBiome, par2, par3, par4, par5, true);
    }

    @Override
    public Biome[] getBiomes(Biome[] par1ArrayOfBiome, int x, int y, int width, int length, boolean cacheFlag)
    {
        IntCache.resetIntCache();

        if (par1ArrayOfBiome == null || par1ArrayOfBiome.length < width * length)
            par1ArrayOfBiome = new Biome[width * length];

        if (cacheFlag && width == 16 && length == 16 && (x & 15) == 0 && (y & 15) == 0) {
            Biome[] aBiome1 = biomeCache.getCachedBiomes(x, y);
            System.arraycopy(aBiome1, 0, par1ArrayOfBiome, 0, width * length);
            return par1ArrayOfBiome;
        } else {
            int[] aint = biomeIndexLayer.getInts(x, y, width, length);

            for (int i = 0; i < width * length; ++i)
                if (aint[i] >= 0 && aint[i] <= Biome.REGISTRY.getKeys().size())
                    par1ArrayOfBiome[i] = Biome.getBiome(aint[i]);
                else
                    par1ArrayOfBiome[i] = PEBiomes.PLAINS;

            return par1ArrayOfBiome;
        }
    }

    @Override
    public boolean areBiomesViable(int par1, int par2, int par3, List par4List) {
        IntCache.resetIntCache();
        int l = par1 - par3 >> 2;
        int i1 = par2 - par3 >> 2;
        int j1 = par1 + par3 >> 2;
        int k1 = par2 + par3 >> 2;
        int l1 = j1 - l + 1;
        int i2 = k1 - i1 + 1;
        int[] aint = biomeToUse.getInts(l, i1, l1, i2);

        for (int j2 = 0; j2 < l1 * i2; ++j2) {
            Biome biome = Biome.getBiome(aint[j2]);

            if (!par4List.contains(biome))
                return false;
        }

        return true;
    }

    @Override
    public BlockPos findBiomePosition(int par1, int par2, int par3, List par4List, Random par5Random) {
        IntCache.resetIntCache();
        int l = par1 - par3 >> 2;
        int i1 = par2 - par3 >> 2;
        int j1 = par1 + par3 >> 2;
        int k1 = par2 + par3 >> 2;
        int l1 = j1 - l + 1;
        int i2 = k1 - i1 + 1;
        int[] aint = biomeToUse.getInts(l, i1, l1, i2);
        BlockPos blockpos = null;
        int j2 = 0;

        for (int k2 = 0; k2 < l1 * i2; ++k2) {
            int l2 = l + k2 % l1 << 2;
            int i3 = i1 + k2 / l1 << 2;
            Biome biome = Biome.getBiome(aint[k2]);

            if (par4List.contains(biome) && (blockpos == null || par5Random.nextInt(j2 + 1) == 0)) {
                blockpos = new BlockPos(l2, 0, i3);
                ++j2;
            }
        }

        return blockpos;
    }

    @Override
    public void cleanupCache()
    {
        biomeCache.cleanupCache();
    }
}
