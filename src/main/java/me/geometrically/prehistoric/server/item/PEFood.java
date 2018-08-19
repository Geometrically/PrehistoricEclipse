package me.geometrically.prehistoric.server.item;

import me.geometrically.prehistoric.server.PrehistoricEclipse;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class PEFood extends ItemFood{

    public boolean uncooked;

    public PEFood(String name, int healAmount, boolean uncooked) {
        super(healAmount,false);

        this.uncooked = uncooked;
        if(uncooked){
            setPotionEffect(new PotionEffect(MobEffects.HUNGER, 100, 2), 0.8F);
        }
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PrehistoricEclipse.creativeTab);
    }
}
