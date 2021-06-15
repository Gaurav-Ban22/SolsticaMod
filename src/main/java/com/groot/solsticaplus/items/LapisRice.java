package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class LapisRice extends Item {

    public LapisRice() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(3f)
                        .effect(new EffectInstance(Effects.SLOW_FALLING, 300, 3), 1f )
                        .setAlwaysEdible()
                        .build())


        );
    }
}