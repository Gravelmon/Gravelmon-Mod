package drai.dev.gravelmon.neoforge

import drai.dev.gravelmon.msd.MegaShowdownCompat
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import net.minecraft.core.Registry
import net.minecraft.server.MinecraftServer
import net.minecraft.server.packs.resources.ResourceManager
import net.minecraft.server.packs.resources.SimplePreparableReloadListener
import net.minecraft.util.profiling.ProfilerFiller
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.ModList
import net.neoforged.neoforge.common.NeoForge
import net.neoforged.neoforge.event.AddReloadListenerEvent
import net.neoforged.neoforge.event.server.ServerStartedEvent
import net.neoforged.neoforge.server.ServerLifecycleHooks

object GravelmonImpl {
    @JvmStatic
    fun platformInit() {
        NeoForge.EVENT_BUS.addListener { event: ServerStartedEvent -> onServerStarted(event) }
        NeoForge.EVENT_BUS.addListener { event: AddReloadListenerEvent -> registerMegaStoneRecipes(event) }
    }

    private var cachedServer: MinecraftServer? = null

    @SubscribeEvent
    fun onServerStarted(event: ServerStartedEvent) {
        cachedServer = event.getServer()
        addMegaStoneRecipes(cachedServer!!)
    }

    private fun registerMegaStoneRecipes(event: AddReloadListenerEvent) {
        if (!ModList.get().isLoaded("mega_showdown")) return

        event.addListener(object : SimplePreparableReloadListener<Void>() {
            override fun apply(
                `object`: Void,
                arg: ResourceManager,
                arg2: ProfilerFiller
            ) {
                if (cachedServer == null) cachedServer = ServerLifecycleHooks.getCurrentServer()
                if (cachedServer == null) return
                addMegaStoneRecipes(cachedServer!!)
            }

            override fun prepare(
                arg: ResourceManager,
                arg2: ProfilerFiller
            ): Void {
               TODO("Provide the return value")
            }
        })
    }

    private fun addMegaStoneRecipes(server: MinecraftServer) {
        val recipeManager = server.getRecipeManager()
        recipeManager.replaceRecipes(MegaShowdownCompat.getMegaStoneRecipes())
    }

    @JvmStatic
    fun registerItems() {
        GravelmonBlocks.register { identifier, item -> Registry.register(GravelmonBlocks.registry, identifier, item) }
        GravelmonItems.register { identifier, item -> Registry.register(GravelmonItems.registry, identifier, item) }
    }
}