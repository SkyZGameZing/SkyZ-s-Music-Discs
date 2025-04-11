package net.skyzgamezing.musicdiscmod.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, MusicDiscMod.MOD_ID);

    //Add music disc static finals here or something like that below.

    public static final Supplier<SoundEvent> FEIN = registerSoundEvent("fein");
    public static final ResourceKey<JukeboxSong> FEIN_KEY = createSong("fein");

    public static final Supplier<SoundEvent> EVERLONG = registerSoundEvent("everlong");
    public static final ResourceKey<JukeboxSong> EVERLONG_KEY = createSong("everlong");

    public static final Supplier<SoundEvent> LIFE = registerSoundEvent("life");
    public static final ResourceKey<JukeboxSong> LIFE_KEY = createSong("life");

    //End of music disc static finals here.

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MusicDiscMod.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(MusicDiscMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
