package drai.dev.gravelmon.mega

import com.cobblemon.mod.common.api.pokemon.PokemonProperties
import com.cobblemon.mod.common.pokemon.helditem.CobblemonHeldItemManager
import com.github.yajatkaul.mega_showdown.components.MegaShowdownDataComponents
import com.github.yajatkaul.mega_showdown.creative.MegaShowdownTabs
import com.github.yajatkaul.mega_showdown.item.custom.mega.MegaStone
import com.github.yajatkaul.mega_showdown.utils.RegistryLocator
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import drai.dev.gravelmon.Gravelmon
import drai.dev.gravelmon.features.MegaEvolution
import drai.dev.gravelmon.registries.GravelmonItems
import drai.dev.gravelsextendedbattles.BanListManager
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.io.InputStreamReader
import java.util.*

object GravelmonMegas {
    
    var MEGA_EVOLUTIONS: MutableList<MegaEvolution> = ArrayList<MegaEvolution>()
    val MEGA_STONES_PER_POKEMON: MutableMap<PokemonProperties, MutableList<Item>> = HashMap()

    init {
        try {
            val inputStream =
                GravelmonMegas::class.java.classLoader.getResourceAsStream("data/gravelmon/mega_evolutions.json")
            if (inputStream != null) {
                val reader = InputStreamReader(inputStream)
                val gson = Gson()
                val megaEvolutionListType = object : TypeToken<MutableList<MegaEvolution>>() {}.type
                val megaEvolutionList: MutableList<MegaEvolution> = gson.fromJson(reader, megaEvolutionListType)
                MEGA_EVOLUTIONS.addAll(megaEvolutionList)
                reader.close()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun init() {
        MEGA_EVOLUTIONS.forEach { megaEvolution ->
            megaEvolution.megaStones.forEach { megaStoneName ->
                val item = megaItem(megaStoneName)
                MEGA_STONES_PER_POKEMON.computeIfAbsent(megaEvolution.recipient) { ArrayList<Item>() }
                    .add(item)
            }
        }
    }

    fun getLegalMegaStones(): MutableList<Item> {
        return ArrayList(MEGA_STONES_PER_POKEMON.entries.stream()
            .filter { entry -> BanListManager.pokemonShouldBeRemoved(entry.key) }
            .flatMap { entry -> entry.value.stream() }.toList())
    }


    fun megaItem(megaStoneName: String): Item {
        val item = MegaStone(
                Item.Properties()
                    .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.MEGA)
                    .component(
                        MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(),
                        ResourceLocation.fromNamespaceAndPath(Gravelmon.MOD_ID, megaStoneName)
                    )
                    .`arch$tab`(MegaShowdownTabs.MEGA_TAB)
            ).also {
            CobblemonHeldItemManager.registerRemap(it, megaStoneName.lowercase().replace("_",""))
        }
        return GravelmonItems.create(megaStoneName, item)
    }
}