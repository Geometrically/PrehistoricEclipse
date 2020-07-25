package net.guavy.prehistoriceclipse.entity;

import net.guavy.prehistoriceclipse.entity.ai.DinosaurWanderGoal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.PounceAtTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.AnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.manager.EntityAnimationManager;

public abstract class DinosaurEntity extends MobEntityWithAi implements IAnimatedEntity {

    private static final TrackedData<String> GENDER = DataTracker.registerData(DinosaurEntity.class, TrackedDataHandlerRegistry.STRING);

    public EntityAnimationManager animationManager = new EntityAnimationManager();
    private AnimationController<DinosaurEntity> moveController = new AnimationController<DinosaurEntity>(this, "moveController", 10F, this::moveController);

    public DinosaurEntity(EntityType<? extends MobEntityWithAi> type, World world) {
        super(type, world);
        registerAnimationControllers();
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(3, new PounceAtTargetGoal(this, 0.6F));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 0.6F, true));
        this.goalSelector.add(5, new DinosaurWanderGoal(this, 50, 0.4D));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.set(GENDER, Gender.MALE.name());
    }

    @Override
    protected void afterSpawn() {
        super.afterSpawn();

        this.setGender(Gender.values()[random.nextInt(2)]);
    }

    public Gender getGender() {
        return Gender.valueOf(this.dataTracker.get(GENDER));
    }

    public void setGender(Gender gender) {
        this.dataTracker.set(GENDER, gender.name());
    }

    @Override
    public void fromTag(CompoundTag tag) {
        super.fromTag(tag);

        this.setGender(Gender.valueOf(tag.getString("Gender")));
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        tag.putString("Gender", this.getGender().name());

        return super.toTag(tag);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return this.animationManager;
    }

    public void registerAnimationControllers() {
        if(!this.world.isClient) return;

        this.animationManager.addAnimationController(moveController);
    }

    private boolean moveController(AnimationTestEvent<DinosaurEntity> entityAnimationTestEvent)
    {
        DinosaurEntity dinosaurEntity = entityAnimationTestEvent.getEntity();

        if(dinosaurEntity.isAttacking()) {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Attack", false));
        } else if(dinosaurEntity.limbDistance > 0.3F) {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Run", true));
        } else if(dinosaurEntity.limbDistance > 0.2F) {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Walk", true));
        } else {
            moveController.setAnimation(new AnimationBuilder().addAnimation("Idle", true));
        }

        return true;
    }

    public abstract String getDinosaurName();

    public ResourceLocation getAnimationFilePath() {
        return new ResourceLocation("pe", "animations/" + getDinosaurName() + ".animation.json");
    }

    public static boolean hasVariant() {
        return false;
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
