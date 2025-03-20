package net.skyzgamezing.musicdiscmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {


    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MusicDiscMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /*tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.Block_Name.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.Block2_Name2.get());
         */
    }
}
