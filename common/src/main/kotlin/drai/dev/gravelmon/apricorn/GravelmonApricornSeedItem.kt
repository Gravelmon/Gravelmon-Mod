package drai.dev.gravelmon.apricorn

import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState

class GravelmonApricornSeedItem(
    block: Block,
    private val apricornBlock: GravelmonApricornBlock,
    properties: Properties
) : BlockItem(block, properties) {
    override fun canPlace(context: BlockPlaceContext, state: BlockState): Boolean {
        val player: Player? = checkNotNull(context.getPlayer())
        return player!!.isCreative() || super.canPlace(context, state)
    }

    override fun getPlacementState(blockPlaceContext: BlockPlaceContext): BlockState? {
        if (apricornBlock.isEnabled(blockPlaceContext.getLevel().enabledFeatures())) {
            val apricornState = this.apricornBlock.getStateForPlacement(blockPlaceContext)
            if (apricornState != null && this.canPlace(blockPlaceContext, apricornState)) {
                return apricornState
            }
        }
        return super.getPlacementState(blockPlaceContext)
    }
}
