package net.guavy.prehistoriceclipse.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.AnimationBuilder;
import software.bernie.geckolib.animation.AnimationTestEvent;
import software.bernie.geckolib.animation.model.AnimationController;
import software.bernie.geckolib.animation.model.AnimationControllerCollection;
import software.bernie.geckolib.entity.IAnimatedEntity;

public class DinosaurEntity extends MobEntity implements IAnimatedEntity {
    public AnimationControllerCollection animationControllers = new AnimationControllerCollection();

    private AnimationController<DinosaurEntity> moveController = new AnimationController<>(this, "moveController", 10F, this::moveController);

    protected DinosaurEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
        registerAnimationControllers();
    }

    @Override
    public AnimationControllerCollection getAnimationControllers() {
        return animationControllers;
    }

    public void registerAnimationControllers() {
        if(!this.world.isClient) return;

        this.animationControllers.addAnimationController(moveController);
    }

    private <T extends Entity> boolean moveController(AnimationTestEvent<T> entityAnimationTestEvent)
    {
        moveController.transitionLength = 10;

        moveController.setAnimation(new AnimationBuilder().addAnimation("Idle", true));

        return true;
    }

}
