package me.geometrically.prehistoric.server.world.biome;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomePrehistoric extends Biome{

    private int grassColor, foliageColor;

    public BiomePrehistoric(BiomeProperties properties){
        super(properties);
        spawnableMonsterList.clear();
        spawnableCreatureList.clear();
        spawnableWaterCreatureList.clear();
        spawnableCaveCreatureList.clear();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getModdedBiomeGrassColor(int original) {
        return grassColor;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos pos) {
        return grassColor;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getModdedBiomeFoliageColor(int original) {
        return foliageColor;
    }

    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos) {
        return foliageColor;
    }
    protected final BiomePrehistoric setColors(int grassAndFoliage) {
        setColors(grassAndFoliage, grassAndFoliage);
        return this;
    }
    protected final BiomePrehistoric setColors(int grass, int foliage) {
        grassColor = grass;
        foliageColor = foliage;
        return this;
    }
}
