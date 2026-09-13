package drai.dev.gravelmon.fabric

import com.cobblemon.mod.common.api.Priority
import com.cobblemon.mod.common.item.PokeBallItem
import com.cobblemon.mod.common.platform.events.ItemTooltipEvent
import com.cobblemon.mod.common.platform.events.PlatformEvents.CLIENT_ITEM_TOOLTIP
import drai.dev.gravelmon.registries.GravelmonBlocks
import drai.dev.gravelmon.registries.GravelmonItems
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.ChatFormatting
import net.minecraft.client.renderer.RenderType
import net.minecraft.locale.Language
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.Style
import net.minecraft.world.item.ItemStack
import java.util.stream.Stream

class GravelmonFabricClient : ClientModInitializer {
    override fun onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.ORANGE_APRICORN, RenderType.cutout())
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.PURPLE_APRICORN, RenderType.cutout())
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.ORANGE_APRICORN_SAPLING, RenderType.cutout())
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.PURPLE_APRICORN_SAPLING, RenderType.cutout())
        CLIENT_ITEM_TOOLTIP.subscribe(Priority.LOWEST) { event: ItemTooltipEvent? ->
            val stack = event!!.stack
            val lines = event.lines
            val stackDescription = stack.item.descriptionId
            val descriptionsForGravelmonBalls = GravelmonItems.POKE_BALLS.stream()
                .flatMap<Any?> { item: PokeBallItem -> Stream.of(item.descriptionId) }.toList()
            if (descriptionsForGravelmonBalls.contains(stackDescription)) {
                if (stackDescription.contains("nuzlocke")) {
                    val language = Language.getInstance()
                    val key1 = this.baseLangKeyForItem(stack) + 1
                    val key2 = this.baseLangKeyForItem(stack) + 2
                    if (language.has(key1)) {
                        lines.add(Component.translatable(key1).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)))
                    }
                    if (language.has(key2)) {
                        lines.add(Component.translatable(key2).setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_RED)))
                    }
                } else {
                    val language = Language.getInstance()
                    val key = this.baseLangKeyForItem(stack)
                    if (language.has(key)) {
                        lines.add(Component.translatable(key).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)))
                    }
                }
            }
            Unit
        }
    }

    private fun baseLangKeyForItem(stack: ItemStack): String {
        if (stack.getItem() is PokeBallItem) {
            val asPokeball = stack.getItem() as PokeBallItem
            return "item.gravelmon." + asPokeball.pokeBall.name.getPath() + ".tooltip"
        }
        return ".tooltip"
    }
}