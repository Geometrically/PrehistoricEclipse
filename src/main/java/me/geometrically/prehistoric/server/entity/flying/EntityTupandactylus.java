package me.geometrically.prehistoric.server.entity.flying;

import me.geometrically.prehistoric.server.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityTupandactylus extends EntityAir {
    public EntityTupandactylus(World world) {
        super(world);
        this.setSize(1.2F, 1.2F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
    }

    @Override
    public ResourceLocation getDefaultTexture() {
        return new ResourceLocation(Reference.MOD_ID + ":models/entity/tupan/male.png");
    }
}
