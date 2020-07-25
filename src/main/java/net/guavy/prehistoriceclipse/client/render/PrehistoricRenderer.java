package net.guavy.prehistoriceclipse.client.render;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.Identifier;

public class PrehistoricRenderer<T extends DinosaurEntity> extends MobEntityRenderer<T, EntityModel<T>> {

    public PrehistoricRenderer(EntityRenderDispatcher entityRenderDispatcher, EntityModel<T> entityModel) {
        super(entityRenderDispatcher, entityModel, 1f);
    }

    @Override
    public Identifier getTexture(DinosaurEntity entity) {
        if (entity.getGender() == DinosaurEntity.Gender.FEMALE && T.hasVariant()) {
            return new Identifier("pe:textures/entity/" + T.getDinosaurName() + "/female.png");
        } else {
            return new Identifier("pe:textures/entity/" + T.getDinosaurName() + "/male.png");
        }
    }
}
