package net.skyzgamezing.musicdiscmod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;
import net.skyzgamezing.musicdiscmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MusicDiscMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BASIC_DISC.get());
        basicItem(ModItems.DISC_SHARD.get());
        basicItem(ModItems.FEIN_MUSIC_DISC.get());
        basicItem(ModItems.EVERLONG_MUSIC_DISC.get());
        basicItem(ModItems.LIFE_MUSIC_DISC.get());
        basicItem(ModItems.SEEYOUAGAIN_MUSIC_DISC.get());
        basicItem(ModItems.WHENIMGONE_MUSIC_DISC.get());
    }
}
