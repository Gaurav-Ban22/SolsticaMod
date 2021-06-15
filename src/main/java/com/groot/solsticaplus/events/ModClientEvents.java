package com.groot.solsticaplus.events;

import com.groot.solsticaplus.SolsticaPlus;
import com.groot.solsticaplus.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SolsticaPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onHoldSol(PlayerInteractEvent.RightClickItem event) {

        LivingEntity player = event.getPlayer();

        if (player.getHeldItemMainhand().getItem() == RegistryHandler.SOLSTICA.get()) {

            player.addPotionEffect(new EffectInstance(Effects.GLOWING, 2*20));
            player.setFire(2);
            player.setSneaking(true);

        }

    }
    @SubscribeEvent
    public static void onHitSol(AttackEntityEvent event) {

        if (event.getEntityLiving().getHeldItemMainhand().getItem() == RegistryHandler.SOLSTICA_SWORD.get()) {

            if (event.getTarget().isAlive()) {

                LivingEntity target = (LivingEntity) event.getTarget();

                target.addPotionEffect(new EffectInstance(Effects.GLOWING, 5*20));
            }


        }



    }
    @SubscribeEvent
    public static void onHitSteal(AttackEntityEvent event) {

        if (event.getEntityLiving().getHeldItemMainhand().getItem() == RegistryHandler.LIFEBLADE.get()) {


            if (event.getTarget().isLiving()) {

                event.getEntityLiving().setHealth(event.getEntityLiving().getHealth() + 1.5f);
                event.getEntityLiving().addPotionEffect(new EffectInstance(Effects.SLOWNESS, 5*20, 0));


            }


        }



    }

    @SubscribeEvent
    public static void onWakeSol(PlayerWakeUpEvent event) {

        LivingEntity player = event.getPlayer();

        if (player.getHeldItemMainhand().getItem() == RegistryHandler.SOLSTICA.get()) {

            player.addPotionEffect(new EffectInstance(Effects.GLOWING, 2*20));
            player.setFire(10);
            player.setSneaking(true);
            player.setHealth(1.5f);

        }


    }
    @SubscribeEvent
    public static void onclickregen(PlayerInteractEvent.RightClickItem event) {
        LivingEntity player = event.getPlayer();

        if (player.getHeldItemMainhand().getItem() == RegistryHandler.REGAMU.get()) {

            ItemStack empty = event.getItemStack();

            if(empty.getCount() == 1) {
                empty = null;
            } else {
                empty.setCount(event.getItemStack().getCount() - 1);
            }
            player.setHeldItem(event.getHand(), empty);

            player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 20*20));;


        }


    }
    @SubscribeEvent
    public static void miner(PlayerInteractEvent.RightClickItem event) {
        LivingEntity player = event.getPlayer();

        if (player.getHeldItemMainhand().getItem() == RegistryHandler.MINER.get()) {

            player.getHeldItemMainhand().getStack().shrink(1);

            player.addPotionEffect(new EffectInstance(Effects.HASTE, 20*20, 3));
            player.addPotionEffect(new EffectInstance(Effects.SPEED, 20*20, 3));;
            player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 20*20, 3));;


        }


    }
    @SubscribeEvent
    public static void jumper(PlayerInteractEvent.RightClickItem event) {
        LivingEntity player = event.getPlayer();

        if (player.getHeldItemMainhand().getItem() == RegistryHandler.JSCROLL.get()) {

            player.getHeldItemMainhand().getStack().shrink(1);

            player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 20*20, 4));
            player.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 20*20, 3));;
            player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 20*20, 0));;


        }


    }
    @SubscribeEvent
    public static void repair(PlayerInteractEvent.RightClickItem event) {
        LivingEntity player = event.getPlayer();

        if (player.getHeldItemMainhand().getItem() == RegistryHandler.IREPAIR.get()) {

            player.getHeldItemMainhand().getStack().shrink(1);

            player.getHeldItemOffhand().getStack().damageItem(-20, player, (p_220045_0_) -> {
                p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);

            });


        }


    }

}

