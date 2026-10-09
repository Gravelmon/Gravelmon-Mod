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
import drai.dev.gravelsextendedbattles.ondemand.OnDemandStartup
import org.apache.logging.log4j.LogManager
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.nio.file.Files
import java.util.function.Supplier

object GravelmonMegas {
    private val LOGGER = LogManager.getLogger()
    
    var MEGA_EVOLUTIONS: MutableList<MegaEvolution> = ArrayList<MegaEvolution>()
    val MEGA_STONES_PER_POKEMON: MutableMap<PokemonProperties, MutableList<Supplier<Item>>> = HashMap()
    private val MEGA_ITEMS: MutableMap<String, Supplier<Item>> = HashMap()

    /** Where the downloaded pack keeps the mega evolutions of the Pokemon that exist (built from the site, like `sounds.json`). */
    const val PACK_FILE = "data/gravelmon/mega_evolutions.json"

    /**
     * Registers every mega stone, then reads which stones are offered. The two are separate on purpose: items cannot be registered after init and
     * must not depend on what was downloaded (client and server would disagree), so [MegaStoneNames] lists them all; the file of the pack only
     * says which of them go with which Pokemon, and lists only the megas whose Pokemon exist.
     */
    @JvmStatic
    fun init() {
        MegaStoneNames.NAMES.forEach { megaItem(it) }
        readOffered()
    }

    private fun readOffered() {
        val file = OnDemandStartup.packDir?.resolve(PACK_FILE)
        if (file == null || !Files.isRegularFile(file)) {
            // No download (offline first start, a server without a code, ...): no stone is offered.
            LOGGER.info("No mega evolutions file in the downloaded pack, so no mega stones are offered.")
            return
        }
        try {
            Files.newBufferedReader(file).use { reader ->
                val gson = Gson()
                val jsonObject = gson.fromJson(reader, com.google.gson.JsonObject::class.java)
                val megaEvolutionListType = object : TypeToken<MutableList<MegaEvolution>>() {}.type
                val megaEvolutionList: MutableList<MegaEvolution> =
                    gson.fromJson(jsonObject.get("megaEvolutions").asJsonArray, megaEvolutionListType)
                MEGA_EVOLUTIONS.addAll(megaEvolutionList)
            }
        } catch (e: Exception) {
            LOGGER.error("The mega evolutions of the downloaded pack could not be read, so no mega stones are offered.", e)
            return
        }
        MEGA_EVOLUTIONS.forEach { megaEvolution ->
            val recipient = PokemonProperties.parse(megaEvolution.recipient)
            megaEvolution.megaStones.forEach { megaStoneName ->
                val item = MEGA_ITEMS[megaStoneName]
                if (item == null) {
                    // The site names a stone this version of the mod does not have: it needs a newer mod, nothing to register now.
                    LOGGER.warn("The site offers the mega stone {}, which this version of Gravelmon does not have.", megaStoneName)
                    return@forEach
                }
                MEGA_STONES_PER_POKEMON.computeIfAbsent(recipient) { ArrayList() }.add(item)
            }
        }
    }

    private var legalCache: List<Item>? = null

    /**
     * The stones to offer: those of the pack whose Pokemon no ban-list entry removes and that still exist. Built on every call until the species have
     * loaded (the checks cannot judge before that), and kept after.
     */
    val legalMegaStones: List<Item>
        get() {
            legalCache?.let { return it }
            val stones = ArrayList(
                MEGA_STONES_PER_POKEMON.entries.stream()
                    .filter { entry -> !BanListManager.pokemonShouldBeRemoved(entry.key) }
                    .flatMap { entry -> entry.value.stream().map { it.get() } }.toList()
            )
            if (BanListManager.speciesLoaded) legalCache = stones
            return stones
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