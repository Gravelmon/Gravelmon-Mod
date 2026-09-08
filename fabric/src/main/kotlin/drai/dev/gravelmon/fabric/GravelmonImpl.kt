package drai.dev.gravelmon.fabric

import drai.dev.gravelmon.msd.MegaShowdownCompat
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
import net.fabricmc.fabric.impl.content.registry.CompostingChanceRegistryImpl
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.core.Registry
import net.minecraft.server.MinecraftServer
import net.minecraft.server.packs.resources.CloseableResourceManager

object GravelmonImpl {
    @JvmStatic
    fun platformInit() {
        GravelmonFeatures.registerFeatures()
        CreativeTabsInit.initCreativeTabs()
        val orangeApp = GravelmonItems.ORANGE_APRICORN
        CompostingChanceRegistryImpl.INSTANCE.add(orangeApp, .65f)
        CompostingChanceRegistryImpl.INSTANCE.add(GravelmonItems.PURPLE_APRICORN, .65f)

        registerMegaStoneRecipes()
    }
    
    @JvmStatic
    fun registerItems() {
        GravelmonBlocks.register { identifier, item -> Registry.register(GravelmonBlocks.registry, identifier, item) }
        GravelmonItems.register { identifier, item -> Registry.register(GravelmonItems.registry, identifier, item) }
    }

    private fun registerMegaStoneRecipes() {
        if (!FabricLoader.getInstance().isModLoaded("mega_showdown")) return
        ServerLifecycleEvents.SERVER_STARTED.register(ServerLifecycleEvents.ServerStarted { server: MinecraftServer? -> addMegaStoneRecipes(server!!) })
        ServerLifecycleEvents.END_DATA_PACK_RELOAD.register(ServerLifecycleEvents.EndDataPackReload { server: MinecraftServer?, _: CloseableResourceManager?, _: Boolean ->
            addMegaStoneRecipes(server!!)
        })
    }

    private fun addMegaStoneRecipes(server: MinecraftServer) {
        val recipeManager = server.recipeManager
        recipeManager.replaceRecipes(MegaShowdownCompat.getMegaStoneRecipes())
    }
}