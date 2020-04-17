package net.guavy.prehistoriceclipse.entity.land;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class AustroraptorEntity extends DinosaurEntity {

    public AustroraptorEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
