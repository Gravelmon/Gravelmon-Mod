package drai.dev.gravelmon.registries

import drai.dev.gravelmon.BaseCobblemonDigSites
import drai.dev.gravelmon.registries.GravelmonItems.fossilItem
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.util.function.Supplier

@Suppress("SameParameterValue", "MemberVisibilityCanBePrivate", "unused")
object GravelmonFossilItems {
    val FOSSIL_MAP: MutableMap<String, String> = HashMap()
    val FOSSIL_ITEM_MAP: MutableMap<String, Item> = HashMap()
    //Fossil Items
    //Infinity
    var TUSK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "tusk_fossil",
        "arctusk"
    )
    var HORN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "horn_fossil",
        "iceros"
    )

    //Vega
    var FANG_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "fang_fossil",
        "grindon"
    )
    var WING_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.OAK_TREE.uncommon()
        ),
        "wing_fossil",
        "ptervus"
    )
    var DARK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "dark_fossil",
        "tyranos"
    )

    //Deneb Procyon
    var SAIL_SPINE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "sail_spine_fossil",
        "sailodon"
    )
    var SCUBA_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon(),
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon()
        ),
        "scuba_fossil",
        "foreiphin"
    )

    //Lockemon
    var SEARED_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "seared_fossil",
        "feafurr"
    )
    var NOSE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "nose_fossil",
        "phisnooz"
    )
    var HELMET_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "helmet_fossil",
        "macedontus"
    )
    var FROZEN_PEAK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "frozen_peak_fossil",
        "crynorawst"
    )

    //Sage
    var DUAL_HORN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "dual_horn_fossil",
        "calphite"
    )
    var MAW_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "maw_fossil",
        "dinkywink"
    )

    //Pokemon Uranium
    var TRUNK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "trunk_fossil",
        "snopach"
    )
    var HAIR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "hair_fossil",
        "slothohm"
    )
    var GOLD_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
        ),
        "gold_fossil",
        "jungore"
    )

    //Xenoverse
    var PRINT_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "print_fossil",
        "rockapye"
    )
    var SPACE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "space_fossil",
        "sputnink"
    )

    //Atlas
    var CRUST_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon()
        ),
        "crust_fossil",
        "velosoil"
    )
    var SEED_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.OAK_TREE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "seed_fossil",
        "juraseed"
    )
    var DEVIL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon()
        ),
        "devil_fossil",
        "carnibble"
    )
    var FRILL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "frill_fossil",
        "dilophang"
    )
    var MOUNTAIN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "mountain_fossil",
        "mampth"
    )
    var SLOW_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "slow_fossil",
        "mesoth"
    )

    //Ferroa
    var SAW_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "saw_fossil",
        "snipion crozoican"
    )
    var SNOUT_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "snout_fossil",
        "enigmore"
    )
    var CAVE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "cave_fossil",
        "broogah"
    )

    //HIZA
    var TEETH_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "teeth_fossil",
        "sharkaic"
    )
    var THAGOMIZER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.POWDERED_DEPOSIT.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "thagomizer_fossil",
        "stegosear"
    )
    var WING_FINGER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon()
        ),
        "wing_finger_fossil",
        "pterai"
    )

    //Isiah
    var SMOKE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "smoke_fossil",
        "lizmoke"
    )
    var CONDUCTOR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "conductor_fossil",
        "elekto"
    )

    //Lonava
    var OAR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon()
        ),
        "oar_fossil",
        "angloch"
    )

    //mythire
    var TAR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "tar_fossil",
        "ribitar"
    )

    //Nosto
    var CHAIN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "chain_fossil",
        "seasaw"
    )

    //Oceane
    var BULB_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "bulb_fossil",
        "topsee"
    )
    var CUP_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "cup_fossil",
        "churlice"
    )
    var SWIRL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "swirl_fossil",
        "camozoic"
    )

    //Orohn Havai
    var PLATE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.OAK_TREE.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "plate_fossil",
        "stegrump"
    )
    var CUSP_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "cusp_fossil",
        "devostoric"
    )
    var BIG_TOOTH_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
        ),
        "big_tooth_fossil",
        "petirex"
    )
    var WEB_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "web_fossil",
        "arrocknid"
    )
    var MOUND_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon()
        ),
        "mound_fossil",
        "kragodon"
    )
    var LAZY_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon()
        ),
        "lazy_fossil",
        "therasloth"
    )

    //qamor
    var SABER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "saber_fossil",
        "cragato"
    )
    var CONCH_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "conch_fossil",
        "chiticonch"
    )

    //Varitas
    var DUCK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
        ),
        "duck_fossil",
        "lasaur"
    )

    //Cyare
    var THUMB_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
        ),
        "thumb_fossil",
        "tinguano"
    )

    //Dhiome
    var FERN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.OAK_TREE.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "fern_fossil",
        "petrifern"
    )

    //Enjin
    var HAMMER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "hammer_fossil",
        "pterabonk"
    )

    //Crozoic
    var LARVA_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ROOTED_PIT.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
        ),
        "larva_fossil",
        "picant"
    )
    var MEMBRANE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.OAK_TREE.uncommon(),
            BaseCobblemonDigSites.BIRCH_TREE.uncommon()
        ),
        "membrane_fossil",
        "glizyrup"
    )
    var EYE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "eye_fossil",
        "eyesi crozoican"
    )
    var CHEEK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "cheek_fossil",
        "pekohmu"
    )
    var LONG_CLAW_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "long_claw_fossil",
        "razaury"
    )
    var BRAIN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon()
        ),
        "brain_fossil",
        "brainibash"
    )
    var THORN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.LUSH_DEN.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "thorn_fossil",
        "seigoni"
    )
    var GLOVE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "glove_fossil",
        "seanodont"
    )
    var BASKET_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            ResourceLocation.fromNamespaceAndPath("cobblemon", "fossils/prehistoric_tuff_pit")
        ),
        "basket_fossil",
        "chillaxo"
    )
    var SPORE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MOSSY_POND.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "spore_fossil",
        "shroolumn"
    )
    var HOOK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon(),
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon()
        ),
        "hook_fossil",
        "fishereel"
    )
    var ANTENNA_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ENHYDRO_AGATE.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "antenna_fossil",
        "mander"
    )
    var METAL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
        ),
        "metal_fossil",
        "shredpole"
    )
    var CORD_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon()
        ),
        "cord_fossil",
        "lumarva"
    )
    var STREAMLINED_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
        ),
        "streamlined_fossil",
        "stricycle"
    )
    var EGG_BEAK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "egg_beak_fossil",
        "ovimourn"
    )
    var DRILL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
        ),
        "drill_fossil",
        "varaquake"
    )
    var SCORCHED_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
        ),
        "scorched_fossil",
        "rexinder"
    )
    var NECK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
        ),
        "neck_fossil",
        "miniclod"
    )
    var SIX_WING_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "six_wing_fossil",
        "oxygryph"
    )
    var TRACKING_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "tracking_fossil",
        "gorgonox"
    )
    var KING_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.POWDERED_DEPOSIT.uncommon()
        ),
        "king_fossil",
        "toraiking"
    )
    var QUEEN_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.POWDERED_DEPOSIT.uncommon()
        ),
        "queen_fossil",
        "toraiqueen"
    )
    var MOHAWK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ENHYDRO_AGATE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "mohawk_fossil",
        "sharpunk"
    )
    var BUCKTEETH_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "buckteeth_fossil",
        "tropichomp"
    )
    var BOXER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "boxer_fossil",
        "punshell"
    )
    var SPIKE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "spike_fossil",
        "pikoral"
    )
    var WEBBED_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            ResourceLocation.fromNamespaceAndPath("cobblemon", "fossils/prehistoric_meteorite_pond")
        ),
        "webbed_fossil",
        "hungrebe"
    )
    var CORRUPT_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "corrupt_fossil",
        "fossoul"
    )
    var NEEDLE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "needle_fossil",
        "stunge"
    )
    var LILY_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "lily_fossil",
        "clawryde"
    )
    var STRANGE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
        ),
        "strange_fossil",
        "tullabaloo"
    )
    var CONE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "cone_fossil",
        "takoyuki"
    )
    var SHOULDER_SPIKE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ENHYDRO_AGATE.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
        ),
        "shoulder_spike_fossil",
        "palagaia"
    )
    var RAMPART_FOSSIL = fossilItem(
        listOf(
            ResourceLocation.fromNamespaceAndPath("cobblemon", "fossils/prehistoric_tuff_pit"),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon()
        ),
        "rampart_fossil",
        "pachibrik"
    )
    var TOE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "toe_fossil",
        "reptor"
    )

    //Vega
    var ENIGMA_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "enigma_fossil",
        "gatiriopteryx"
    )
    var SHINY_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.OAK_TREE.uncommon()
        ),
        "shiny_fossil",
        "therapex"
    )
    var VENOM_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "venom_fossil",
        "astralaxy"
    )
    var STAG_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon()
        ),
        "stag_fossil",
        "ruminelk"
    )
    var PINKY_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "pinky_fossil",
        "petrosaur"
    )
    var CREST_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "crest_fossil",
        "spinotap"
    )
    var YITH_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon()
        ),
        "yith_fossil",
        "dregion"
    )
    var PROGENITOR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "progenitor_fossil",
        "aquapo"
    )
    var HOT_HEAD_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "hot_head_fossil",
        "tinosaur"
    )
    var ARM_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "arm_fossil",
        "twintuff"
    )
    var HELM_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
            BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon()
        ),
        "helm_fossil",
        "trilobrite"
    )
    var SWAMP_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon()
        ),
        "swamp_fossil",
        "snagmire"
    )
    var DUCK_BILL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "duck_bill_fossil",
        "paluducki"
    )
    var BILL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "bill_fossil",
        "oloraudio"
    )
    var STICK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.BIRCH_TREE.uncommon()
        ),
        "stick_fossil",
        "gustwee"
    )
    var TENGU_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.BIRCH_TREE.uncommon()
        ),
        "tengu_fossil",
        "tenkoi"
    )
    var THUNDER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon()
        ),
        "thunder_fossil",
        "elesmoduct"
    )
    var BALL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "ball_fossil",
        "battletail"
    )
    var LEAF_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "leaf_fossil",
        "ginkorale"
    )
    var FILTER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "filter_fossil",
        "dauspector"
    )
    var RADIATION_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
        ),
        "radiation_fossil",
        "chawrecks"
    )
    var CRESTED_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
        ),
        "crested_fossil",
        "pternair"
    )
    var FROZEN_BRANCH = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
        ),
        "frozen_branch",
        "branceros"
    )
    var TUSK_ICICLE = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon()
        ),
        "tusk_icicle",
        "icephan"
    )
    var TERROR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon()
        ),
        "terror_fossil",
        "tryambeak"
    )
    var BIG_BEAK_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon()
        ),
        "big_beak_fossil",
        "nodoo"
    )

    var FRUIT_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.OAK_TREE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "fruit_fossil",
        "tyrunt epochtwo"
    )
    var SABER_TOOTH_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
            BaseCobblemonDigSites.FROZEN_POND.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "saber_tooth_fossil",
        "artikit"
    )
    var RIVER_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
        ),
        "river_fossil",
        "solsaur"
    )
    var INHERITANCE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "inheritance_fossil",
        "rexite"
    )
    var PLATING_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "plating_fossil",
        "stegron"
    )
    var MORNING_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon(),
            BaseCobblemonDigSites.ERODED_PILLAR.uncommon()
        ),
        "morning_fossil",
        "ankarmor"
    )
    var IRRITATION_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
            BaseCobblemonDigSites.OAK_TREE.uncommon(),
            BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
        ),
        "irritation_fossil",
        "therospine"
    )
    var THIEF_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
        ),
        "thief_fossil",
        "rapraider"
    )

    var RAPTOR_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.POWDERED_DEPOSIT.uncommon(),
            BaseCobblemonDigSites.ROOTED_PIT.uncommon()
        ),
        "raptor_fossil",
        "gravelo"
    )

    var CLOUD_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.LUSH_DEN.uncommon()
        ),
        "cloud_fossil",
        "brachiboing"
    )
    var STAKE_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.SANDY_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
            BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
        ),
        "stake_fossil",
        "souropod"
    )
    var FESTIVAL_FOSSIL = fossilItem(
        listOf(
            BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
            BaseCobblemonDigSites.MUD_PIT.uncommon(),
            BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
        ),
        "festival_fossil",
        "wrrazal"
    )

    fun touch() {}
}