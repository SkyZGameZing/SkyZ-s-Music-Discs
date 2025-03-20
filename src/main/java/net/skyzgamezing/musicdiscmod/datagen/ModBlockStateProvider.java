package net.skyzgamezing.musicdiscmod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.skyzgamezing.musicdiscmod.MusicDiscMod;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MusicDiscMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //add models for blocks here
        //blockWithItem(ModBlocks.Block_Name);
    }

    /*private void blockWithItem(DeferredBlock<?> deferredBlock) {
       simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get());
    }

     */
}
