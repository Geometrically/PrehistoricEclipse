package me.geometrically.prehistoric.server.world.biome;

import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityVelociraptor;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomePEDesert extends BiomePrehistoric{
    public BiomePEDesert()
    {
        super(new Biome.BiomeProperties("Desert").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(2.0F).setRainfall(0.0F).setRainDisabled());
        this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();
        this.decorator.treesPerChunk = -999;
        this.decorator.deadBushPerChunk = 2;
        this.decorator.reedsPerChunk = 50;
        this.decorator.cactiPerChunk = 10;

        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityVelociraptor.class, 10, 4, 8));
    }
}
