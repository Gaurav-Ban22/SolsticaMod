package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GoldenRice extends Item {

    public GoldenRice() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(3f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 300, 3), 1f )
                        .setAlwaysEdible()
                        .build())


        );
    }
}