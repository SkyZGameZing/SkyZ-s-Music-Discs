package net.skyzgamezing.musicdiscmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MusicDiscMod.MOD_ID);

    public static final DeferredItem<Item> BASIC_DISC = ITEMS.register("basic_disc",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DISC_SHARD = ITEMS.register("disc_shard",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
