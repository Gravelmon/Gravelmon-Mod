package drai.dev.gravelmon.mega

import com.cobblemon.mod.common.api.pokemon.PokemonProperties
import com.cobblemon.mod.common.pokemon.helditem.CobblemonHeldItemManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.architectury.platform.Platform
import dev.architectury.registry.registries.DeferredRegister
import drai.dev.gravelmon.Gravelmon
import drai.dev.gravelmon.features.MegaEvolution
import drai.dev.gravelmon.msd.MegaShowdownCompat
import drai.dev.gravelmon.registries.GravelmonItems
import drai.dev.gravelsextendedbattles.BanListManager
import drai.dev.gravelsextendedbattles.gravelmonResource
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.io.InputStreamReader
import java.util.function.Supplier

object GravelmonMegas {
    
    var MEGA_EVOLUTIONS: MutableList<MegaEvolution> = ArrayList<MegaEvolution>()
    val MEGA_STONES_PER_POKEMON: MutableMap<PokemonProperties, MutableList<Supplier<Item>>> = HashMap()
    private val MEGA_ITEMS: MutableMap<String, Supplier<Item>> = HashMap()

    @JvmStatic
    fun init() {
        try {
            val inputStream = GravelmonMegas::class.java.classLoader.getResourceAsStream("data/gravelmon/mega_evolutions.json")
            if (inputStream != null) {
                val reader = InputStreamReader(inputStream)
                val gson = Gson()
                val jsonObject = gson.fromJson(reader, com.google.gson.JsonObject::class.java)
                val megaEvolutionListType = object : TypeToken<MutableList<MegaEvolution>>() {}.type
                val megaEvolutionList: MutableList<MegaEvolution> =
                    gson.fromJson(jsonObject.get("megaEvolutions").asJsonArray, megaEvolutionListType)
                MEGA_EVOLUTIONS.addAll(megaEvolutionList)
                reader.close()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        MEGA_EVOLUTIONS.forEach { megaEvolution ->
            val recipient = PokemonProperties.parse(megaEvolution.recipient)
            megaEvolution.megaStones.forEach { megaStoneName ->
                val item = megaItem(megaStoneName)
                MEGA_STONES_PER_POKEMON.computeIfAbsent(recipient) { ArrayList() }
                    .add(item)
            }
        }
    }

    val legalMegaStones by lazy {
        ArrayList(
            MEGA_STONES_PER_POKEMON.entries.stream()
            .filter { entry -> !BanListManager.pokemonShouldBeRemoved(entry.key) }
            .flatMap { entry -> entry.value.stream().map { it.get() } }.toList()
        )
    }

    val ITEMS: DeferredRegister<Item?> = DeferredRegister.create(Gravelmon.MOD_ID, Registries.ITEM)
    fun megaItem(megaStoneName: String): Supplier<Item> {
        val item = ITEMS.register(gravelmonResource(megaStoneName), Supplier {
            val properties = if (Platform.isModLoaded("mega_showdown")) {
                MegaShowdownCompat.createMegaItemProperties(megaStoneName)
            } else {
                Item.Properties()
            }
            Item(properties).also {
                CobblemonHeldItemManager.registerRemap(it, megaStoneName.lowercase().replace("_", ""))
            }
        })
        MEGA_ITEMS[megaStoneName] = item
        return item
    }

    fun register() {
        ITEMS.register()
    }
}