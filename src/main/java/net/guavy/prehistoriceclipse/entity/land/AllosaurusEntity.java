package net.guavy.prehistoriceclipse.entity.land;

import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class AllosaurusEntity extends DinosaurEntity {
    public AllosaurusEntity(EntityType<? extends DinosaurEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initAttributes() {
        super.initAttributes();

        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
    }

    @Override
    public String getDinosaurName() {
        return "allosaurus";
    }
}
