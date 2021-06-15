package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CarApple extends Item {

    public CarApple() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(7)
                        .saturation(1f)
                        .effect(new EffectInstance(Effects.SPEED, 300, 0), 1f )
                        .build())


        );
    }
}