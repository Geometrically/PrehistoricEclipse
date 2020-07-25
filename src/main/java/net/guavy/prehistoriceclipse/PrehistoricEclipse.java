package net.guavy.prehistoriceclipse;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.guavy.prehistoriceclipse.init.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class PrehistoricEclipse implements ModInitializer {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("pe", "general"),
            () -> new ItemStack(PrehistoricItems.DAKOTARAPTOR_SKULL));

    @Override
    public void onInitialize() {
        PrehistoricEntities.Register();
        PrehistoricItems.Register();
    }
}
