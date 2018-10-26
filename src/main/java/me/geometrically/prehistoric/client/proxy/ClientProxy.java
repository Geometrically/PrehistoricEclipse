package me.geometrically.prehistoric.client.proxy;

import com.dabigjoe.obsidianAPI.file.importer.FileLoader;
import com.dabigjoe.obsidianAPI.registry.AnimationRegistry;
import me.geometrically.prehistoric.client.model.ModelPrehistoric;
import me.geometrically.prehistoric.client.render.RenderDakoArrow;
import me.geometrically.prehistoric.client.render.RenderPrehistoric;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.server.entity.aquatic.*;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.*;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.*;
import me.geometrically.prehistoric.server.entity.flying.EntityDragonfly;
import me.geometrically.prehistoric.server.entity.flying.EntityTupandactylus;
import me.geometrically.prehistoric.server.entity.projectile.EntityDakoArrow;
import me.geometrically.prehistoric.server.init.PEAnimations;
import me.geometrically.prehistoric.server.proxy.IProxy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy implements IProxy {
    @Override
    public void preInit() {

    }
    @Override
    public void init() {
        RenderPrehistoric dakoRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("dakotaraptor", new ResourceLocation(Reference.MOD_ID + ":models/entity/dako/dakotaraptor.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/dako/dakotaraptor.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityDakotaraptor.class, dakoRenderer);

        RenderPrehistoric monoRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("monolophosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/mono/monolophosaurus.obm"), null, ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityMonolophosaurus.class, monoRenderer);

        RenderPrehistoric plesRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("plesiosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/ples/plesiosaurus.obm"), null, ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlesiosaurus.class, plesRenderer);

        RenderPrehistoric veloRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("velociraptor", new ResourceLocation(Reference.MOD_ID + ":models/entity/velo/velociraptor_eclipse.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/velo/velociraptor.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityVelociraptor.class, veloRenderer);

        RenderPrehistoric titanRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("titanoceratops", new ResourceLocation(Reference.MOD_ID + ":models/entity/titan/titanoceratops.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/titan/titanoceratops.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityTitanoceratops.class, titanRenderer);

        RenderPrehistoric eggRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("egg", new ResourceLocation(Reference.MOD_ID + ":models/entity/egg/egg.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/egg/egg.png"), ModelPrehistoric.class), 0.0F);
        RenderingRegistry.registerEntityRenderingHandler(EntityEgg.class, eggRenderer);

        RenderPrehistoric dunkleoRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("dunkleosteus", new ResourceLocation(Reference.MOD_ID + ":models/entity/dunkleo/dunkleosteus.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/dunkleo/dunkleosteus.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityDunkleosteus.class, dunkleoRenderer);

        RenderPrehistoric plateoRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("plateosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/plateo/plateosaurus.obm"), null, ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlateosaurus.class, plateoRenderer);

        RenderPrehistoric arthroRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("arthropleura", new ResourceLocation(Reference.MOD_ID + ":models/entity/arthro/arthropleura.obm"), null, ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityArthropleura.class, arthroRenderer);

        RenderPrehistoric sauriRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("saurichthys", new ResourceLocation(Reference.MOD_ID + ":models/entity/sauri/saurichthys.obm"), null, ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntitySaurichthys.class, sauriRenderer);

        RenderPrehistoric rexRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("tyrannosaurusrex", new ResourceLocation(Reference.MOD_ID + ":models/entity/trex/tyrannosaurus_rex.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/trex/rex.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityTyrannosaurusRex.class, rexRenderer);

        RenderPrehistoric protoRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("protoceratops", new ResourceLocation(Reference.MOD_ID + ":models/entity/proto/protoceratops.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/proto/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityProtoceratops.class, protoRenderer);

        RenderPrehistoric scorpRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("seascorpion", new ResourceLocation(Reference.MOD_ID + ":models/entity/scorp/sea_scorpion.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/scorp/scorpion.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeaScorpion.class, scorpRenderer);

        RenderPrehistoric pachyRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("pachycephalosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/pachy/pachycephalosaurus.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/pachy/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachycephalosaurus.class, pachyRenderer);

        RenderPrehistoric dragonRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("dragonfly", new ResourceLocation(Reference.MOD_ID + ":models/entity/mazo/mazothairos.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/mazo/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityDragonfly.class, dragonRenderer);

        RenderPrehistoric tupanRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("tupandactylus", new ResourceLocation(Reference.MOD_ID + ":models/entity/tupan/tupandactylus.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/tupan/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityTupandactylus.class, tupanRenderer);

        RenderPrehistoric alloRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("allosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/allo/allosaurus.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/allo/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityAllosaurus.class, alloRenderer);

        RenderPrehistoric saurRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("sauroposeidon", new ResourceLocation(Reference.MOD_ID + ":models/entity/saur/sauroposeidon.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/saur/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntitySauroposeidon.class, saurRenderer);

        RenderPrehistoric onchoRenderer = new RenderPrehistoric(FileLoader.loadModelFromResources("onchopristis", new ResourceLocation(Reference.MOD_ID + ":models/entity/oncho/onchopristis.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/oncho/male.png"), ModelPrehistoric.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityOnchopristis.class, onchoRenderer);

        RenderingRegistry.registerEntityRenderingHandler(EntityDakoArrow.class, renderManager -> new RenderDakoArrow(renderManager));

        AnimationRegistry.init();
        PEAnimations.registerAnimations();
    }
    @Override
    public void postInit(){

    }
}
