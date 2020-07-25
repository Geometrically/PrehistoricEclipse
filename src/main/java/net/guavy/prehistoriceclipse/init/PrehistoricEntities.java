package net.guavy.prehistoriceclipse.init;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.guavy.prehistoriceclipse.client.model.AllosaurusModel;
import net.guavy.prehistoriceclipse.client.render.PrehistoricRenderer;
import net.guavy.prehistoriceclipse.entity.DinosaurEntity;
import net.guavy.prehistoriceclipse.entity.land.AllosaurusEntity;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PrehistoricEntities {

    public static List<Runnable> dinosaurs = new ArrayList<>();

    public static final EntityType<AllosaurusEntity> ALLOSAURUS = makeEntity("allosaurus", AllosaurusEntity::new, EntityCategory.AMBIENT, 1, 2, AllosaurusModel::new);
    //public static final EntityType<AustroraptorEntity> AUSTRORAPTOR = makeEntity("austroraptor", AustroraptorEntity::new, EntityCategory.AMBIENT, 1, 2, AustroraptorModel::new);

    public static <T extends DinosaurEntity> EntityType<T> makeEntity(String name, EntityType.EntityFactory<T> factory, EntityCategory category, float width, float height, Supplier<AnimatedEntityModel<T>> model) {
        EntityType<T> entityType = FabricEntityTypeBuilder.create(category, factory).size(EntityDimensions.fixed(width, height)).trackable(60, 3).build();

        dinosaurs.add(() -> {
            Registry.register(Registry.ENTITY_TYPE, new Identifier("pe", name), entityType);
            EntityRendererRegistry.INSTANCE.register(entityType, (entityRenderDispatcher, context) -> new PrehistoricRenderer<>(entityRenderDispatcher, model.get()));
            Registry.register(Registry.ITEM, new Identifier("pe", name + "_spawn_egg"), new SpawnEggItem(entityType, 0x0DA70B, 0x73420E, new Item.Settings().group(ItemGroup.MISC)));
        });


        return entityType;
    }

    public static void Register() {
        dinosaurs.forEach(Runnable::run);
    }
}
