package tfar.pamsharvestcraftximmersiveengineering;

import blusunrize.immersiveengineering.api.crafting.ClocheRecipe;
import blusunrize.immersiveengineering.api.crafting.StackWithChance;
import blusunrize.immersiveengineering.client.utils.ClocheRenderFunctions;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompatRecipes extends RecipeProvider {
    public CompatRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static final String PAM_TREES = "pamhc2trees";

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        for (Item item : BuiltInRegistries.ITEM) {
            ResourceLocation resourceLocation = BuiltInRegistries.ITEM.getKey(item);
            if (resourceLocation.getNamespace().contains("pam")) {
                if (resourceLocation.getPath().endsWith("seeds")) {
                    new ClocheRecipe(List.of(new StackWithChance(item.getDefaultInstance(),.125f)),Ingredient.of(item), Ingredient.of(Items.DIRT),200,
                            FluidIngredient.of(Fluids.WATER),new ClocheRenderFunctions.RenderFunctionCrop(Block.byItem(item)));
                }
            }
        }
    }
}
