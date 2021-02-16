package com.groot.solsticaplus.world.biomes;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;

import static net.minecraft.world.biome.DefaultBiomeFeatures.*;

public class SolBiome extends Biome {


    public SolBiome(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.IRON_GOLEM, 21, 2, 10));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.MOOSHROOM, 13, 2, 6));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 30, 2, 12));
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.1F)));
        addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(Blocks.WATER.getDefaultState())).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.GLOWSTONE.getDefaultState(), 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.IRON_ORE.getDefaultState(), 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.GOLD_ORE.getDefaultState(), 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.REDSTONE_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16))));
    }

}
