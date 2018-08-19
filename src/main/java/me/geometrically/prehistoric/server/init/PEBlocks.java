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
    public static final Block PINK_MAGNOLIA_SAPLING = new BlockMagnoliaSapling("pink_magnolia_sapling");

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(NEST, GRAPE_VINES, RED_CORAL, BLUE_CORAL, YELLOW_CORAL, WATER_PLANT, MAGNOLIA_LEAVES, PINK_MAGNOLIA_LEAVES, MAGNOLIA_SAPLING, PINK_MAGNOLIA_SAPLING, SEA_ANEMONE, SEAWEED_SEGMENT);
    }
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(NEST).setRegistryName(NEST.getRegistryName()),
                new ItemBlock(GRAPE_VINES).setRegistryName(GRAPE_VINES.getRegistryName()),
                new ItemBlock(RED_CORAL).setRegistryName(RED_CORAL.getRegistryName()),
                new ItemBlock(BLUE_CORAL).setRegistryName(BLUE_CORAL.getRegistryName()),
                new ItemBlock(YELLOW_CORAL).setRegistryName(YELLOW_CORAL.getRegistryName()),
                new ItemBlock(WATER_PLANT).setRegistryName(WATER_PLANT.getRegistryName()),
                new ItemBlock(MAGNOLIA_LEAVES).setRegistryName(MAGNOLIA_LEAVES.getRegistryName()),
                new ItemBlock(PINK_MAGNOLIA_LEAVES).setRegistryName(PINK_MAGNOLIA_LEAVES.getRegistryName()),
                new ItemBlock(MAGNOLIA_SAPLING).setRegistryName(MAGNOLIA_SAPLING.getRegistryName()),
                new ItemBlock(PINK_MAGNOLIA_SAPLING).setRegistryName(PINK_MAGNOLIA_SAPLING.getRegistryName()),
                new ItemBlock(SEA_ANEMONE).setRegistryName(SEA_ANEMONE.getRegistryName()),
                new ItemBlock(SEAWEED_SEGMENT).setRegistryName(SEAWEED_SEGMENT.getRegistryName())
        );
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(NEST));
        registerRender(Item.getItemFromBlock(GRAPE_VINES));
        registerRender(Item.getItemFromBlock(RED_CORAL));
        registerRender(Item.getItemFromBlock(BLUE_CORAL));
        registerRender(Item.getItemFromBlock(YELLOW_CORAL));
        registerRender(Item.getItemFromBlock(WATER_PLANT));
        registerRender(Item.getItemFromBlock(MAGNOLIA_LEAVES));
        registerRender(Item.getItemFromBlock(PINK_MAGNOLIA_LEAVES));
        registerRender(Item.getItemFromBlock(MAGNOLIA_SAPLING));
        registerRender(Item.getItemFromBlock(PINK_MAGNOLIA_SAPLING));
        registerRender(Item.getItemFromBlock(SEA_ANEMONE));
        registerRender(Item.getItemFromBlock(SEAWEED_SEGMENT));
    }
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
