package net.guavy.prehistoriceclipse.entity.land;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class AllosaurusEntity extends DinosaurEntity {
    public AllosaurusEntity(EntityType<? extends DinosaurEntity> type, World world) {
        super(type, world);
    }
}
