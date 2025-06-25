package net.ironmouse.tutorialmod.block;

import com.google.common.eventbus.EventBus;
import net.ironmouse.tutorialmod.TutorialMod;
import net.ironmouse.tutorialmod.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Modblocks {
    public static final DeferredRegister<Block> BlOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    //u cant mine your block yet
    public static final RegistryObject<Block> IRONMOUSE_BLOCK = registerBlock("ironmouse_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block>AlEX_BLOCK = registerBlock("alex_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block){
        RegistryObject<T> toReturn = BlOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;

    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T>block){
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BlOCKS.register(eventBus);
    }

}
