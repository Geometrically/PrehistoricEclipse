package me.geometrically.prehistoric.server.init;

import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.block.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PEBlocks {

    public static final Block NEST = new BlockNest();
    public static final Block GRAPE_VINES = new BlockGrapeVine("grape_vine");
    public static final Block RED_CORAL = new BlockCoral("coral_red");
    public static final Block BLUE_CORAL = new BlockCoral("coral_blue");
    public static final Block YELLOW_CORAL = new BlockCoral("coral_yellow");
    public static final Block WATER_PLANT = new BlockCoral("water_plant");
    public static final Block SEA_ANEMONE = new BlockCoral("sea_anemone");
    public static final Block SEAWEED_SEGMENT = new BlockCoral("seaweed_segment");
    public static final Block MAGNOLIA_LEAVES = new BlockMagnoliaLeaves("magnolia_leaves");
    public static final Block PINK_MAGNOLIA_LEAVES = new BlockMagnoliaLeaves("pink_magnolia_leaves");
    public static final Block MAGNOLIA_SAPLING = new BlockMagnoliaSapling("magnolia_sapling");
    public static final Block PINK_MAGNOLIA_SAPLING = new BlockPinkMagnoliaSapling("pink_magnolia_sapling");
    public static final Block TIME_MACHINE = new BlockTimeMachine();
    public static final Block CHAMBER = new BlockChamber();
    public static final Block INCUBATOR = new BlockIncubator();

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static void preInit() throws IllegalAccessException {
        for (Field field : PEBlocks.class.getDeclaredFields()) {
            Object obj = field.get(null);
            if (obj instanceof Block) {
                Block block = (Block) obj;
                BLOCKS.add(block);
            }
        }
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
    }
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        for (Block block : BLOCKS) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (Block block : BLOCKS) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(), "inventory"));
        }
    }
}
