package me.geometrically.prehistoric.server.init;

import com.dabigjoe.obsidianAPI.ObsidianAPIUtil;
import com.dabigjoe.obsidianAPI.animation.wrapper.AIAnimationWrapper;
import com.dabigjoe.obsidianAPI.animation.wrapper.FunctionAnimationWrapper;
import com.dabigjoe.obsidianAPI.registry.AnimationRegistry;
import me.geometrically.prehistoric.server.Reference;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.server.entity.EntityPrehistoric;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDefense;
import me.geometrically.prehistoric.server.entity.ai.EntityAIDinoEatGrass;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAICall;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIEat;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIRunFromEntity;
import me.geometrically.prehistoric.server.entity.ai.animation.EntityAIStartle;
import me.geometrically.prehistoric.server.entity.aquatic.*;
import me.geometrically.prehistoric.server.entity.dinosaur.EntityDinosaur;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.*;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.*;
import me.geometrically.prehistoric.server.entity.flying.EntityDragonfly;
import me.geometrically.prehistoric.server.entity.flying.EntityTupandactylus;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.util.ResourceLocation;

public class PEAnimations {
    private static FunctionAnimationWrapper.IsActiveFunction isWalking = (entity) -> {
        return ObsidianAPIUtil.isEntityMoving(entity) && !entity.isSprinting() && !entity.isSneaking() && entity.onGround;
    };
    private static FunctionAnimationWrapper.IsActiveFunction returnTrue = (entity) -> { return true; };
    private static FunctionAnimationWrapper.IsActiveFunction isSwimming = (entity) -> {
        return entity instanceof EntityAquatic ? ((EntityAquatic) entity).isMoving() : false;
    };
    private static FunctionAnimationWrapper.IsActiveFunction isSitting = (entity) -> { return entity instanceof EntityTameable ? ((EntityTameable) entity).isSitting() : false; };
    private static FunctionAnimationWrapper.IsActiveFunction isAttacking = (entity) -> {
        return entity instanceof EntityPrehistoric ? ((EntityPrehistoric) entity).isAttacking : false;
    };
    private static FunctionAnimationWrapper.IsActiveFunction isRunning = (entity) -> {
        return entity instanceof EntityDinosaur ? ((EntityDinosaur) entity).getAttackTarget() != null && ((EntityDinosaur) entity).isMoving() : false;
    };
    private static FunctionAnimationWrapper.IsActiveFunction isFlying = (entity) -> {
        return ObsidianAPIUtil.isEntityMoving(entity);
    };

    public static void registerAnimations(){
        registerEggAnimations();
        registerDakoAnimations();
        registerMonoAnimations();
        registerPlesAnimations();
        registerVeloAnimations();
        registerTitanAnimations();
        registerDunkleoAnimations();
        registerPlateoAnimations();
        registerArthroAnimations();
        registerSauriAnimations();
        registerRexAnimations();
        registerProtoAnimations();
        registerSeaScorpionAnimations();
        registerPachyAnimations();
        registerDragonAnimations();
        registerTupanAnimations();
        registerAlloAnimations();
        registerSauroposeidonAnimations();
    }
    private static void registerEggAnimations(){
        FunctionAnimationWrapper.IsActiveFunction isHatching = (entity) -> { return entity instanceof EntityEgg ? ((EntityEgg) entity).timeUntilHatch() <= 200 : false; };
        AnimationRegistry.registerEntity(EntityEgg.class, "egg");
        AnimationRegistry.registerAnimation("egg", "Wiggle", new ResourceLocation(Reference.MOD_ID + ":animations/egg/egg_wiggle.oba"), 10, true, isHatching);
    }
    private static void registerDakoAnimations(){
        AnimationRegistry.registerEntity(EntityDakotaraptor.class, "dakotaraptor");
        AnimationRegistry.registerAnimation("dakotaraptor", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("dakotaraptor", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("dakotaraptor", "Run", new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_run.oba"), 8, true, isRunning);
        AnimationRegistry.registerAnimation("dakotaraptor", "Call", new AIAnimationWrapper(EntityAICall.name, new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_call.oba"), 3, false));
        AnimationRegistry.registerAnimation("dakotaraptor", "Sit", new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_sit_idle.oba"), 0, true, isSitting);
        AnimationRegistry.registerAnimation("dakotaraptor", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_attack.oba"), 4, true, isAttacking);
        AnimationRegistry.registerAnimation("dakotaraptor", "Eat", new AIAnimationWrapper(EntityAIEat.name, new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_eat.oba"), 5, false));
        AnimationRegistry.registerAnimation("dakotaraptor", "Startle", new AIAnimationWrapper(EntityAIStartle.name, new ResourceLocation(Reference.MOD_ID + ":animations/dako/dakotaraptor_startle.oba"), 5, false));
    }
    private static void registerMonoAnimations(){
        AnimationRegistry.registerEntity(EntityMonolophosaurus.class, "monolophosaurus");
        AnimationRegistry.registerAnimation("monolophosaurus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/mono/monolophosaurus_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("monolophosaurus", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/mono/monolophosaurus_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("monolophosaurus", "Call", new AIAnimationWrapper(EntityAICall.name, new ResourceLocation(Reference.MOD_ID + ":animations/mono/monolophosaurus_call.oba"), 3, false));
        AnimationRegistry.registerAnimation("monolophosaurus", "Startle", new AIAnimationWrapper(EntityAIStartle.name, new ResourceLocation(Reference.MOD_ID + ":animations/mono/monolophosaurus_startle.oba"), 8, false));
        AnimationRegistry.registerAnimation("monolophosaurus", "Run", new ResourceLocation(Reference.MOD_ID + ":animations/mono/monolophosaurus_run.oba"), 8, true, isRunning);
    }
    private static void registerPlesAnimations(){
        AnimationRegistry.registerEntity(EntityPlesiosaurus.class, "plesiosaurus");
        AnimationRegistry.registerAnimation("plesiosaurus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/ples/plesiosaurus_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("plesiosaurus", "Swim", new ResourceLocation(Reference.MOD_ID + ":animations/ples/plesiosaurus_swim.oba"), 1, true, isSwimming);
        AnimationRegistry.registerAnimation("plesiosaurus", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/ples/plesiosaurus_attack.oba"), 1, true, isAttacking);
    }
    private static void registerDunkleoAnimations(){
        AnimationRegistry.registerEntity(EntityDunkleosteus.class, "dunkleosteus");
        AnimationRegistry.registerAnimation("dunkleosteus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/dunkleo/dunkleo_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("dunkleosteus", "Swim", new ResourceLocation(Reference.MOD_ID + ":animations/dunkleo/dunkleo_swim.oba"), 1, true, isSwimming);
        AnimationRegistry.registerAnimation("dunkleosteus", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/dunkleo/dunkleo_attack.oba"), 8, true, isAttacking);
    }
    private static void registerVeloAnimations(){
        AnimationRegistry.registerEntity(EntityVelociraptor.class, "velociraptor");
        AnimationRegistry.registerAnimation("velociraptor", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/velo/velociraptor_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("velociraptor", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/velo/velociraptor_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("velociraptor", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/velo/velociraptor_attack.oba"), 4, true, isAttacking);
        AnimationRegistry.registerAnimation("velociraptor", "Startle", new AIAnimationWrapper(EntityAIStartle.name, new ResourceLocation(Reference.MOD_ID + ":animations/velo/velociraptor_threaten.oba"), 5, false));
        AnimationRegistry.registerAnimation("velociraptor", "Eat", new AIAnimationWrapper(EntityAIEat.name, new ResourceLocation(Reference.MOD_ID + ":animations/velo/velociraptor_eat.oba"), 5, false));
    }
    private static void registerTitanAnimations(){
        AnimationRegistry.registerEntity(EntityTitanoceratops.class, "titanoceratops");
        AnimationRegistry.registerAnimation("titanoceratops", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/titan/titanoceratops_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("titanoceratops", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/titan/titanoceratops_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("titanoceratops", "Eat", new AIAnimationWrapper(EntityAIDinoEatGrass.name, new ResourceLocation(Reference.MOD_ID + ":animations/titan/titanoceratops_eat.oba"), 5, false));
        AnimationRegistry.registerAnimation("titanoceratops", "Defense", new AIAnimationWrapper(EntityAIDefense.name, new ResourceLocation(Reference.MOD_ID + ":animations/titan/titanoceratops_defense.oba"), 1, false));
        AnimationRegistry.registerAnimation("titanoceratops", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/titan/titanoceratops_attack.oba"), 4, true, isAttacking);
    }
    private static void registerPlateoAnimations(){
        AnimationRegistry.registerEntity(EntityPlateosaurus.class, "plateosaurus");
        AnimationRegistry.registerAnimation("plateosaurus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/plateo/plateosaurus_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("plateosaurus", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/plateo/plateosaurus_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("plateosaurus", "Run", new AIAnimationWrapper(EntityAIRunFromEntity.name, new ResourceLocation(Reference.MOD_ID + ":animations/plateo/plateosaurus_run.oba"), 3, true));
        AnimationRegistry.registerAnimation("plateosaurus", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/plateo/plateosaurus_attack.oba"), 4, true, isAttacking);

    }
    private static void registerArthroAnimations(){
        AnimationRegistry.registerEntity(EntityArthropleura.class, "arthropleura");
        AnimationRegistry.registerAnimation("arthropleura", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/arthro/arthropleura_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("arthropleura", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/arthro/arthropleura_walk.oba"), 10, true, isWalking);
    }
    private static void registerSauriAnimations(){
        AnimationRegistry.registerEntity(EntitySaurichthys.class, "saurichthys");
        AnimationRegistry.registerAnimation("saurichthys", "Swim", new ResourceLocation(Reference.MOD_ID + ":animations/sauri/saurichthys_swim.oba"), 1, true, isSwimming);
    }
    private static void registerRexAnimations(){
        AnimationRegistry.registerEntity(EntityTyrannosaurusRex.class, "tyrannosaurusrex");
        AnimationRegistry.registerAnimation("tyrannosaurusrex", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/trex/rex_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("tyrannosaurusrex", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/trex/rex_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("tyrannosaurusrex", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/trex/rex_attack.oba"), 3, true, isAttacking);
        AnimationRegistry.registerAnimation("tyrannosaurusrex", "Startle", new AIAnimationWrapper(EntityAIStartle.name, new ResourceLocation(Reference.MOD_ID + ":animations/trex/rex_roar.oba"), 5, false));
        AnimationRegistry.registerAnimation("tyrannosaurusrex", "Run", new ResourceLocation(Reference.MOD_ID + ":animations/trex/rex_run.oba"), 4, true, isRunning);

    }
    private static void registerProtoAnimations() {
        AnimationRegistry.registerEntity(EntityProtoceratops.class, "protoceratops");
        AnimationRegistry.registerAnimation("protoceratops", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/proto/protoceratops_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("protoceratops", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/proto/protoceratops_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("protoceratops", "Eat", new AIAnimationWrapper(EntityAIDinoEatGrass.name, new ResourceLocation(Reference.MOD_ID + ":animations/proto/protoceratops_eat.oba"), 5, true));
        AnimationRegistry.registerAnimation("protoceratops", "Run", new AIAnimationWrapper(EntityAIRunFromEntity.name, new ResourceLocation(Reference.MOD_ID + ":animations/proto/protoceratops_run.oba"), 3, true));
    }
    private static void registerSeaScorpionAnimations(){
        AnimationRegistry.registerEntity(EntitySeaScorpion.class, "seascorpion");
        AnimationRegistry.registerAnimation("seascorpion", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/scorp/sea_scorpion_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("seascorpion", "Swim", new ResourceLocation(Reference.MOD_ID + ":animations/scorp/sea_scorpion_swim.oba"), 1, true, isSwimming);
        AnimationRegistry.registerAnimation("seascorpion", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/scorp/sea_scorpion_attack.oba"), 8, true, isAttacking);
    }

    private static void registerPachyAnimations() {
        AnimationRegistry.registerEntity(EntityPachycephalosaurus.class, "pachycephalosaurus");
        AnimationRegistry.registerAnimation("pachycephalosaurus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/pachy/pachycephalosaurus_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("pachycephalosaurus", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/pachy/pachycephalosaurus_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("pachycephalosaurus", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/pachy/pachycephalosaurus_attack.oba"), 2, true, isAttacking);
        AnimationRegistry.registerAnimation("pachycephalosaurus", "Eat", new AIAnimationWrapper(EntityAIDinoEatGrass.name, new ResourceLocation(Reference.MOD_ID + ":animations/pachy/pachycephalosaurus_eat.oba"), 5, true));
        AnimationRegistry.registerAnimation("pachycephalosaurus", "Run", new AIAnimationWrapper(EntityAIRunFromEntity.name, new ResourceLocation(Reference.MOD_ID + ":animations/pachy/pachycephalosaurus_run.oba"), 3, true));
    }

    private static void registerDragonAnimations() {
        AnimationRegistry.registerEntity(EntityDragonfly.class, "dragonfly");
        AnimationRegistry.registerAnimation("dragonfly", "Fly", new ResourceLocation(Reference.MOD_ID + ":animations/mazo/mazothairos_fly.oba"), 10, true, isFlying);
    }

    private static void registerTupanAnimations() {
        AnimationRegistry.registerEntity(EntityTupandactylus.class, "tupandactylus");
        AnimationRegistry.registerAnimation("tupandactylus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/tupan/tupandactylus_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("tupandactylus", "Fly", new ResourceLocation(Reference.MOD_ID + ":animations/tupan/tupandactylus_fly.oba"), 10, true, isFlying);
    }
    private static void registerAlloAnimations(){
        AnimationRegistry.registerEntity(EntityAllosaurus.class, "allosaurus");
        AnimationRegistry.registerAnimation("allosaurus", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("allosaurus", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_walk.oba"), 10, true, isWalking);
        AnimationRegistry.registerAnimation("allosaurus", "Run", new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_run.oba"), 8, true, isRunning);
        AnimationRegistry.registerAnimation("allosaurus", "Sit", new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_sit.oba"), 0, true, isSitting);
        AnimationRegistry.registerAnimation("allosaurus", "Attack", new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_attack.oba"), 4, true, isAttacking);
        AnimationRegistry.registerAnimation("allosaurus", "Eat", new AIAnimationWrapper(EntityAIEat.name, new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_eat.oba"), 5, false));
        AnimationRegistry.registerAnimation("allosaurus", "Startle", new AIAnimationWrapper(EntityAIStartle.name, new ResourceLocation(Reference.MOD_ID + ":animations/allo/allosaurus_roar.oba"), 5, false));
    }

    private static void registerSauroposeidonAnimations() {
        AnimationRegistry.registerEntity(EntitySauroposeidon.class, "sauroposeidon");
        AnimationRegistry.registerAnimation("sauroposeidon", "Idle", new ResourceLocation(Reference.MOD_ID + ":animations/saur/sauroposiedon_idle.oba"), 100, true, returnTrue);
        AnimationRegistry.registerAnimation("sauroposeidon", "Walk", new ResourceLocation(Reference.MOD_ID + ":animations/saur/sauroposiedon_walk.oba"), 10, true, isWalking);
    }
}
