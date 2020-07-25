package net.guavy.prehistoriceclipse.client.model;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.forgetofabric.ResourceLocation;

public class DinosaurModel<T extends DinosaurEntity> extends AnimatedEntityModel<T> {
    @Override
    public ResourceLocation getAnimationFileLocation() {
        return T.getAnimationFilePath();
    }
}
