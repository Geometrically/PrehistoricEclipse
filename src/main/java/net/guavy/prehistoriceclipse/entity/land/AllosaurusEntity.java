package net.guavy.prehistoriceclipse.entity.land;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.entity.IAnimatedEntity;

public class AllosaurusEntity extends DinosaurEntity {
    public AllosaurusEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
