package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EggedCookie extends Item {

    public EggedCookie() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(3f)
                        .effect(new EffectInstance(Effects.HASTE, 300, 5), 1f )
                        .build())


        );
    }
}