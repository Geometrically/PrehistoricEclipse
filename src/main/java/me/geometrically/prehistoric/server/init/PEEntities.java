package me.geometrically.prehistoric.server.init;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.server.entity.aquatic.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.aquatic.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.aquatic.EntitySaurichthys;
import me.geometrically.prehistoric.server.entity.aquatic.EntitySeaScorpion;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.*;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.*;
import me.geometrically.prehistoric.server.entity.flying.EntityDragonfly;
import me.geometrically.prehistoric.server.entity.flying.EntityTupandactylus;
import me.geometrically.prehistoric.server.entity.projectile.EntityDakoArrow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.util.Random;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PEEntities {


    private static int id = 1;


    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        registerEntity(EntityDakotaraptor.class, "Dakotaraptor", true);
        registerEntity(EntityMonolophosaurus.class, "Monolophosaurus", true);
        registerEntity(EntityPlesiosaurus.class, "Plesiosaurus", true);
        registerEntity(EntityVelociraptor.class, "Velociraptor", true);
        registerEntity(EntityTitanoceratops.class, "Titanoceratops", true);
        registerEntity(EntityDunkleosteus.class, "Dunkleosteus", true);
        registerEntity(EntityPlateosaurus.class, "Plateosaurus", true);
        registerEntity(EntityArthropleura.class, "Arthropleura", true);
        registerEntity(EntitySaurichthys.class, "Saurichthys", true);
        registerEntity(EntityTyrannosaurusRex.class, "TyrannosaurusRex", true);
        registerEntity(EntityProtoceratops.class, "Protoceratops", true);
        registerEntity(EntitySeaScorpion.class, "SeaScorpion", true);
        registerEntity(EntityPachycephalosaurus.class, "Pachycephalosaurus", true);
        registerEntity(EntityDragonfly.class, "Dragonfly", true);
        registerEntity(EntityTupandactylus.class, "Tupandactylus", true);
        registerEntity(EntityAllosaurus.class, "Allosaurus", true);
        registerEntity(EntitySauroposeidon.class, "Sauroposeidon", true);

        registerEntity(EntityEgg.class, "Egg", false);
        registerEntity(EntityDakoArrow.class, "DakoArrow", false);
    }

    private static void registerEntity(Class entityClass, String name, boolean egg)
    {
        long seed = name.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;
        if(egg){
            EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, name), entityClass, name, id++, PrehistoricEclipse.instance, 64, 3, true, primaryColor, secondaryColor);
        } else {
            EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, name), entityClass, name, id++, PrehistoricEclipse.instance, 64, 3, true);
        }
    }
}
