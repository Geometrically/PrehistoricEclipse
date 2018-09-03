package me.geometrically.prehistoric.server.world.biome;

import me.geometrically.prehistoric.server.entity.aquatic.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.aquatic.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.aquatic.EntitySaurichthys;
import me.geometrically.prehistoric.server.entity.aquatic.EntitySeaScorpion;
import net.minecraft.world.biome.Biome;

public class BiomePEOcean extends BiomePrehistoric{
    public BiomePEOcean(BiomeProperties properties){
        super(properties);

        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityPlesiosaurus.class, 95, 2, 5));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySaurichthys.class, 90, 6, 7));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySeaScorpion.class, 110, 3, 4));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityDunkleosteus.class, 100, 1, 1));
    }
}
