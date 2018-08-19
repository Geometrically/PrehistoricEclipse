package me.geometrically.prehistoric.client.proxy;

import com.dabigjoe.obsidianAPI.file.importer.FileLoader;
import com.dabigjoe.obsidianAPI.registry.AnimationRegistry;
import me.geometrically.prehistoric.client.render.RenderDakoArrow;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityTyrannosaurusRex;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityProtoceratops;
import me.geometrically.prehistoric.server.entity.water.EntitySaurichthys;
import me.geometrically.prehistoric.server.entity.water.EntitySeaScorpion;
import me.geometrically.prehistoric.server.init.PEAnimations;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityVelociraptor;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityDakotaraptor;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityMonolophosaurus;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityArthropleura;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityPlateosaurus;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityTitanoceratops;
import me.geometrically.prehistoric.server.entity.projectile.EntityDakoArrow;
import me.geometrically.prehistoric.server.entity.water.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.water.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.client.model.ModelDinosaur;
import me.geometrically.prehistoric.client.render.RenderDinosaur;
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
        RenderDinosaur dakoRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("dakotaraptor", new ResourceLocation(Reference.MOD_ID + ":models/entity/dako/dakotaraptor.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/dako/dakotaraptor.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityDakotaraptor.class, dakoRenderer);
        RenderDinosaur monoRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("monolophosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/mono/monolophosaurus.obm"), null, ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityMonolophosaurus.class, monoRenderer);
        RenderDinosaur plesRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("plesiosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/ples/plesiosaurus.obm"),null, ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlesiosaurus.class, plesRenderer);
        RenderDinosaur veloRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("velociraptor", new ResourceLocation(Reference.MOD_ID + ":models/entity/velo/velociraptor_eclipse.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/velo/velociraptor.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityVelociraptor.class, veloRenderer);
        RenderDinosaur titanRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("titanoceratops", new ResourceLocation(Reference.MOD_ID + ":models/entity/titan/titanoceratops.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/titan/titanoceratops.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityTitanoceratops.class, titanRenderer);
        RenderDinosaur eggRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("egg", new ResourceLocation(Reference.MOD_ID + ":models/entity/egg/egg.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/egg/egg.png"), ModelDinosaur.class), 0.0F);
        RenderingRegistry.registerEntityRenderingHandler(EntityEgg.class, eggRenderer);
        RenderDinosaur dunkleoRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("dunkleosteus", new ResourceLocation(Reference.MOD_ID + ":models/entity/dunkleo/dunkleosteus.obm"), new ResourceLocation(Reference.MOD_ID + ":models/entity/dunkleo/dunkleosteus.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityDunkleosteus.class, dunkleoRenderer);
        RenderDinosaur plateoRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("plateosaurus", new ResourceLocation(Reference.MOD_ID + ":models/entity/plateo/plateosaurus.obm"), null, ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlateosaurus.class, plateoRenderer);
        RenderDinosaur arthroRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("arthropleura", new ResourceLocation(Reference.MOD_ID + ":models/entity/arthro/arthropleura.obm"), null, ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityArthropleura.class, arthroRenderer);
        RenderDinosaur sauriRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("saurichthys", new ResourceLocation(Reference.MOD_ID + ":models/entity/sauri/saurichthys.obm"), null, ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntitySaurichthys.class, sauriRenderer);
        RenderDinosaur rexRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("tyrannosaurusrex", new ResourceLocation(Reference.MOD_ID + ":models/entity/trex/tyrannosaurus_rex.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/trex/rex.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityTyrannosaurusRex.class, rexRenderer);
        RenderDinosaur protoRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("protoceratops", new ResourceLocation(Reference.MOD_ID + ":models/entity/proto/protoceratops.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/proto/male.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntityProtoceratops.class, protoRenderer);
        RenderDinosaur scorpRenderer = new RenderDinosaur(FileLoader.loadModelFromResources("seascorpion", new ResourceLocation(Reference.MOD_ID + ":models/entity/scorp/sea_scorpion.obm"), new ResourceLocation(Reference.MOD_ID, "models/entity/scorp/scorpion.png"), ModelDinosaur.class));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeaScorpion.class, scorpRenderer);

        RenderingRegistry.registerEntityRenderingHandler(EntityDakoArrow.class, RenderDakoArrow::new);

        AnimationRegistry.init();
        PEAnimations.registerAnimations();
    }
    @Override
    public void postInit(){

    }
}
