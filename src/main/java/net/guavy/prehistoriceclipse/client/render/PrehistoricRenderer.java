package net.guavy.prehistoriceclipse.client.render;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.Identifier;

public class PrehistoricRenderer<T extends DinosaurEntity> extends MobEntityRenderer<T, EntityModel<T>> {

    private String resourceName;

    public PrehistoricRenderer(EntityRenderDispatcher entityRenderDispatcher, EntityModel<T> entityModel, String resourceName) {
        super(entityRenderDispatcher, entityModel, 1f);

        this.resourceName = resourceName;
    }

    @Override
    public Identifier getTexture(T entity) {
        return new Identifier("pe:textures/entity/" + resourceName + ".png");
    }
}
