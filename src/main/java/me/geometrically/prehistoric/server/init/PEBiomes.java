package me.geometrically.prehistoric.server.init;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.world.biome.*;
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
    public static final Biome MESA = new BiomePEMesa();
    public static final Biome DESERT = new BiomePEDesert();
    public static final Biome SWAMP = new BiomeSwamp();
    public static final Biome PLAINS = new BiomePEPlains();
    public static final Biome STREAM = new BiomeStream();
    public static final Biome OCEAN = new BiomePEOcean(new Biome.BiomeProperties("PEOcean").setBaseHeight(-1.0F).setHeightVariation(0.1F));
    public static final Biome DEEP_OCEAN = new BiomePEOcean(new Biome.BiomeProperties("PEDeep Ocean").setBaseHeight(-1.8F).setHeightVariation(0.1F));

    @SubscribeEvent
    public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
        initBiome(event, DAWN_JUNGLE, "dawn_jungle", BiomeType.WARM, Type.JUNGLE, Type.WET, Type.LUSH);
        initBiome(event, DAWN_FOREST, "dawn_forest", BiomeType.COOL, Type.DENSE, Type.FOREST, Type.LUSH);
        initBiome(event, MAGNOLIA_FOREST, "magnolia_forest", BiomeType.COOL, Type.DENSE, Type.FOREST, Type.LUSH);
        initBiome(event, MESA, "pe_mesa", BiomeType.DESERT, Type.DRY, Type.DEAD, Type.SANDY, Type.MESA);
        initBiome(event, DESERT, "pe_desert", BiomeType.DESERT, Type.DRY, Type.SANDY, Type.DEAD);
        initBiome(event, SWAMP, "swamp", BiomeType.WARM, Type.WET, Type.SWAMP);
        initBiome(event, PLAINS, "pe_plains", BiomeType.COOL, Type.PLAINS);
        initBiome(event, STREAM, "stream", BiomeType.COOL, Type.RIVER, Type.WATER);
        initBiome(event, OCEAN, "pe_ocean", BiomeType.COOL, Type.OCEAN, Type.WATER);
        initBiome(event, DEEP_OCEAN, "pe_deep_ocean", BiomeType.COOL, Type.OCEAN, Type.WATER);
    }

    private static void initBiome(RegistryEvent.Register<Biome> event, Biome biome, String name, BiomeType biomeType, Type... types)
    {
        biome.setRegistryName(name);
        event.getRegistry().register(biome);
        BiomeDictionary.addTypes(biome, types);
    }
}
