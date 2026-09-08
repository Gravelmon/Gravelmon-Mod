package drai.dev.gravelmon.neoforge

import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import net.minecraft.core.Registry

object GravelmonImpl {
    @JvmStatic
    fun registerItems() {
        GravelmonBlocks.register { identifier, item -> Registry.register(GravelmonBlocks.registry, identifier, item) }
        GravelmonItems.register { identifier, item -> Registry.register(GravelmonItems.registry, identifier, item) }
    }
}