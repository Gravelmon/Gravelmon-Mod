package drai.dev.gravelmon.msd

import com.github.yajatkaul.mega_showdown.components.MegaShowdownDataComponents
import com.github.yajatkaul.mega_showdown.creative.MegaShowdownTabs
import com.github.yajatkaul.mega_showdown.item.MegaShowdownItems
import com.github.yajatkaul.mega_showdown.utils.RegistryLocator
import drai.dev.gravelmon.Gravelmon
import drai.dev.gravelmon.mega.GravelmonMegas
import drai.dev.gravelmon.mixin.accessors.ItemAccessor
import drai.dev.gravelmon.utils.getCleanName
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeHolder
import net.minecraft.world.item.crafting.StonecutterRecipe
import java.util.*

object MegaShowdownCompat {
    fun createMegaItemProperties(megaStoneName: String): Item.Properties {
        return Item.Properties()
            .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.MEGA)
            .component(
                MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(),
                ResourceLocation.fromNamespaceAndPath(Gravelmon.MOD_ID, megaStoneName)
            )
            .`arch$tab`(MegaShowdownTabs.MEGA_TAB)
    }

    fun getMegaStoneRecipes(): List<RecipeHolder<*>> {
        val input: Ingredient = Ingredient.of(MegaShowdownItems.MEGA_STONE.get())
        val newRecipes: MutableList<RecipeHolder<*>> = mutableListOf()
        val legalMegaStones = GravelmonMegas.legalMegaStones
        legalMegaStones.forEach { entry ->
            val result = BuiltInRegistries.ITEM.getKey(entry).path.lowercase(Locale.getDefault())
            val recipeId = ResourceLocation.fromNamespaceAndPath(
                "gravelmon",
                "stonecutter_megastone_$result"
            )
                val output = ItemStack(entry, 1)//todo move this
//            (entry as Any as ItemAccessor).components.
//            output.set(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.MEGA)
//            output.set(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(
//                Gravelmon.MOD_ID, result.lowercase().replace("_", "")))
                val recipe = StonecutterRecipe(
                    recipeId.toString(),
                    input,
                    output
                )
                val holder: RecipeHolder<*> = RecipeHolder(recipeId, recipe)
                newRecipes.add(holder)
        }

        return newRecipes
    }

}