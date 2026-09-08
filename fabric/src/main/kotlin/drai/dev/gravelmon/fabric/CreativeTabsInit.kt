package drai.dev.gravelmon.fabric

import com.cobblemon.mod.common.*
import com.cobblemon.mod.common.CobblemonBlocks.DAWN_STONE_BLOCK
import com.cobblemon.mod.common.CobblemonBlocks.DAWN_STONE_ORE
import com.cobblemon.mod.common.CobblemonBlocks.DEEPSLATE_SHINY_STONE_ORE
import com.cobblemon.mod.common.CobblemonBlocks.ICE_STONE_BLOCK
import com.cobblemon.mod.common.CobblemonBlocks.MOON_STONE_BLOCK
import com.cobblemon.mod.common.CobblemonBlocks.MOON_STONE_ORE
import com.cobblemon.mod.common.CobblemonBlocks.PINK_APRICORN
import com.cobblemon.mod.common.CobblemonBlocks.SHINY_STONE_BLOCK
import com.cobblemon.mod.common.CobblemonItems.ANCIENT_CITRINE_BALL
import com.cobblemon.mod.common.CobblemonItems.BEAST_BALL
import com.cobblemon.mod.common.CobblemonItems.CHERISH_BALL
import com.cobblemon.mod.common.CobblemonItems.CITRINE_BALL
import com.cobblemon.mod.common.CobblemonItems.DIVE_BALL
import com.cobblemon.mod.common.CobblemonItems.DUBIOUS_DISC
import com.cobblemon.mod.common.CobblemonItems.DUSK_BALL
import com.cobblemon.mod.common.CobblemonItems.EVIOLITE
import com.cobblemon.mod.common.CobblemonItems.FLAME_ORB
import com.cobblemon.mod.common.CobblemonItems.FOSSILIZED_DINO
import com.cobblemon.mod.common.CobblemonItems.GREAT_BALL
import com.cobblemon.mod.common.CobblemonItems.HEAT_ROCK
import com.cobblemon.mod.common.CobblemonItems.HEAVY_BALL
import com.cobblemon.mod.common.CobblemonItems.ICE_STONE
import com.cobblemon.mod.common.CobblemonItems.LURE_BALL
import com.cobblemon.mod.common.CobblemonItems.MASTER_BALL
import com.cobblemon.mod.common.CobblemonItems.METAL_COAT
import com.cobblemon.mod.common.CobblemonItems.MOON_BALL
import com.cobblemon.mod.common.CobblemonItems.NET_BALL
import com.cobblemon.mod.common.CobblemonItems.PINK_APRICORN_SEED
import com.cobblemon.mod.common.CobblemonItems.PREMIER_BALL
import com.cobblemon.mod.common.CobblemonItems.PRISM_SCALE
import com.cobblemon.mod.common.CobblemonItems.QUICK_BALL
import com.cobblemon.mod.common.CobblemonItems.SAFARI_BALL
import com.cobblemon.mod.common.CobblemonItems.ULTRA_BALL
import com.cobblemon.mod.common.api.fossil.*
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies
import com.cobblemon.mod.common.item.group.*
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.AGRICULTURE_KEY
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.ARCHAEOLOGY_KEY
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.BLOCKS_KEY
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.EVOLUTION_ITEMS_KEY
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.HELD_ITEMS_KEY
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.UTILITY_ITEMS_KEY
import drai.dev.gravelmon.*
import drai.dev.gravelmon.registries.*
import drai.dev.gravelsextendedbattles.*
import net.fabricmc.fabric.api.itemgroup.v1.*
import net.minecraft.resources.*
import net.minecraft.world.item.*

import java.util.function.*

import drai.dev.gravelmon.registries.GravelmonFossilItems.FOSSIL_ITEM_MAP
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.modifyEntriesEvent

object CreativeTabsInit {
    fun initCreativeTabs() {
        modifyEntriesEvent(EVOLUTION_ITEMS_KEY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                //evolution stones
                entries.addAfter(
                    ICE_STONE.defaultInstance,
                    GravelmonItems.XENOLITH.defaultInstance
                )
                entries.addAfter(
                    ICE_STONE.defaultInstance,
                    GravelmonItems.SOLID_STONE.defaultInstance
                )
                entries.addAfter(
                    ICE_STONE.defaultInstance,
                    GravelmonItems.MYSTIC_STONE.defaultInstance
                )
                entries.addAfter(
                    ICE_STONE.defaultInstance,
                    GravelmonItems.AIR_STONE.defaultInstance
                )
                entries.addAfter(
                    ICE_STONE.defaultInstance,
                    GravelmonItems.VARIA_STONE.defaultInstance
                )
                entries.addAfter(
                    ICE_STONE.defaultInstance,
                    GravelmonItems.ASTRAL_STONE.defaultInstance
                )

                //evolution held items
                entries.addAfter(
                    DUBIOUS_DISC.defaultInstance,
                    GravelmonItems.WES_UPDATE.defaultInstance
                )
                entries.addAfter(
                    DUBIOUS_DISC.defaultInstance,
                    GravelmonItems.QUANTUM_UPGRADE.defaultInstance
                )

                /*entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.PIXIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.PATHIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.ZERIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.VERDIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.VOIDIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.AQUIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.BURIX.defaultInstance);
            entries.addAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.ELECTRIX.defaultInstance);*/
                entries.addAfter(
                    CobblemonItems.GALARICA_WREATH.defaultInstance,
                    GravelmonItems.SLOWPOKE_TAIL.defaultInstance
                )

                entries.addBefore(
                    METAL_COAT.defaultInstance,
                    GravelmonItems.ANCIENT_GLYPH.defaultInstance
                )

                entries.addBefore(
                    PRISM_SCALE.defaultInstance,
                    GravelmonItems.SILVER_SCALE.defaultInstance
                )
                entries.addBefore(
                    PRISM_SCALE.defaultInstance,
                    GravelmonItems.MURKY_CLAW.defaultInstance
                )

                entries.accept(GravelmonItems.CORRUPTED_DISC.defaultInstance)
                entries.accept(GravelmonItems.KALEIDOSCOPE.defaultInstance)
                entries.accept(GravelmonItems.DREAD_PENDANT.defaultInstance)
                entries.accept(GravelmonItems.SPARE_PARTS.defaultInstance)
                entries.accept(GravelmonItems.MAGIC_COOKIE.defaultInstance)
                entries.accept(GravelmonItems.TERRESTRIAL_RING.asItem().defaultInstance)
                entries.accept(GravelmonItems.XENOVERSAL_RING.asItem().defaultInstance)
                entries.accept(GravelmonItems.INDUCTIVE_RING.asItem().defaultInstance)

                entries.accept(GravelmonItems.GOLDEN_FEATHER.defaultInstance)
                entries.accept(GravelmonItems.PIXIE_DUST.defaultInstance)
                entries.accept(GravelmonItems.OCARINA.defaultInstance)
                entries.accept(GravelmonItems.ROYAL_JELLY.defaultInstance)
                entries.accept(GravelmonItems.COCONUT_MILK.defaultInstance)
                entries.accept(GravelmonItems.CARROT_WINE.defaultInstance)
                entries.accept(GravelmonItems.URANIUM_CORE.defaultInstance)
                entries.accept(GravelmonItems.PREADITE.defaultInstance)
                entries.accept(GravelmonItems.EMPTY_SKULL.defaultInstance)
                entries.accept(GravelmonItems.FOREIGN_HAT.defaultInstance)
                entries.accept(GravelmonItems.PRIM_SHEARS.defaultInstance)
                entries.accept(GravelmonItems.HAIR_TONIC.defaultInstance)
                entries.accept(GravelmonItems.GROWTH_MULCH.defaultInstance)
            })

        modifyEntriesEvent(BLOCKS_KEY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.addBefore(
                    DAWN_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.AIR_STONE_ORE.asItem().defaultInstance
                )
                entries.addBefore(
                    DAWN_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.DEEPSLATE_AIR_STONE_ORE.asItem().defaultInstance
                )
                entries.addBefore(
                    DAWN_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.ASTRAL_STONE_ORE.asItem().defaultInstance
                )
                entries.addBefore(
                    DAWN_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.asItem().defaultInstance
                )
                entries.addBefore(
                    DAWN_STONE_BLOCK.asItem().defaultInstance,
                    GravelmonItems.AIR_STONE_BLOCK.asItem().defaultInstance
                )
                entries.addBefore(
                    DAWN_STONE_BLOCK.asItem().defaultInstance,
                    GravelmonItems.ASTRAL_STONE_BLOCK.asItem().defaultInstance
                )

                entries.addBefore(
                    MOON_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.MYSTIC_STONE_ORE.asItem().defaultInstance
                )
                entries.addBefore(
                    MOON_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.DEEPSLATE_MYSTIC_STONE_ORE.asItem().defaultInstance
                )
                entries.addAfter(
                    MOON_STONE_BLOCK.asItem().defaultInstance,
                    GravelmonItems.MYSTIC_STONE_BLOCK.asItem().defaultInstance
                )

                entries.addAfter(
                    DEEPSLATE_SHINY_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.DEEPSLATE_SOLID_STONE_ORE.asItem().defaultInstance
                )
                entries.addAfter(
                    DEEPSLATE_SHINY_STONE_ORE.asItem().defaultInstance,
                    GravelmonItems.SOLID_STONE_ORE.asItem().defaultInstance
                )
                entries.addAfter(
                    SHINY_STONE_BLOCK.asItem().defaultInstance,
                    GravelmonItems.SOLID_STONE_BLOCK.asItem().defaultInstance
                )
                entries.addAfter(
                    ICE_STONE_BLOCK.asItem().defaultInstance,
                    GravelmonItems.VARIA_STONE_BLOCK.asItem().defaultInstance
                )
            })

        modifyEntriesEvent(HELD_ITEMS_KEY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.accept(GravelmonItems.LONG_CLUB.asItem().defaultInstance)
                entries.accept(GravelmonItems.ICE_SHARD.asItem().defaultInstance)
                entries.accept(GravelmonItems.PRETTY_RIBBON.asItem().defaultInstance)
                entries.accept(GravelmonItems.MOSS_SHARD.asItem().defaultInstance)
                entries.accept(GravelmonItems.X_RAY_SPECS.asItem().defaultInstance)
                entries.accept(GravelmonItems.FOUL_ROCK.asItem().defaultInstance)
                entries.accept(GravelmonItems.RAGGED_PEBBLE.asItem().defaultInstance)
                entries.accept(GravelmonItems.POLISHED_SPHERE.asItem().defaultInstance)
                entries.accept(GravelmonItems.CORRUPTED_SEED.asItem().defaultInstance)
                entries.addAfter(
                    FLAME_ORB.asItem().defaultInstance,
                    GravelmonItems.BOLT_ORB.asItem().defaultInstance
                )
                entries.addAfter(
                    EVIOLITE.asItem().defaultInstance,
                    GravelmonItems.IVEOLITE.asItem().defaultInstance
                )
                entries.addBefore(
                    HEAT_ROCK.asItem().defaultInstance,
                    GravelmonItems.DARK_ROCK.asItem().defaultInstance
                )
            })

        modifyEntriesEvent(AGRICULTURE_KEY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.addBefore(
                    PINK_APRICORN.asItem().defaultInstance,
                    GravelmonItems.ORANGE_APRICORN.asItem().defaultInstance
                )
                entries.addAfter(
                    PINK_APRICORN.asItem().defaultInstance,
                    GravelmonItems.PURPLE_APRICORN.asItem().defaultInstance
                )

                entries.addBefore(
                    PINK_APRICORN_SEED.asItem().defaultInstance,
                    GravelmonItems.ORANGE_APRICORN_SEED.asItem().defaultInstance
                )
                entries.addAfter(
                    PINK_APRICORN_SEED.asItem().defaultInstance,
                    GravelmonItems.PURPLE_APRICORN_SEED.asItem().defaultInstance
                )
                entries.accept(GravelmonItems.HAFLI_BERRY.asItem().defaultInstance)
            })

        modifyEntriesEvent(UTILITY_ITEMS_KEY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                entries.addAfter(
                    CITRINE_BALL.asItem().defaultInstance,
                    GravelmonItems.MAUVE_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    CITRINE_BALL.asItem().defaultInstance,
                    GravelmonItems.CORAL_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ANCIENT_CITRINE_BALL.asItem().defaultInstance,
                    GravelmonItems.ANCIENT_CORAL_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ANCIENT_CITRINE_BALL.asItem().defaultInstance,
                    GravelmonItems.ANCIENT_MAUVE_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    DUSK_BALL.asItem().defaultInstance,
                    GravelmonItems.DAWN_BALL.asItem().defaultInstance
                )
                entries.addBefore(
                    MOON_BALL.asItem().defaultInstance,
                    GravelmonItems.SUN_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    HEAVY_BALL.asItem().defaultInstance,
                    GravelmonItems.FEATHER_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    QUICK_BALL.asItem().defaultInstance,
                    GravelmonItems.TYPING_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ULTRA_BALL.asItem().defaultInstance,
                    GravelmonItems.ULTRA_ROCKET_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ULTRA_BALL.asItem().defaultInstance,
                    GravelmonItems.GREAT_ROCKET_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ULTRA_BALL.asItem().defaultInstance,
                    GravelmonItems.ROCKET_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    NET_BALL.asItem().defaultInstance,
                    GravelmonItems.NUCLEAR_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    BEAST_BALL.asItem().defaultInstance,
                    GravelmonItems.ATOM_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    NET_BALL.asItem().defaultInstance,
                    GravelmonItems.DELTA_BALL.asItem().defaultInstance
                )
                entries.addBefore(
                    BEAST_BALL.asItem().defaultInstance,
                    GravelmonItems.ANCIENT_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    QUICK_BALL.asItem().defaultInstance,
                    GravelmonItems.SNORE_BALL.asItem().defaultInstance
                )
                entries.addBefore(
                    MASTER_BALL.asItem().defaultInstance,
                    GravelmonItems.SHINY_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    CHERISH_BALL.asItem().defaultInstance,
                    GravelmonItems.NUZLOCKE_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    CHERISH_BALL.asItem().defaultInstance,
                    GravelmonItems.LUSTER_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    MASTER_BALL.asItem().defaultInstance,
                    GravelmonItems.ARK_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    GREAT_BALL.asItem().defaultInstance,
                    GravelmonItems.LIME_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    DIVE_BALL.asItem().defaultInstance,
                    GravelmonItems.LAKE_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    SAFARI_BALL.asItem().defaultInstance,
                    GravelmonItems.FISHING_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    SAFARI_BALL.asItem().defaultInstance,
                    GravelmonItems.ANIME_SAFARI_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    SAFARI_BALL.asItem().defaultInstance,
                    GravelmonItems.MANGA_SAFARI_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ULTRA_BALL.asItem().defaultInstance,
                    GravelmonItems.ANNIE_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    ULTRA_BALL.asItem().defaultInstance,
                    GravelmonItems.OAKLEY_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    PREMIER_BALL.asItem().defaultInstance,
                    GravelmonItems.GS_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    PREMIER_BALL.asItem().defaultInstance,
                    GravelmonItems.ANIME_GS_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    LURE_BALL.asItem().defaultInstance,
                    GravelmonItems.GEN2_LURE_BALL.asItem().defaultInstance
                )
                entries.addAfter(
                    BEAST_BALL.asItem().defaultInstance,
                    GravelmonItems.XENO_BALL.asItem().defaultInstance
                )
                entries.accept(GravelmonItems.GAY_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.LESBIAN_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.BI_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.PAN_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.TRANS_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.NON_BINARY_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.ACE_BALL.asItem().defaultInstance)
                entries.accept(GravelmonItems.ARO_BALL.asItem().defaultInstance)
            })


        modifyEntriesEvent(ARCHAEOLOGY_KEY)
            .register(ItemGroupEvents.ModifyEntries { entries: FabricItemGroupEntries ->
                val fossilConsumer = Consumer { fossil: ItemStack? -> entries.addAfter(FOSSILIZED_DINO, fossil) }
                GravelmonFossilItems.FOSSIL_MAP.forEach { (key, value) ->
                    val fossil = Fossils.getByIdentifier(ResourceLocation.fromNamespaceAndPath("cobblemon", value.split(" ")[0]))
                    if (fossil == null) return@forEach
                    if (BanListManager.pokemonShouldBeRemoved(fossil.result)) return@forEach
                    fossilConsumer.accept(FOSSIL_ITEM_MAP[key]?.defaultInstance)
                }
            })
    }
}