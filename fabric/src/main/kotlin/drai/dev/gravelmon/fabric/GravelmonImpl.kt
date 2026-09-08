package drai.dev.gravelmon.fabric

import com.cobblemon.mod.common.ResourcePackActivationBehaviour
import drai.dev.gravelmon.Gravelmon
import drai.dev.gravelmon.msd.MegaShowdownCompat
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import drai.dev.gravelsextendedbattles.GravelsExtendedBattles
import drai.dev.gravelsextendedbattles.gravelmonResource
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
import net.fabricmc.fabric.api.resource.ResourcePackActivationType
import net.fabricmc.fabric.impl.content.registry.CompostingChanceRegistryImpl
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.core.Registry
import net.minecraft.server.MinecraftServer
import net.minecraft.server.packs.PackType
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

        Gravelmon.builtinPacks.forEach {
            val mod = FabricLoader.getInstance().getModContainer(Gravelmon.MOD_ID).get()
            val resourcePackActivationType = when (it.activationBehaviour) {
                ResourcePackActivationBehaviour.NORMAL -> ResourcePackActivationType.NORMAL
                ResourcePackActivationBehaviour.DEFAULT_ENABLED -> ResourcePackActivationType.DEFAULT_ENABLED
                ResourcePackActivationBehaviour.ALWAYS_ENABLED -> ResourcePackActivationType.ALWAYS_ENABLED
            }
            val id = gravelmonResource(it.id)
            val subPath = "${ if (it.packType == PackType.CLIENT_RESOURCES) "resourcepacks" else "datapacks" }/${id.path}"
            ResourceManagerHelperImpl.registerBuiltinResourcePack(id, subPath, mod, it.displayName, resourcePackActivationType)
        }
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