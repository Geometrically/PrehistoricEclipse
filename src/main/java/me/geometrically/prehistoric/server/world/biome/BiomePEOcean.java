package me.geometrically.prehistoric.server.world.biome;

import me.geometrically.prehistoric.server.entity.water.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.water.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.water.EntitySaurichthys;
import net.minecraft.world.biome.Biome;

public class BiomePEOcean extends BiomePrehistoric{
    public BiomePEOcean(BiomeProperties properties){
        super(properties);

        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityPlesiosaurus.class, 80, 2, 5));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySaurichthys.class, 90, 6, 7));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityDunkleosteus.class, 90, 3, 4));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityDunkleosteus.class, 1000, 1, 1));
    }
}
