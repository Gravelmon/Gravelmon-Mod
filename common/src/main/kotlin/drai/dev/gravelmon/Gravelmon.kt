package drai.dev.gravelmon

import dev.architectury.injectables.annotations.ExpectPlatform
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems

object Gravelmon {
    @JvmStatic
    fun initialize() {
        GravelmonBlocks.initialize()
        GravelmonItems.initialize()
    }

    @ExpectPlatform
    @JvmStatic
    fun registerItems() {
        throw AssertionError()
    }
}