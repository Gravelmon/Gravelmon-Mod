package drai.dev.gravelmon.features

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature

object GravelmonConfiguredFeatures {
    val PURPLE_APRICORN_TREE_KEY: ResourceKey<ConfiguredFeature<*, *>?> = of("purple_apricorn_tree")
    val ORANGE_APRICORN_TREE_KEY: ResourceKey<ConfiguredFeature<*, *>?> = of("orange_apricorn_tree")
    private fun of(id: String): ResourceKey<ConfiguredFeature<*, *>?> {
        return ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath("gravelmon", id)
        )
    }
}