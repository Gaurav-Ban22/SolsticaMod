package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class OakRice extends Item {

    public OakRice() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(3f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 300, 3), 1f )
                        .effect(new EffectInstance(Effects.INSTANT_DAMAGE, 20, 3), 0.5f)
                        .setAlwaysEdible()
                        .build())


        );
    }
}