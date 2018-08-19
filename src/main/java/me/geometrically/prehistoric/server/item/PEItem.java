package me.geometrically.prehistoric.server.item;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import net.minecraft.item.Item;

public class PEItem extends Item {
    public PEItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PrehistoricEclipse.creativeTab);
    }

}
