package net.ironmouse.tutorialmod.item;

import net.ironmouse.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item>IRONMOUSERITE = ITEMS.register("ironmouserite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item>RAW_IRONMOUSERITE = ITEMS.register("raw_ironmouserite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item>HEART = ITEMS.register("heart",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
