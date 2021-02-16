package com.groot.solsticaplus.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SolBread extends Item {


    public SolBread() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()

                        .hunger(6)
                        .saturation(1.4f)
                        .effect(new EffectInstance(Effects.NIGHT_VISION, 400, 1), 1f)
                        .effect(new EffectInstance(Effects.GLOWING, 400, 1), 1f)
                        .fastToEat()
                        .setAlwaysEdible()
                        .build())



        );
    }
}
