package drai.dev.gravelmon.neoforge

import com.cobblemon.mod.common.*
import com.cobblemon.mod.common.CobblemonBlocks.DAWN_STONE_ORE
import com.cobblemon.mod.common.CobblemonBlocks.DEEPSLATE_SHINY_STONE_ORE
import com.cobblemon.mod.common.CobblemonBlocks.MOON_STONE_ORE
import com.cobblemon.mod.common.CobblemonBlocks.PINK_APRICORN
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
import com.cobblemon.mod.common.item.group.*
import drai.dev.gravelmon.*
import drai.dev.gravelmon.registries.*
import drai.dev.gravelmon.registries.GravelmonFossilItems.FOSSIL_ITEM_MAP
import drai.dev.gravelsextendedbattles.*
import net.minecraft.resources.*
import net.minecraft.world.item.*
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent
import java.util.function.*

@EventBusSubscriber(modid = Gravelmon.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
object CreativeTabsInit {
    @SubscribeEvent
    fun buildContents(event: BuildCreativeModeTabContentsEvent) {
        if (event.getTab() === CobblemonItemGroups.EVOLUTION_ITEMS) {
            //evolution stones
            event.insertAfter(
                ICE_STONE.defaultInstance,
                GravelmonItems.XENOLITH.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ICE_STONE.defaultInstance,
                GravelmonItems.SOLID_STONE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ICE_STONE.defaultInstance,
                GravelmonItems.MYSTIC_STONE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ICE_STONE.defaultInstance,
                GravelmonItems.AIR_STONE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ICE_STONE.defaultInstance,
                GravelmonItems.VARIA_STONE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ICE_STONE.defaultInstance,
                GravelmonItems.ASTRAL_STONE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            //evolution held items
            event.insertAfter(
                DUBIOUS_DISC.defaultInstance,
                GravelmonItems.WES_UPDATE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                DUBIOUS_DISC.defaultInstance,
                GravelmonItems.QUANTUM_UPGRADE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )

            /*event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.PIXIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.PATHIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.ZERIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.VERDIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.VOIDIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.AQUIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.BURIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.defaultInstance,
                    GravelmonItems.ELECTRIX.defaultInstance,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);*/
            event.insertAfter(
                CobblemonItems.GALARICA_WREATH.defaultInstance,
                GravelmonItems.SLOWPOKE_TAIL.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )

            event.insertBefore(
                METAL_COAT.defaultInstance,
                GravelmonItems.ANCIENT_GLYPH.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )

            event.insertBefore(
                PRISM_SCALE.defaultInstance,
                GravelmonItems.SILVER_SCALE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                PRISM_SCALE.defaultInstance,
                GravelmonItems.MURKY_CLAW.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.TERRESTRIAL_RING.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.XENOVERSAL_RING.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.INDUCTIVE_RING.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )

            event.accept(
                GravelmonItems.CORRUPTED_DISC.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.KALEIDOSCOPE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.DREAD_PENDANT.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.SPARE_PARTS.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.MAGIC_COOKIE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.GOLDEN_FEATHER.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.PIXIE_DUST.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.OCARINA.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.ROYAL_JELLY.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.COCONUT_MILK.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.CARROT_WINE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.URANIUM_CORE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.PREADITE.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.EMPTY_SKULL.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.FOREIGN_HAT.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.PRIM_SHEARS.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.HAIR_TONIC.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.GROWTH_MULCH.defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
        }

        if (event.getTab() === CobblemonItemGroups.BLOCKS) {
            event.insertBefore(
                DAWN_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.AIR_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                DAWN_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.DEEPSLATE_AIR_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                DAWN_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.ASTRAL_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                DAWN_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )


            event.insertBefore(
                MOON_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.MYSTIC_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                MOON_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.DEEPSLATE_MYSTIC_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )


            event.insertAfter(
                DEEPSLATE_SHINY_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.DEEPSLATE_SOLID_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                DEEPSLATE_SHINY_STONE_ORE.asItem().defaultInstance,
                GravelmonItems.SOLID_STONE_ORE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
        }

        if (event.getTab() === CobblemonItemGroups.HELD_ITEMS) {
            event.accept(
                GravelmonItems.LONG_CLUB.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.ICE_SHARD.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.PRETTY_RIBBON.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.MOSS_SHARD.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.X_RAY_SPECS.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.FOUL_ROCK.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.RAGGED_PEBBLE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.POLISHED_SPHERE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.CORRUPTED_SEED.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                FLAME_ORB.asItem().defaultInstance,
                GravelmonItems.BOLT_ORB.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                EVIOLITE.asItem().defaultInstance,
                GravelmonItems.IVEOLITE.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                HEAT_ROCK.asItem().defaultInstance,
                GravelmonItems.DARK_ROCK.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
        }

        if (event.getTab() === CobblemonItemGroups.AGRICULTURE) {
            event.insertBefore(
                PINK_APRICORN.asItem().defaultInstance,
                GravelmonItems.ORANGE_APRICORN.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                PINK_APRICORN.asItem().defaultInstance,
                GravelmonItems.PURPLE_APRICORN.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                PINK_APRICORN_SEED.asItem().defaultInstance,
                GravelmonItems.ORANGE_APRICORN_SEED.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                PINK_APRICORN_SEED.asItem().defaultInstance,
                GravelmonItems.PURPLE_APRICORN_SEED.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.HAFLI_BERRY.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
        }

        if (event.getTab() === CobblemonItemGroups.UTILITY_ITEMS) {
            event.insertAfter(
                CITRINE_BALL.asItem().defaultInstance,
                GravelmonItems.MAUVE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                CITRINE_BALL.asItem().defaultInstance,
                GravelmonItems.CORAL_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                DUSK_BALL.asItem().defaultInstance,
                GravelmonItems.DAWN_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                MOON_BALL.asItem().defaultInstance,
                GravelmonItems.SUN_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                HEAVY_BALL.asItem().defaultInstance,
                GravelmonItems.FEATHER_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                QUICK_BALL.asItem().defaultInstance,
                GravelmonItems.TYPING_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ULTRA_BALL.asItem().defaultInstance,
                GravelmonItems.ULTRA_ROCKET_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ULTRA_BALL.asItem().defaultInstance,
                GravelmonItems.GREAT_ROCKET_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ULTRA_BALL.asItem().defaultInstance,
                GravelmonItems.ROCKET_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                NET_BALL.asItem().defaultInstance,
                GravelmonItems.NUCLEAR_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                BEAST_BALL.asItem().defaultInstance,
                GravelmonItems.ATOM_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                NET_BALL.asItem().defaultInstance,
                GravelmonItems.DELTA_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                BEAST_BALL.asItem().defaultInstance,
                GravelmonItems.ANCIENT_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                QUICK_BALL.asItem().defaultInstance,
                GravelmonItems.SNORE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertBefore(
                MASTER_BALL.asItem().defaultInstance,
                GravelmonItems.SHINY_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                CHERISH_BALL.asItem().defaultInstance,
                GravelmonItems.NUZLOCKE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                CHERISH_BALL.asItem().defaultInstance,
                GravelmonItems.LUSTER_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                MASTER_BALL.asItem().defaultInstance,
                GravelmonItems.ARK_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                GREAT_BALL.asItem().defaultInstance,
                GravelmonItems.LIME_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                DIVE_BALL.asItem().defaultInstance,
                GravelmonItems.LAKE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                SAFARI_BALL.asItem().defaultInstance,
                GravelmonItems.FISHING_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                SAFARI_BALL.asItem().defaultInstance,
                GravelmonItems.ANIME_SAFARI_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                SAFARI_BALL.asItem().defaultInstance,
                GravelmonItems.MANGA_SAFARI_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ULTRA_BALL.asItem().defaultInstance,
                GravelmonItems.ANNIE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ULTRA_BALL.asItem().defaultInstance,
                GravelmonItems.OAKLEY_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                PREMIER_BALL.asItem().defaultInstance,
                GravelmonItems.GS_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                PREMIER_BALL.asItem().defaultInstance,
                GravelmonItems.ANIME_GS_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                LURE_BALL.asItem().defaultInstance,
                GravelmonItems.GEN2_LURE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                BEAST_BALL.asItem().defaultInstance,
                GravelmonItems.XENO_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.GAY_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.LESBIAN_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.BI_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.PAN_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.TRANS_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.NON_BINARY_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.ACE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.accept(
                GravelmonItems.ARO_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ANCIENT_CITRINE_BALL.asItem().defaultInstance,
                GravelmonItems.ANCIENT_CORAL_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
            event.insertAfter(
                ANCIENT_CITRINE_BALL.asItem().defaultInstance,
                GravelmonItems.ANCIENT_MAUVE_BALL.asItem().defaultInstance,
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            )
        }

        if (event.tab === CobblemonItemGroups.ARCHAEOLOGY) {
            val fossilConsumer = Consumer { fossil: ItemStack ->
                event.insertAfter(
                    FOSSILIZED_DINO.asItem().defaultInstance, fossil,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
                )
            }
            Gravelmon.getAllowedFossils().forEach { fossilConsumer.accept(it.defaultInstance) }
        }
    }
}