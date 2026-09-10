package drai.dev.gravelmon.pokeball

import com.cobblemon.mod.common.Cobblemon
import com.cobblemon.mod.common.api.Priority
import com.cobblemon.mod.common.api.events.CobblemonEvents
import com.cobblemon.mod.common.api.pokeball.PokeBalls
import com.cobblemon.mod.common.api.pokeball.catching.CaptureEffect
import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.BattleModifier
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.DynamicMultiplierModifier
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.MultiplierModifier
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.WorldStateModifier
import com.cobblemon.mod.common.api.pokemon.egg.EggGroup
import com.cobblemon.mod.common.pokeball.PokeBall
import com.cobblemon.mod.common.pokemon.Gender
import com.cobblemon.mod.common.pokemon.Pokemon
import com.cobblemon.mod.common.pokemon.status.statuses.persistent.SleepStatus
import drai.dev.gravelmon.mixin.accessors.PokeBallsAccessor
import drai.dev.gravelmon.pokeball.effects.NuzlockeCaptureEffect
import drai.dev.gravelmon.pokeball.modifier.ShinyBallBattleModifier
import net.minecraft.locale.Language
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.LivingEntity

object GravelmonPokeBalls {
    var CORAL_BALL: PokeBall
    var MAUVE_BALL: PokeBall
    var LUSTER_BALL: PokeBall
    var SUN_BALL: PokeBall
    var DAWN_BALL: PokeBall
    var FEATHER_BALL: PokeBall
    var NUCLEAR_BALL: PokeBall
    var ATOM_BALL: PokeBall
    var DELTA_BALL: PokeBall
    var ANCIENT_BALL: PokeBall
    var SHINY_BALL: PokeBall
    var NUZLOCKE_BALL: PokeBall
    var SNORE_BALL: PokeBall
    var ARK_BALL: PokeBall
    var LIME_BALL: PokeBall
    var XENO_BALL: PokeBall

    //Ancient Pokeballs
    var ANCIENT_CORAL_BALL: PokeBall
    var ANCIENT_MAUVE_BALL: PokeBall

    //Official Game Poke balls
    var TYPING_BALL: PokeBall
    var GS_BALL: PokeBall
    var GEN2_LURE_BALL: PokeBall

    //Anime Poke balls
    var ROCKET_BALL: PokeBall
    var ULTRA_ROCKET_BALL: PokeBall
    var LAKE_BALL: PokeBall
    var ANIME_SAFARI_BALL: PokeBall
    var ANNIE_BALL: PokeBall
    var OAKLEY_BALL: PokeBall
    var FISHING_BALL: PokeBall
    var ANIME_GS_BALL: PokeBall

    //Manga Poke balls
    var MANGA_SAFARI_BALL: PokeBall

    //TCG Poke balls
    var GREAT_ROCKET_BALL: PokeBall

    //LGBTQ balls
    var GAY_BALL: PokeBall
    var LESBIAN_BALL: PokeBall
    var BI_BALL: PokeBall
    var PAN_BALL: PokeBall
    var TRANS_BALL: PokeBall
    var NON_BINARY_BALL: PokeBall
    var ACE_BALL: PokeBall
    var ARO_BALL: PokeBall


    init {
        val gLModifier = BattleModifier { _, playerPokemon, pokemon ->
            var pokemonIsSameSpeciesAndSameGender = false

            for (battlePokemon in playerPokemon) {
                if (
                    battlePokemon.battlePokemon?.originalPokemon?.gender == pokemon.gender &&
                    battlePokemon.battlePokemon?.originalPokemon?.species == pokemon.species
                ) {
                    pokemonIsSameSpeciesAndSameGender = true
                    break
                }
            }

            if (pokemon.gender != Gender.GENDERLESS && pokemonIsSameSpeciesAndSameGender) {
                5F
            } else {
                1F
            }
        }

        val bModifier = BattleModifier { _, playerPokemon, pokemon ->
            for (battlePokemon in playerPokemon) {
                if (battlePokemon.battlePokemon?.originalPokemon?.species == pokemon.species) {
                    return@BattleModifier 2.5F
                }
            }

            1F
        }

        val pModifier = BattleModifier { _, playerPokemon, pokemon ->
            for (battlePokemon in playerPokemon) {
                if (battlePokemon.battlePokemon?.originalPokemon?.species != pokemon.species) {
                    return@BattleModifier 2F
                }
            }

            1F
        }

        val nBModifier = BattleModifier { _, _, pokemon ->
            if (pokemon.gender == Gender.GENDERLESS) {
                3F
            } else {
                1F
            }
        }

        val aAModifier = BattleModifier { _, _, pokemon ->
            if (
                pokemon.aspects.contains("baby") &&
                pokemon.form.eggGroups.contains(EggGroup.UNDISCOVERED)
            ) {
                2.5F
            } else {
                1F
            }
        }

        val dawnModifier = WorldStateModifier { x, _ ->
            if (x.level().gameTime > 0 && x.level().gameTime < 6000) {
                3F
            } else {
                1F
            }
        }

        val lakeModifier = WorldStateModifier { x, _ ->
            if (x.isUnderWater) {
                3F
            } else {
                1F
            }
        }

        val fishingModifier = WorldStateModifier { x, _ ->
            if (x.isUnderWater) {
                1.5F
            } else {
                1F
            }
        }

        val safariModifier = WorldStateModifier { _, entity ->
            if (!entity.isBattling) {
                1.5F
            } else {
                1F
            }
        }

        val featherModifier = DynamicMultiplierModifier(
            { _, pokemon ->
                val weight = pokemon.form.weight

                when {
                    weight < 10 -> 4F
                    weight < 50 -> 2.5F
                    weight < 100 -> 1.5F
                    else -> 1F
                }
            },
            { _, pokemon -> pokemon.form.weight < 100F }
        )

        val typingModifier = DynamicMultiplierModifier(
            { _, pokemon ->
                val nameLength = pokemon.form.name.length

                when {
                    nameLength > 10 -> 4F
                    nameLength > 8 -> 2.5F
                    nameLength > 6 -> 1.5F
                    else -> 1F
                }
            },
            { _, pokemon -> pokemon.form.name.length > 6 }
        )

        val nuclearModifier = BattleModifier { _, _, pokemon ->
            var isNuclearType = false

            for (type in pokemon.types) {
                if (type.name == "nuclear") {
                    isNuclearType = true
                    break
                }
            }

            if (isNuclearType) {
                3F
            } else {
                1F
            }
        }

        val atomModifier = BattleModifier { _, _, pokemon ->
            var isNuclearType = false

            for (type in pokemon.types) {
                if (type.name == "nuclear") {
                    isNuclearType = true
                    break
                }
            }

            if (isNuclearType) {
                5F
            } else {
                1F
            }
        }

        val sunModifier = BattleModifier { _, _, pokemon ->
            var isNuclearType = false

            for (type in pokemon.types) {
                if (
                    type.name == "fire" ||
                    type.name == "light" ||
                    type.name == "cosmic"
                ) {
                    isNuclearType = true
                    break
                }
            }

            if (isNuclearType) {
                5F
            } else {
                1F
            }
        }

        val xenoverseModifier = BattleModifier { _, _, pokemon ->
            if (pokemon.form.labels.contains("X")) {
                2F
            } else {
                1F
            }
        }

        val deltaModifier = BattleModifier { _, _, pokemon ->
            if (pokemon.form.aspects.contains("delta")) {
                4F
            } else {
                1F
            }
        }

        val ancientModifier = BattleModifier { _, _, pokemon ->
            var isLegendaryOrMythical = false

            val originalLabels = listOf("legendary", "mythical")

            for (label in pokemon.form.labels) {
                if (label in originalLabels) {
                    isLegendaryOrMythical = true
                    break
                }
            }

            if (isLegendaryOrMythical) {
                8F
            } else {
                1F
            }
        }

        val snoreModifier = BattleModifier { _, _, pokemon ->
            if (pokemon.status == null) {
                return@BattleModifier 1F
            }

            val isAsleep = pokemon.status!!.status is SleepStatus

            if (isAsleep) {
                5F
            } else {
                1F
            }
        }

        val lureModifier = BattleModifier { _, _, pokemon ->
            var isWaterType = false

            for (type in pokemon.types) {
                if (type.name == "water") {
                    isWaterType = true
                    break
                }
            }

            if (isWaterType) {
                2F
            } else {
                1F
            }
        }

        CORAL_BALL = createFromDefaults("coral_ball")
        MAUVE_BALL = createFromDefaults("mauve_ball")

        LUSTER_BALL = createFromDefaults(
            "luster_ball",
            mutableListOf(
                CaptureEffect { _, pokemon -> pokemon.shiny = true }
            )
        )

        DAWN_BALL = createFromDefaults("dawn_ball", dawnModifier)
        SUN_BALL = createFromDefaults("sun_ball", sunModifier)
        FEATHER_BALL = createFromDefaults("feather_ball", featherModifier)
        NUCLEAR_BALL = createFromDefaults("nuclear_ball", nuclearModifier)
        ATOM_BALL = createFromDefaults("atom_ball", atomModifier)
        DELTA_BALL = createFromDefaults("delta_ball", deltaModifier)
        ANCIENT_BALL = createFromDefaults("ancient_ball", ancientModifier)
        SHINY_BALL = createFromDefaults("shiny_ball", ShinyBallBattleModifier())
        NUZLOCKE_BALL = createFromDefaults("nuzlocke_ball", mutableListOf(NuzlockeCaptureEffect()))
        SNORE_BALL = createFromDefaults("snore_ball", snoreModifier)
        ARK_BALL = createFromDefaults("ark_ball", 255F)
        LIME_BALL = createFromDefaults("lime_ball", 1.5F)
        XENO_BALL = createFromDefaults("xeno_ball", xenoverseModifier)

// Ancient Pokeballs
        ANCIENT_CORAL_BALL = createFromDefaults("ancient_coral_ball")
        ANCIENT_MAUVE_BALL = createFromDefaults("ancient_mauve_ball")

// Official Game Poke balls
        TYPING_BALL = createFromDefaults("typing_ball", typingModifier)
        GS_BALL = createFromDefaults("gs_ball")
        GEN2_LURE_BALL = createFromDefaults("gen2_lure_ball", lureModifier)

// Anime Poke balls
        ROCKET_BALL = createFromDefaults("rocket_ball")
        ULTRA_ROCKET_BALL = createFromDefaults("ultra_rocket_ball", 2F)
        LAKE_BALL = createFromDefaults("lake_ball", lakeModifier)
        ANIME_SAFARI_BALL = createFromDefaults("anime_safari_ball", safariModifier)
        ANNIE_BALL = createFromDefaults("annie_ball")
        OAKLEY_BALL = createFromDefaults("oakley_ball")
        FISHING_BALL = createFromDefaults("fishing_ball", fishingModifier)
        ANIME_GS_BALL = createFromDefaults("anime_gs_ball")

// Manga Poke balls
        MANGA_SAFARI_BALL = createFromDefaults("manga_safari_ball", safariModifier)

// TCG Poke balls
        GREAT_ROCKET_BALL = createFromDefaults("great_rocket_ball", 1.5F)

// LGBTQ+ balls
        GAY_BALL = createFromDefaults("gay_ball", gLModifier)
        LESBIAN_BALL = createFromDefaults("lesbian_ball", gLModifier)
        BI_BALL = createFromDefaults("bi_ball", bModifier)
        PAN_BALL = createFromDefaults("pan_ball", pModifier)
        TRANS_BALL = createFromDefaults("trans_ball", 2F)
        NON_BINARY_BALL = createFromDefaults("non_binary_ball", nBModifier)
        ACE_BALL = createFromDefaults("ace_ball", aAModifier)
        ARO_BALL = createFromDefaults("aro_ball", aAModifier)

        CobblemonEvents.POKEMON_FAINTED.subscribe(
            Priority.HIGHEST
        ) { pokemonFaintedEvent ->
            val pokemon = pokemonFaintedEvent.pokemon

            val isNuzlockePokemon = pokemon.caughtBall.effects.any { captureEffect ->
                captureEffect is NuzlockeCaptureEffect
            }

            if (isNuzlockePokemon && pokemon.isPlayerOwned()) {
                pokemon.removeHeldItem()

                val ownerPlayer = pokemon.getOwnerPlayer() ?: return@subscribe
                val party = Cobblemon.storage.getParty(
                    ownerPlayer
                )

                party.remove(pokemon)

                val language = Language.getInstance()
                val name = pokemon.getDisplayName(true)
                val translatedName = language.getOrDefault(
                    name.toString(),
                    pokemon.species.name
                )

                ownerPlayer.sendSystemMessage(
                    Component.translatable(
                        "$translatedName has died and was removed from your party. Rest in Peace $translatedName"
                    )
                )
            }
        }
    }

    private fun createFromDefaults(name: String): PokeBall {
        return createDefault(
            name,
            MultiplierModifier(1f) { _: LivingEntity, _: Pokemon -> true },
            mutableListOf(), 0.8f, ResourceLocation.fromNamespaceAndPath("gravelmon", name),
            ResourceLocation.fromNamespaceAndPath("gravelmon", name + "_model")
        )
    }

    private fun createFromDefaults(name: String, effects: MutableList<CaptureEffect>): PokeBall {
        return createDefault(
            name,
            MultiplierModifier(1f) { _: LivingEntity, _: Pokemon -> true },
            effects, 0.8f, ResourceLocation.fromNamespaceAndPath("gravelmon", name),
            ResourceLocation.fromNamespaceAndPath("gravelmon", name + "_model")
        )
    }

    private fun createFromDefaults(name: String, multiplier: Float): PokeBall {
        return createDefault(
            name,
            MultiplierModifier(multiplier) { _: LivingEntity, _: Pokemon -> true },
            mutableListOf(), 0.8f, ResourceLocation.fromNamespaceAndPath("gravelmon", name),
            ResourceLocation.fromNamespaceAndPath("gravelmon", name + "_model")
        )
    }

    private fun createFromDefaults(name: String, multiplierModifier: CatchRateModifier): PokeBall {
        return createDefault(
            name,
            multiplierModifier,
            mutableListOf(), 0.8f, ResourceLocation.fromNamespaceAndPath("gravelmon", name),
            ResourceLocation.fromNamespaceAndPath("gravelmon", name + "_model")
        )
    }

    fun createDefault(
        name: String,
        multiplierModifier: CatchRateModifier,
        effects: MutableList<CaptureEffect>,
        waterDragValue: Float,
        model2d: ResourceLocation,
        model3d: ResourceLocation
    ): PokeBall {
        val identifier = ResourceLocation.fromNamespaceAndPath("cobblemon", name)
        val pokeball = PokeBall(
            identifier, multiplierModifier,
            effects, waterDragValue, model2d, model3d, 1f, false
        )
        PokeBallsAccessor.getDefaults()[identifier] = pokeball
        return pokeball
    }

    fun touch() {
    }
}