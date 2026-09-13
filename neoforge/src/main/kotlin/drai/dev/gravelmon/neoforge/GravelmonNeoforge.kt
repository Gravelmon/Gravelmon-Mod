package drai.dev.gravelmon.neoforge

import drai.dev.gravelmon.Gravelmon
import net.minecraft.client.renderer.RenderType
import net.minecraft.client.renderer.Sheets
import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.client.event.RegisterNamedRenderTypesEvent
import net.neoforged.neoforge.registries.RegisterEvent
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(Gravelmon.MOD_ID)
class GravelmonNeoforge() {

    init {
        MOD_BUS.addListener { _: RegisterEvent -> Gravelmon.initialize() }
    }

    @SubscribeEvent
    fun onRegisterNamedRenderTypes(event: RegisterNamedRenderTypesEvent) {
        event.register(
            ResourceLocation.fromNamespaceAndPath("gravelmon", "orange_apricorn"),
            RenderType.cutout(),
            Sheets.cutoutBlockSheet()
        )
        event.register(
            ResourceLocation.fromNamespaceAndPath("gravelmon", "purple_apricorn"),
            RenderType.cutout(),
            Sheets.cutoutBlockSheet()
        )
        event.register(
            ResourceLocation.fromNamespaceAndPath("gravelmon", "purple_apricorn_sapling"),
            RenderType.cutout(),
            Sheets.cutoutBlockSheet()
        )
        event.register(
            ResourceLocation.fromNamespaceAndPath("gravelmon", "orange_apricorn_sapling"),
            RenderType.cutout(),
            Sheets.cutoutBlockSheet()
        )
    }
}