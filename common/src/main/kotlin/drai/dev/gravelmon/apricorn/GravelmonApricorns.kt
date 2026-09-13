package drai.dev.gravelmon.apricorn

import com.mojang.serialization.Codec
import drai.dev.gravelmon.features.GravelmonConfiguredFeatures
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import net.minecraft.resources.ResourceKey
import net.minecraft.util.StringRepresentable
import net.minecraft.world.level.ItemLike
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature
import net.minecraft.world.level.material.MapColor
import java.util.*
import java.util.function.Supplier

enum class GravelmonApricorns : StringRepresentable {
    ORANGE,
    PURPLE;


    val item: ItemLike
        get() = when (this) {
            ORANGE -> GravelmonItems.ORANGE_APRICORN
            PURPLE -> GravelmonItems.PURPLE_APRICORN
        }

    val configuredFeature: ResourceKey<ConfiguredFeature<*, *>?>
        get() = when (this) {
            PURPLE -> GravelmonConfiguredFeatures.PURPLE_APRICORN_TREE_KEY
            ORANGE -> GravelmonConfiguredFeatures.ORANGE_APRICORN_TREE_KEY
        }

    val mapColor: MapColor
        get() = when (this) {
            ORANGE -> MapColor.COLOR_ORANGE
            PURPLE -> MapColor.COLOR_PURPLE
        }

    val block: Block
        get() = when (this) {
            ORANGE -> GravelmonBlocks.ORANGE_APRICORN
            PURPLE -> GravelmonBlocks.PURPLE_APRICORN
        }

    val sapling: Block
        get() = when (this) {
            ORANGE -> GravelmonBlocks.ORANGE_APRICORN_SAPLING
            PURPLE -> GravelmonBlocks.PURPLE_APRICORN_SAPLING
        }

    override fun getSerializedName(): String {
        return this.name.lowercase(Locale.getDefault())
    }

    companion object {
        var CODEC: Codec<GravelmonApricorns?> =
            StringRepresentable.fromValues<GravelmonApricorns?>(Supplier { entries.toTypedArray() })
    }
}