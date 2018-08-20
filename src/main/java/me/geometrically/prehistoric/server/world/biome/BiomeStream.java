package me.geometrically.prehistoric.server.world.biome;

import me.geometrically.prehistoric.server.entity.water.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.water.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.water.EntitySaurichthys;
import me.geometrically.prehistoric.server.entity.water.EntitySeaScorpion;
import net.minecraft.world.biome.Biome;

public class BiomeStream extends BiomePrehistoric {
    public BiomeStream(){
        super(new BiomeProperties("Stream").setTemperature(0.8F).setBaseHeight(-0.5F).setHeightVariation(0.0F));
        this.setColors(4625193);
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityPlesiosaurus.class, 90, 2, 5));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySaurichthys.class, 100, 6, 7));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySeaScorpion.class, 90, 3, 4));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntityDunkleosteus.class, 95, 1, 1));
    }
}
