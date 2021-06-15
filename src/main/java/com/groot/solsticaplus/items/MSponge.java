package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MSponge extends Item {

    public MSponge() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(4f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 300, 0), 1f )
                        .build())


        );
    }
}