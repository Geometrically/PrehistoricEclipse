package me.geometrically.prehistoric.server.world.gen.layer;

import net.minecraft.world.gen.layer.*;

public abstract class GenLayerPreclipse extends GenLayer{
    public GenLayerPreclipse(long seed) {
        super(seed);
    }
    public static GenLayer[] makeTheWorld(long seed) {
        GenLayer biomes = new GenLayerPreclipseBiomes(1L);

        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);

        GenLayer oceanLayer = new GenLayerDeepOcean(4L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);

        GenLayer riverLayer = new GenLayerRiver(1L, biomes);
        riverLayer = new GenLayerSmooth(7000L, riverLayer);
        biomes = new GenLayerRiverMix(100L, biomes, riverLayer);

        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);

        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);

        return new GenLayer[] {biomes, genlayervoronoizoom};
    }
}
