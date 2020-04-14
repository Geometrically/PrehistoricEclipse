package net.guavy.prehistoriceclipse.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class DinosaurEntity extends MobEntity {
    protected DinosaurEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
