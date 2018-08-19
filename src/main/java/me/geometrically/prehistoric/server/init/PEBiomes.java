package me.geometrically.prehistoric.server.init;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.world.biome.BiomeDawnForest;
import me.geometrically.prehistoric.server.world.biome.BiomeDawnJungle;
import me.geometrically.prehistoric.server.world.biome.BiomeMagnoliaForest;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PEBiomes {
    public static final Biome DAWN_JUNGLE = new BiomeDawnJungle();
    public static final Biome DAWN_FOREST = new BiomeDawnForest();
    public static final Biome MAGNOLIA_FOREST = new BiomeMagnoliaForest();
    //public static final Biome WETLANDS = new BiomeWetlands();

    @SubscribeEvent
    public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
        initBiome(event, DAWN_JUNGLE, "Dawn Jungle", BiomeType.WARM, Type.JUNGLE, Type.WET, Type.LUSH);
        initBiome(event, DAWN_FOREST, "Dawn Forest", BiomeType.COOL, Type.DENSE, Type.FOREST, Type.LUSH);
        initBiome(event, MAGNOLIA_FOREST, "Magnolia Forest", BiomeType.COOL, Type.DENSE, Type.FOREST, Type.LUSH);
        //initBiome(event, WETLANDS, "Wetlands", BiomeType.WARM, Type.WET, Type.SWAMP);
    }

    private static Biome initBiome(RegistryEvent.Register<Biome> event, Biome biome, String name, BiomeType biomeType, Type... types)
    {
        biome.setRegistryName(name);
        event.getRegistry().register(biome);
        BiomeDictionary.addTypes(biome, types);
        return biome;
    }
}
