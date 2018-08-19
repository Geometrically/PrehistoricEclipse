package me.geometrically.prehistoric.client.render;

import me.geometrically.prehistoric.server.entity.projectile.EntityDakoArrow;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDakoArrow extends RenderArrow<EntityDakoArrow>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public RenderDakoArrow(RenderManager manager)
    {
        super(manager);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityDakoArrow entity)
    {
        return TEXTURE;
    }
}