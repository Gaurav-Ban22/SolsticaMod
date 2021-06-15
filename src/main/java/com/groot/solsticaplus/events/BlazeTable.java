package com.groot.solsticaplus.events;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BlazeTable extends BlazeEntity {

    public BlazeTable(EntityType<? extends BlazeEntity> p_i50215_1_, World p_i50215_2_) {
        super(p_i50215_1_, p_i50215_2_);
    }

    @Override
    protected ResourceLocation getLootTable() {
        return super.getLootTable();


    }
}
