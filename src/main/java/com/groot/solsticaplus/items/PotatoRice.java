package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PotatoRice extends Item {

    public PotatoRice() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(3f)
                        .effect(new EffectInstance(Effects.RESISTANCE, 300, 3), 1f )
                        .effect(new EffectInstance(Effects.POISON, 300, 3), 0.2f )
                        .setAlwaysEdible()
                        .build())


        );
    }
}