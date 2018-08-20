package me.geometrically.prehistoric.server.world.gen;

import com.google.common.collect.Lists;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityDakotaraptor;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityVelociraptor;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityArthropleura;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityTitanoceratops;
import me.geometrically.prehistoric.server.entity.water.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.water.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.water.EntitySaurichthys;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.List;
import java.util.Random;

public class ChunkGeneratorPreclipse implements IChunkGenerator {
    private Random rand;

    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;
    private NoiseGeneratorPerlin noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    public NoiseGeneratorOctaves noiseGen6;

    private World world;
    private final boolean mapFeaturesEnabled;
    private WorldType worldType;
    private final double[] field_147434_q;
    private final float[] parabolicField;
    private double[] stoneNoise = new double[256];

    /** The biomes that are used to generate the chunk */
    private Biome[] biomesForGeneration;

    double[] doubleArray1;
    double[] doubleArray2;
    double[] doubleArray3;
    double[] doubleArray4;
    int[][] field_73219_j = new int[32][32];

    public ChunkGeneratorPreclipse(World worldObj, long seed, boolean mapFeaturesEnabled)
    {
        world = worldObj;
        this.mapFeaturesEnabled = mapFeaturesEnabled;
        worldType = world.getWorldInfo().getTerrainType();
        rand = new Random(seed);
        noiseGen1 = new NoiseGeneratorOctaves(rand, 16);
        noiseGen2 = new NoiseGeneratorOctaves(rand, 16);
        noiseGen3 = new NoiseGeneratorOctaves(rand, 8);
        noiseGen4 = new NoiseGeneratorPerlin(rand, 4);
        noiseGen5 = new NoiseGeneratorOctaves(rand, 10);
        noiseGen6 = new NoiseGeneratorOctaves(rand, 16);
        field_147434_q = new double[825];
        parabolicField = new float[25];

        for (int j = -2; j <= 2; ++j) {
            for (int k = -2; k <= 2; ++k) {
                float f = 10.0F / MathHelper.sqrt(j * j + k * k + 0.2F);
                parabolicField[j + 2 + (k + 2) * 5] = f;
            }
        }
    }

    public void setBlocksInChunk(int par1, int par2, ChunkPrimer primer)
    {
        byte b0 = 63;
        biomesForGeneration = world.getBiomeProvider().getBiomesForGeneration(biomesForGeneration, par1 * 4 - 2, par2 * 4 - 2, 10, 10);
        generateNoise(par1 * 4, 0, par2 * 4);

        for (int k = 0; k < 4; ++k)
        {
            int l = k * 5;
            int i1 = (k + 1) * 5;

            for (int j1 = 0; j1 < 4; ++j1)
            {
                int k1 = (l + j1) * 33;
                int l1 = (l + j1 + 1) * 33;
                int i2 = (i1 + j1) * 33;
                int j2 = (i1 + j1 + 1) * 33;

                for (int k2 = 0; k2 < 32; ++k2)
                {
                    double d0 = 0.125D;
                    double d1 = field_147434_q[k1 + k2];
                    double d2 = field_147434_q[l1 + k2];
                    double d3 = field_147434_q[i2 + k2];
                    double d4 = field_147434_q[j2 + k2];
                    double d5 = (field_147434_q[k1 + k2 + 1] - d1) * d0;
                    double d6 = (field_147434_q[l1 + k2 + 1] - d2) * d0;
                    double d7 = (field_147434_q[i2 + k2 + 1] - d3) * d0;
                    double d8 = (field_147434_q[j2 + k2 + 1] - d4) * d0;

                    for (int l2 = 0; l2 < 8; ++l2)
                    {
                        double d9 = 0.25D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;

                        for (int i3 = 0; i3 < 4; ++i3)
                        {
                            double d14 = 0.25D;
                            double d16 = (d11 - d10) * d14;
                            double d15 = d10 - d16;

                            for (int k3 = 0; k3 < 4; ++k3)
                                if ((d15 += d16) > 0.0D)
                                    primer.setBlockState(k * 4 + i3, k2 * 8 + l2, j1 * 4 + k3, Blocks.STONE.getDefaultState());
                                else if (k2 * 8 + l2 < b0)
                                    primer.setBlockState(k * 4 + i3, k2 * 8 + l2, j1 * 4 + k3, Blocks.WATER.getDefaultState());

                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }
                }
            }
        }
    }

    public void replaceBlocksForBiome(int par1, int par2, ChunkPrimer primer, Biome[] par5BiomeArray)
    {
        if(!ForgeEventFactory.onReplaceBiomeBlocks(this, par1, par2, primer, world)) return;

        double d0 = 0.03125D;
        stoneNoise = noiseGen4.getRegion(stoneNoise, par1 * 16, par2 * 16, 16, 16, d0 * 2.0D, d0 * 2.0D, 1.0D);

        for (int k = 0; k < 16; ++k)
            for (int l = 0; l < 16; ++l)
            {
                Biome Biome = par5BiomeArray[l + k * 16];
                Biome.genTerrainBlocks(world, rand, primer, par1 * 16 + k, par2 * 16 + l, stoneNoise[l + k * 16]);
            }
    }

    public void genLava(int par1, int par2, ChunkPrimer primer){

        for (int j = 0; j < 16; ++j)
            for (int k = 0; k < 16; ++k)
            {
                IBlockState iblockstate = Blocks.LAVA.getDefaultState();

                for (int j1 = 32; j1 >= 0; --j1)
                    if (j1 < 32 && j1 > rand.nextInt(5))
                    {
                        IBlockState iblockstate2 = primer.getBlockState(k, j1, j);

                        if (iblockstate2.getBlock() != null && iblockstate2.getBlock() == Blocks.AIR)
                            primer.setBlockState(k, j1, j, iblockstate);
                    }
            }
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    @Override
    public Chunk generateChunk(int par1, int par2)
    {
        rand.setSeed(par1 * 341873128712L + par2 * 132897987541L);
        ChunkPrimer primer = new ChunkPrimer();
        setBlocksInChunk(par1, par2, primer);
        biomesForGeneration = world.getBiomeProvider().getBiomes(biomesForGeneration, par1 * 16, par2 * 16, 16, 16);
        replaceBlocksForBiome(par1, par2, primer, biomesForGeneration);
        //Generate Caves, Ravines here
        genLava(par1, par2, primer);

        //Generate map features here

        Chunk chunk = new Chunk(world, primer, par1, par2);
        byte[] abyte1 = chunk.getBiomeArray();

        for (int k = 0; k < abyte1.length; ++k)
            abyte1[k] = (byte)Biome.getIdForBiome(biomesForGeneration[k]);

        chunk.generateSkylightMap();
        return chunk;
    }

    private void generateNoise(int par1, int par2, int par3)
    {
        doubleArray4 = noiseGen6.generateNoiseOctaves(doubleArray4, par1, par3, 5, 5, 200.0D, 200.0D, 0.5D);
        doubleArray1 = noiseGen3.generateNoiseOctaves(doubleArray1, par1, par2, par3, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
        doubleArray2 = noiseGen1.generateNoiseOctaves(doubleArray2, par1, par2, par3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
        doubleArray3 = noiseGen2.generateNoiseOctaves(doubleArray3, par1, par2, par3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
        int l = 0;
        int i1 = 0;
        for (int j1 = 0; j1 < 5; ++j1)
            for (int k1 = 0; k1 < 5; ++k1)
            {
                float f = 0.0F;
                float f1 = 0.0F;
                float f2 = 0.0F;
                byte b0 = 2;
                Biome Biome = biomesForGeneration[j1 + 2 + (k1 + 2) * 10];

                for (int l1 = -b0; l1 <= b0; ++l1)
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        Biome Biome1 = biomesForGeneration[j1 + l1 + 2 + (k1 + i2 + 2) * 10];
                        float f3 = Biome1.getBaseHeight();
                        float f4 = Biome1.getHeightVariation();

                        if (worldType == WorldType.AMPLIFIED && f3 > 0.0F)
                        {
                            f3 = 1.0F + f3 * 2.0F;
                            f4 = 1.0F + f4 * 4.0F;
                        }

                        float f5 = parabolicField[l1 + 2 + (i2 + 2) * 5] / (f3 + 2.0F);

                        if (Biome1.getBaseHeight() > Biome.getBaseHeight())
                            f5 /= 2.0F;

                        f += f4 * f5;
                        f1 += f3 * f5;
                        f2 += f5;
                    }

                f /= f2;
                f1 /= f2;
                f = f * 0.9F + 0.1F;
                f1 = (f1 * 4.0F - 1.0F) / 8.0F;
                double d13 = doubleArray4[i1] / 8000.0D;

                if (d13 < 0.0D)
                    d13 = -d13 * 0.3D;

                d13 = d13 * 3.0D - 2.0D;

                if (d13 < 0.0D)
                {
                    d13 /= 2.0D;

                    if (d13 < -1.0D)
                        d13 = -1.0D;

                    d13 /= 1.4D;
                    d13 /= 2.0D;
                }
                else
                {
                    if (d13 > 1.0D)
                        d13 = 1.0D;

                    d13 /= 8.0D;
                }

                ++i1;
                double d12 = f1;
                double d14 = f;
                d12 += d13 * 0.2D;
                d12 = d12 * 8.5D / 8.0D;
                double d5 = 8.5D + d12 * 4.0D;

                for (int j2 = 0; j2 < 33; ++j2)
                {
                    double d6 = (j2 - d5) * 12.0D * 128.0D / 256.0D / d14;

                    if (d6 < 0.0D)
                        d6 *= 4.0D;

                    double d7 = doubleArray2[l] / 512.0D;
                    double d8 = doubleArray3[l] / 512.0D;
                    double d9 = (doubleArray1[l] / 10.0D + 1.0D) / 2.0D;
                    double d10 = MathHelper.clampedLerp(d7, d8, d9) - d6;

                    if (j2 > 29)
                    {
                        double d11 = (j2 - 29) / 3.0F;
                        d10 = d10 * (1.0D - d11) + -10.0D * d11;
                    }

                    field_147434_q[l] = d10;
                    ++l;
                }
            }
    }

    /**
     * Populates chunk with ores etc etc
     */
    @Override
    public void populate(int par2, int par3)
    {
        BlockFalling.fallInstantly = true;
        int k = par2 * 16;
        int l = par3 * 16;
        Biome Biome = world.getBiome(new BlockPos(k + 16, 0, l + 16));
        rand.setSeed(world.getSeed());
        long i1 = rand.nextLong() / 2L * 2L + 1L;
        long j1 = rand.nextLong() / 2L * 2L + 1L;
        rand.setSeed(par2 * i1 + par3 * j1 ^ world.getSeed());
        boolean flag = false;

        ForgeEventFactory.onChunkPopulate(true, this, world, rand, par2, par3, flag);

        Biome.decorate(world, rand, new BlockPos(k, 0, l));


        ForgeEventFactory.onChunkPopulate(false, this, world, rand, par2, par3, flag);

        BlockFalling.fallInstantly = false;
    }
    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    @Override
    public List getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos)
    {
        Biome biome = this.world.getBiome(pos);
        return biome == null ? null : biome.getSpawnableList(creatureType);
    }

    @Override
    public BlockPos getNearestStructurePos(World p_147416_1_, String p_147416_2_, BlockPos pos, boolean bool)
    {
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunk, int par1, int par2)
    {
        //Generate map features here
    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {

        return false;
    }

    @Override
    public boolean isInsideStructure(World p_193414_1_, String p_193414_2_, BlockPos p_193414_3_) {

        return false;
    }

}
