package net.skyzgamezing.musicdiscmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MusicDiscMod.MOD_ID);

    public static final Supplier<CreativeModeTab> DISC_ITEMS_TAB = CREATIVE_MODE_TAB.register("disc_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BASIC_DISC.get()))
                    .title(Component.translatable("creativetab.discmod.disc_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BASIC_DISC);
                        output.accept(ModItems.DISC_SHARD);
                    }).build());

    public static final Supplier<CreativeModeTab> DISC_SONGS_TAB = CREATIVE_MODE_TAB.register("disc_songs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DISC_SHARD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MusicDiscMod.MOD_ID, "disc_items_tab"))
                    .title(Component.translatable("creativetab.discmod.disc_songs"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FEIN_MUSIC_DISC);
                        output.accept(ModItems.EVERLONG_MUSIC_DISC);
                        output.accept(ModItems.LIFE_MUSIC_DISC);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
