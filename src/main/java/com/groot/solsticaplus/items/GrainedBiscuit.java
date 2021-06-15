package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GrainedBiscuit extends Item {

    public GrainedBiscuit() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(5f)
                        .effect(new EffectInstance(Effects.MINING_FATIGUE, 300, 3), 1f )
                        .effect(new EffectInstance(Effects.REGENERATION, 300, 2), 1f )
                        .build())


        );
    }
}
