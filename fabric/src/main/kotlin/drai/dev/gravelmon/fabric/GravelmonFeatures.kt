package drai.dev.gravelmon.fabric

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.levelgen.GenerationStep
import net.minecraft.world.level.levelgen.placement.PlacedFeature

object GravelmonFeatures {
    val ASTRAL_ORE_PLACED_KEY: ResourceKey<PlacedFeature?> = ResourceKey.create(
        Registries.PLACED_FEATURE,
        ResourceLocation.fromNamespaceAndPath("gravelmon", "overworld_astral_ore")
    )
    val AIR_ORE_PLACED_KEY: ResourceKey<PlacedFeature?> = ResourceKey.create(
        Registries.PLACED_FEATURE,
        ResourceLocation.fromNamespaceAndPath("gravelmon", "overworld_air_ore")
    )
    val MYSTIC_ORE_PLACED_KEY: ResourceKey<PlacedFeature?> = ResourceKey.create(
        Registries.PLACED_FEATURE,
        ResourceLocation.fromNamespaceAndPath("gravelmon", "overworld_mystic_ore")
    )
    val SOLID_ORE_PLACED_KEY: ResourceKey<PlacedFeature?> = ResourceKey.create(
        Registries.PLACED_FEATURE,
        ResourceLocation.fromNamespaceAndPath("gravelmon", "overworld_solid_ore")
    )

    fun registerFeatures() {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            ASTRAL_ORE_PLACED_KEY
        )
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            AIR_ORE_PLACED_KEY
        )
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            MYSTIC_ORE_PLACED_KEY
        )
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            SOLID_ORE_PLACED_KEY
        )
    }
}