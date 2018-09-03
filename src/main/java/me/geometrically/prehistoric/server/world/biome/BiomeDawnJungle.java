package me.geometrically.prehistoric.server.world.biome;

import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityDakotaraptor;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityMonolophosaurus;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityArthropleura;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityPlateosaurus;
import me.geometrically.prehistoric.server.world.gen.feature.WorldGenDawnTree;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.*;

import java.util.Random;

public class BiomeDawnJungle extends BiomePrehistoric {

    protected static final WorldGenCanopyTree ROOF_TREE = new WorldGenCanopyTree(false);

    private static final IBlockState JUNGLE_LOG = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
    private static final IBlockState JUNGLE_LEAF = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
    private static final IBlockState OAK_LEAF = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));

    public BiomeDawnJungle(){
        super(new BiomeProperties("Dawn Jungle").setBaseHeight(0.3F).setHeightVariation(0.2F).setTemperature(0.1F));

        this.decorator.treesPerChunk = 8;
        this.decorator.grassPerChunk = 2;
        this.decorator.reedsPerChunk = 20;
        this.setColors(24871);

        this.spawnableMonsterList.add(new SpawnListEntry(EntityDakotaraptor.class, 1, 3, 5));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityMonolophosaurus.class, 2, 2, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityPlateosaurus.class, 1, 3, 6));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityArthropleura.class, 2, 1, 1));
    }
    public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        if(rand.nextInt(3) == 0){
            return ROOF_TREE;
        } else {
            if (rand.nextInt(10) == 0)
            {
                return BIG_TREE_FEATURE;
            }
            else if (rand.nextInt(2) == 0)
            {
                return new WorldGenShrub(JUNGLE_LOG, OAK_LEAF);
            } else {
                return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? new WorldGenMegaJungle(false, 10, 15, JUNGLE_LOG, JUNGLE_LEAF) : new WorldGenDawnTree(false, 4 + rand.nextInt(7), JUNGLE_LOG, JUNGLE_LEAF, true));
            }
        }
    }
    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);
        int i = rand.nextInt(16) + 8;
        int j = rand.nextInt(16) + 8;
        int height = worldIn.getHeight(pos.add(i, 0, j)).getY() * 2; // could == 0, which crashes nextInt
        if (height < 1) height = 1;
        int k = rand.nextInt(height);
        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN))
            (new WorldGenMelon()).generate(worldIn, rand, pos.add(i, k, j));
        WorldGenVines worldgenvines = new WorldGenVines();

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
            for (int j1 = 0; j1 < 50; ++j1)
            {
                k = rand.nextInt(16) + 8;
                int l = 128;
                int i1 = rand.nextInt(16) + 8;
                worldgenvines.generate(worldIn, rand, pos.add(k, 128, i1));
            }
    }
}
