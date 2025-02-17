package net.hana.hanas_flora.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hana.hanas_flora.HanasFlora;
import net.hana.hanas_flora.items.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmithingTrimRecipe(exporter, ModItems.FLORA_SMITHING_TEMPLATE, Identifier.of(HanasFlora.MOD_ID, "hanas_flora"));
    }
}
