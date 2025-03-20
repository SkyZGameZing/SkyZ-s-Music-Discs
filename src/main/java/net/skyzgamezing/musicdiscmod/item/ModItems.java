package net.skyzgamezing.musicdiscmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;
import net.skyzgamezing.musicdiscmod.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MusicDiscMod.MOD_ID);

    public static final DeferredItem<Item> BASIC_DISC = ITEMS.register("basic_disc",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DISC_SHARD = ITEMS.register("disc_shard",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> FEIN_MUSIC_DISC = ITEMS.register("fein_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.FEIN_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
