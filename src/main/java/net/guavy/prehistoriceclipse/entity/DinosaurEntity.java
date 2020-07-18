package net.guavy.prehistoriceclipse.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.PounceAtTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.AnimationBuilder;
import software.bernie.geckolib.animation.AnimationTestEvent;
import software.bernie.geckolib.animation.model.AnimationController;
import software.bernie.geckolib.animation.model.AnimationControllerCollection;
import software.bernie.geckolib.entity.IAnimatedEntity;

public class DinosaurEntity extends MobEntityWithAi implements IAnimatedEntity {
    public AnimationControllerCollection animationControllers = new AnimationControllerCollection();

    private AnimationController<DinosaurEntity> moveController = new AnimationController<>(this, "moveController", 10F, this::moveController);

    protected DinosaurEntity(EntityType<? extends MobEntityWithAi> type, World world) {
        super(type, world);
        registerAnimationControllers();
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(3, new PounceAtTargetGoal(this, 0.6F));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 0.6F, false));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.4D));
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
        DinosaurEntity dinosaurEntity = (DinosaurEntity) entityAnimationTestEvent.getEntity();

        if(dinosaurEntity.isAttacking()) {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Attack", false));
        } else if(dinosaurEntity.limbDistance > 0.5F) {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Run", true));
        } else if(dinosaurEntity.limbDistance > 0.1F) {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Walk", true));
        } else {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Idle", true));
        }


        return true;
    }

    @Override
    public boolean tryAttack(Entity target) {
        return super.tryAttack(target);
    }
}
