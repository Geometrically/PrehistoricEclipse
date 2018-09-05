package me.geometrically.prehistoric.client.render;

import me.geometrically.prehistoric.server.entity.projectile.EntityDakoArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderTippedArrow;
import net.minecraft.util.ResourceLocation;

public class RenderDakoArrow extends RenderTippedArrow
{
    public static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public RenderDakoArrow(RenderManager manager)
    {
        super(manager);
    }


    protected ResourceLocation getEntityTexture(EntityDakoArrow entity)
    {
        return TEXTURE;
    }
}