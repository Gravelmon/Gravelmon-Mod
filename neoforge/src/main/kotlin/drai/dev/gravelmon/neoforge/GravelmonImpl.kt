package drai.dev.gravelmon.neoforge

import com.cobblemon.mod.common.ResourcePackActivationBehaviour
import drai.dev.gravelmon.Gravelmon
import drai.dev.gravelmon.mega.GravelmonMegas
import drai.dev.gravelmon.msd.MegaShowdownCompat
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import drai.dev.gravelsextendedbattles.GravelsExtendedBattles
import drai.dev.gravelsextendedbattles.gravelmonResource
import net.minecraft.core.Registry
import net.minecraft.server.MinecraftServer
import net.minecraft.server.packs.PackLocationInfo
import net.minecraft.server.packs.PackSelectionConfig
import net.minecraft.server.packs.PackType
import net.minecraft.server.packs.PathPackResources
import net.minecraft.server.packs.repository.BuiltInPackSource
import net.minecraft.server.packs.repository.KnownPack
import net.minecraft.server.packs.repository.Pack
import net.minecraft.server.packs.repository.Pack.Position
import net.minecraft.server.packs.repository.PackSource
import net.minecraft.server.packs.resources.ResourceManager
import net.minecraft.server.packs.resources.SimplePreparableReloadListener
import net.minecraft.util.profiling.ProfilerFiller
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.ModList
import net.neoforged.neoforge.common.NeoForge
import net.neoforged.neoforge.event.AddPackFindersEvent
import net.neoforged.neoforge.event.AddReloadListenerEvent
import net.neoforged.neoforge.event.server.ServerStartedEvent
import net.neoforged.neoforge.server.ServerLifecycleHooks
import java.util.Optional

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

    @SubscribeEvent
    fun onAddPackFindersEvent(event: AddPackFindersEvent) {
        val modFile = ModList.get().getModContainerById(Gravelmon.MOD_ID).get().modInfo
        Gravelmon.builtinPacks
            .filter { it.packType == event.packType }
            .forEach { it ->
                val subPath = if (it.packType == PackType.CLIENT_RESOURCES) "resourcepacks" else "datapacks"
                val packLocation = gravelmonResource("$subPath/${it.id}")
                val resourcePath = modFile.owningFile.file.findResource(packLocation.path)

                val version = modFile.version

                val pack = Pack.readMetaAndCreate(PackLocationInfo("mod/$packLocation", it.displayName, PackSource.BUILT_IN, Optional.of(KnownPack("neoforge", "mod/$packLocation", version.toString()))),
                    BuiltInPackSource.fromName { PathPackResources(it, resourcePath) },
                    it.packType,
                    PackSelectionConfig(it.activationBehaviour == ResourcePackActivationBehaviour.ALWAYS_ENABLED, Position.TOP, false)
                )

                if (pack == null) {
                    GravelsExtendedBattles.LOGGER.error("Failed to register built-in pack ${it.id}. If you are in dev you can ignore this")
                    return@forEach
                }

                event.addRepositorySource { it.accept(pack) }
            }
    }

    private fun registerMegaStoneRecipes(event: AddReloadListenerEvent) {
        if (!ModList.get().isLoaded("mega_showdown")) return

        event.addListener(object : SimplePreparableReloadListener<Void>() {
            override fun apply(
                `object`: Void?,
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
            ): Void? {
               return null
            }
        })
    }

    private fun addMegaStoneRecipes(server: MinecraftServer) {
        val recipeManager = server.recipeManager
        recipeManager.replaceRecipes(
            recipeManager.getRecipes().associateBy { it.id() }.toMutableMap().apply {
                MegaShowdownCompat.getMegaStoneRecipes().forEach { put(it.id(), it) }
            }.values
        )
    }

    @JvmStatic
    fun registerItems() {
        GravelmonBlocks.register { identifier, item -> Registry.register(GravelmonBlocks.registry, identifier, item) }
        GravelmonItems.register { identifier, item -> Registry.register(GravelmonItems.registry, identifier, item) }
//        GravelmonMegas.register()
    }
}