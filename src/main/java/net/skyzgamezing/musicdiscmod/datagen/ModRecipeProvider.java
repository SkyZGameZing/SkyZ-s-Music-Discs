package net.skyzgamezing.musicdiscmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.skyzgamezing.musicdiscmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BASIC_DISC.get())
                .pattern("DDD")
                .pattern("D D")
                .pattern("DDD")
                .define('D', ModItems.DISC_SHARD.get())
                .unlockedBy("has_disc_shard", has(ModItems.DISC_SHARD)).save(recipeOutput);



    }
}
