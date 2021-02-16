package com.groot.solsticaplus;

import com.groot.solsticaplus.util.RegistryHandler;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("solplus")
@Mod.EventBusSubscriber(modid = "solplus", bus = Mod.EventBusSubscriber.Bus.MOD)
public class SolsticaPlus
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "solplus";

    public SolsticaPlus() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();


        MinecraftForge.EVENT_BUS.register(this);
        RegistryHandler.BIOMES.register(modEventBus);
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        RegistryHandler.registerBiomes();
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }


}
