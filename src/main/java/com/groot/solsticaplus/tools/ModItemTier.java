package com.groot.solsticaplus.tools;

import com.groot.solsticaplus.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    SOLSTICA(3, 500, 7.0F, 3.0F, 18, () -> {

        return Ingredient.fromItems(RegistryHandler.SOLSTICA.get());

    }),

    LIFESTEAL(3, 500, 6.0f, 3.0f, 19, () -> {
        return Ingredient.fromItems(RegistryHandler.SOLSTICA.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float attackDamage;
    private final float efficiency;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float attackDamage, float efficiency, int enchantability, Supplier<Ingredient> repairMaterial) {

        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;

    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
