package com.groot.solsticaplus.util;

import com.groot.solsticaplus.SolsticaPlus;
import com.groot.solsticaplus.armor.ModArmorMaterial;
import com.groot.solsticaplus.blocks.BlockItemBase;
import com.groot.solsticaplus.blocks.Peat;
import com.groot.solsticaplus.blocks.SolBlende;
import com.groot.solsticaplus.blocks.SolBlock;
import com.groot.solsticaplus.items.*;
import com.groot.solsticaplus.tools.ModItemTier;
import com.groot.solsticaplus.world.biomes.SolBiome;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SolsticaPlus.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SolsticaPlus.MOD_ID);
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, SolsticaPlus.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    // Items
    public static final RegistryObject<Item> SOLSTICA = ITEMS.register("solstica", ItemBase::new);
    public static final RegistryObject<Item> MINER = ITEMS.register("mscroll", ItemBase::new);
    public static final RegistryObject<SolBread> SOLBREAD = ITEMS.register("solbread", SolBread::new);
    public static final RegistryObject<GrainedBiscuit> GBISCUIT = ITEMS.register("gbiscuit", GrainedBiscuit::new);
    public static final RegistryObject<EggedCookie> ECOOKIE = ITEMS.register("ecookie", EggedCookie::new);
    public static final RegistryObject<Rice> RICE = ITEMS.register("rice", Rice::new);
    public static final RegistryObject<MiracleRice> MIRRICE = ITEMS.register("mirrice", MiracleRice::new);
    public static final RegistryObject<OakRice> OAKRICE = ITEMS.register("oakrice", OakRice::new);
    public static final RegistryObject<PotatoRice> PRICE = ITEMS.register("price", PotatoRice::new);
    public static final RegistryObject<GoldenRice> GRICE = ITEMS.register("grice", GoldenRice::new);
    public static final RegistryObject<IronRice> IRICE = ITEMS.register("irice", IronRice::new);
    public static final RegistryObject<LapisRice> LRICE = ITEMS.register("lrice", LapisRice::new);
    public static final RegistryObject<CarApple> CAPPLE = ITEMS.register("capple", CarApple::new);
    public static final RegistryObject<MSponge> MSPONGE = ITEMS.register("msponge", MSponge::new);
    public static final RegistryObject<Item> REGAMU = ITEMS.register("regenam", ItemBase::new);
    public static final RegistryObject<Item> JSCROLL = ITEMS.register("jscroll", ItemBase::new);
    public static final RegistryObject<Item> EUCALYPTYDE = ITEMS.register("euc", ItemBase::new);
    public static final RegistryObject<Item> IREPAIR = ITEMS.register("irepair", ItemBase::new);


    // Blocks
    public static final RegistryObject<Block> SOLSTICA_BLOCK = BLOCKS.register("solblock", SolBlock::new );
    public static final RegistryObject<Block> SOLBLENDE = BLOCKS.register("solble", SolBlende::new );
    public static final RegistryObject<Block> PEAT = BLOCKS.register("peat", Peat::new );


    // Block Items
    public static final RegistryObject<Item> SOLSTICA_BLOCK_ITEM = ITEMS.register("solblock", () -> new BlockItemBase(SOLSTICA_BLOCK.get()));
    public static final RegistryObject<Item> SOLBLENDE_ITEM = ITEMS.register("solble", () -> new BlockItemBase(SOLBLENDE.get()));
    public static final RegistryObject<Item> PEAT_ITEM = ITEMS.register("peat", () -> new BlockItemBase(PEAT.get()));


    //tools
    public static final RegistryObject<SwordItem> SOLSTICA_SWORD = ITEMS.register("solsword", () ->
            new SwordItem(ModItemTier.SOLSTICA, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<SwordItem> LIFEBLADE = ITEMS.register("lifesword", () ->
            new SwordItem(ModItemTier.LIFESTEAL, 3, -3.5F, new Item.Properties().group(ItemGroup.COMBAT)));

    //Armor
    public static final RegistryObject<ArmorItem> SOLSTICA_HELMET = ITEMS.register("solhelm", () ->
            new ArmorItem(ModArmorMaterial.SOLSTICA, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> SOLSTICA_CHEST = ITEMS.register("solchest", () ->
            new ArmorItem(ModArmorMaterial.SOLSTICA, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> SOLSTICA_LEGS = ITEMS.register("solpant", () ->
            new ArmorItem(ModArmorMaterial.SOLSTICA, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> SOLSTICA_BOOTS = ITEMS.register("solboot", () ->
            new ArmorItem(ModArmorMaterial.SOLSTICA, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));



    //biomes
    //public static final RegistryObject<Biome> SOLBIOME = BIOMES.register("solbiome", () -> new SolBiome(new Biome.Builder().precipitation(Biome.RainType.RAIN).scale(1.2f).temperature(0.6f).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GLOWSTONE.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.SAND.getDefaultState())).category(Biome.Category.PLAINS).downfall(0.7f).depth(0.12f).parent(null)));

    //public static void registerBiomes() {
        //registerBiome(SOLBIOME.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        //BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(SOLBIOME.get(), 100));
    //}

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types ) {

        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);


    }




}
