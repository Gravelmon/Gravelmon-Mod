package drai.dev.gravelmon.msd

import com.github.yajatkaul.mega_showdown.item.MegaShowdownItems
import drai.dev.gravelmon.mega.GravelmonMegas
import drai.dev.gravelmon.utils.getCleanName
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeHolder
import net.minecraft.world.item.crafting.StonecutterRecipe
import java.util.*

object MegaShowdownCompat {
    fun getMegaStoneRecipes(): List<RecipeHolder<*>> {
        val input: Ingredient = Ingredient.of(MegaShowdownItems.MEGA_STONE.get())
        val newRecipes: MutableList<RecipeHolder<*>> = mutableListOf()
        GravelmonMegas.getLegalMegaStones().forEach { entry ->
            val result = BuiltInRegistries.ITEM.getKey(entry).path.lowercase(Locale.getDefault())
            val recipeId = ResourceLocation.fromNamespaceAndPath(
                "gravelmon",
                "stonecutter_megastone_$result"
            )
            if (newRecipes.stream().anyMatch { holder: RecipeHolder<*>? -> holder!!.id() == recipeId }) {
                val output = ItemStack(entry, 1)
                val recipe = StonecutterRecipe(
                    recipeId.toString(),
                    input,
                    output
                )
                val holder: RecipeHolder<*> = RecipeHolder(recipeId, recipe)
                newRecipes.add(holder)
            }
        }

        return newRecipes
    }

}