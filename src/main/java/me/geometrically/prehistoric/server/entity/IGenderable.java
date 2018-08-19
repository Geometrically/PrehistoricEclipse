package me.geometrically.prehistoric.server.entity;

import net.minecraft.util.ResourceLocation;

public interface IGenderable {
    public ResourceLocation getDefaultTexture();

    public ResourceLocation getVariantTexture();

    public void setVariant(int variant);

    public int getVariant();
}
