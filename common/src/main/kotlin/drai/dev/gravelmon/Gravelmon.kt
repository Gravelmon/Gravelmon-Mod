package drai.dev.gravelmon

import com.cobblemon.mod.common.ResourcePackActivationBehaviour
import com.cobblemon.mod.common.api.pokemon.PokemonProperties
import com.cobblemon.mod.common.client.CobblemonPack
import dev.architectury.injectables.annotations.ExpectPlatform
import drai.dev.gravelmon.pokeball.GravelmonPokeBalls
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonFossilItems
import drai.dev.gravelmon.registries.GravelmonItems
import drai.dev.gravelsextendedbattles.BanListManager
import net.minecraft.server.packs.PackType
import net.minecraft.world.item.Item

object Gravelmon {
    const val MOD_ID = "gravelmon"

    @JvmStatic
    fun initialize() {
        GravelmonPokeBalls.touch()
        GravelmonBlocks.touch()
        GravelmonItems.touch()
        registerItems()
        platformInit()
    }

    @ExpectPlatform
    @JvmStatic
    fun registerItems() {
        throw AssertionError()
    }

    @ExpectPlatform
    @JvmStatic
    fun platformInit() {
        throw AssertionError()
    }

    @JvmStatic
    fun getAllowedFossils(): MutableList<Item> {
        val allowedFossils = mutableListOf<Item>()
        GravelmonFossilItems.FOSSIL_ITEM_MAP.forEach { (itemName, item) ->
            val species = GravelmonFossilItems.FOSSIL_MAP[itemName] ?: return@forEach
            if (!BanListManager.pokemonShouldBeRemoved(PokemonProperties.parse(species))) {
                allowedFossils.add(item)
            }
        }
        return allowedFossils
    }

    @JvmStatic
    val builtinPacks = listOf(
        CobblemonPack(id = "fakemonstarters", name = "Gravelmon Starters", packType = PackType.SERVER_DATA, activationBehaviour = ResourcePackActivationBehaviour.DEFAULT_ENABLED),
        CobblemonPack(id = "botanypotsCompat", name = "Gravelmon BotanyPots Compatibility", packType = PackType.SERVER_DATA, activationBehaviour = ResourcePackActivationBehaviour.DEFAULT_ENABLED, neededMods = setOf("botany_pots")),
        CobblemonPack(id = "immersiveengineering", name = "Gravelmon Immersive Engineering Compatibility", packType = PackType.SERVER_DATA, activationBehaviour = ResourcePackActivationBehaviour.DEFAULT_ENABLED, neededMods = setOf("immersive_engineering")),
    )
}