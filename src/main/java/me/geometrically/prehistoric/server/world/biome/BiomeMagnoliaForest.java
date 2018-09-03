package me.geometrically.prehistoric.server.world.biome;

import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityProtoceratops;
import me.geometrically.prehistoric.server.init.PEBlocks;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTrees;

import java.util.Random;

public class BiomeMagnoliaForest extends BiomePrehistoric{

    private static final WorldGenTrees MAGNOLIA = new WorldGenTrees(false, 5, Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.DARK_OAK), PEBlocks.MAGNOLIA_LEAVES.getDefaultState(), false);
    private static final WorldGenTrees PINK_MAGNOLIA = new WorldGenTrees(false, 5, Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.DARK_OAK), PEBlocks.PINK_MAGNOLIA_LEAVES.getDefaultState(), false);
    private static final WorldGenTrees OAK_TREE = new WorldGenTrees(false, 4, Blocks.LOG.getDefaultState(), Blocks.LEAVES.getDefaultState(), false);

    public BiomeMagnoliaForest(){
        super(new BiomeProperties("Magnolia Forest").setBaseHeight(0.3F).setHeightVariation(0.2F).setTemperature(0.1F));

        this.decorator.treesPerChunk = 10;
        this.decorator.grassPerChunk = 3;
        this.setColors(4625193);

        this.spawnableMonsterList.add(new SpawnListEntry(EntityProtoceratops.class, 1, 3, 5));
    }
    @Override
    public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        if(rand.nextInt(3) == 0){
            return MAGNOLIA;
        }
        else if(rand.nextInt(3) == 1){
            return PINK_MAGNOLIA;
        }
        else{
            return OAK_TREE;
        }
    }
}
