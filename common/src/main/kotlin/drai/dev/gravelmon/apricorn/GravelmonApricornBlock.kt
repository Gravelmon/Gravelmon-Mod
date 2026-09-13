package drai.dev.gravelmon.apricorn

import com.cobblemon.mod.common.CobblemonBlocks.APRICORN_LEAVES
import com.cobblemon.mod.common.block.ShearableBlock
import com.mojang.serialization.MapCodec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.server.level.ServerLevel
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.util.RandomSource
import net.minecraft.world.InteractionResult
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.Level
import net.minecraft.world.level.LevelAccessor
import net.minecraft.world.level.LevelReader
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.IntegerProperty
import net.minecraft.world.level.gameevent.GameEvent
import net.minecraft.world.level.pathfinder.PathComputationType
import net.minecraft.world.phys.BlockHitResult
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

class GravelmonApricornBlock(properties: Properties, apricorn: GravelmonApricorns) :
    HorizontalDirectionalBlock(properties), BonemealableBlock, ShearableBlock {
    var apricorn: GravelmonApricorns

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block?, BlockState?>) {
        builder.add(AGE, FACING)
    }

    public override fun isRandomlyTicking(state: BlockState): Boolean {
        return state.getValue(AGE) < MAX_AGE
    }

    public override fun randomTick(state: BlockState, level: ServerLevel, pos: BlockPos, random: RandomSource) {
        if (level.random.nextInt(5) == 0) {
            val currentAge = state.getValue(AGE)
            if (currentAge < MAX_AGE) {
                level.setBlock(pos, state.setValue(AGE, currentAge + 1), 2)
            }
        }
        this.tick(state, level, pos, random)
    }

    public override fun canSurvive(state: BlockState, level: LevelReader, pos: BlockPos): Boolean {
        val facing = state.getValue(FACING)
        val blockState = level.getBlockState(pos.relative(facing))
        return blockState.`is`(APRICORN_LEAVES)
    }

    override fun getStateForPlacement(context: BlockPlaceContext): BlockState? {
        var blockState = this.defaultBlockState()
        val worldView = context.getLevel()
        val blockPos = context.getClickedPos()
        for (direction in context.getNearestLookingDirections()) {
            if (direction.getAxis().isHorizontal()) {
                blockState = blockState.setValue<Direction?, Direction?>(FACING, direction)
                if (blockState.canSurvive(worldView, blockPos)) {
                    return blockState
                }
            }
        }
        return null
    }

    public override fun getOcclusionShape(state: BlockState, level: BlockGetter, pos: BlockPos): VoxelShape {
        return EAST_AABB[3]
    }

    public override fun getRenderShape(state: BlockState): RenderShape {
        return RenderShape.MODEL
    }

    public override fun getShape(
        state: BlockState,
        level: BlockGetter,
        pos: BlockPos,
        context: CollisionContext
    ): VoxelShape {
        return getVoxelShape(state)
    }

    public override fun isPathfindable(state: BlockState, type: PathComputationType): Boolean {
        return false
    }

    private fun getVoxelShape(state: BlockState): VoxelShape {
        val age = state.getValue(AGE)
        val shape: VoxelShape
        when (state.getValue(FACING)) {
            Direction.EAST -> shape = EAST_AABB[age]
            Direction.SOUTH -> shape = SOUTH_AABB[age]
            Direction.WEST -> shape = WEST_AABB[age]
            else -> shape = NORTH_AABB[age]
        }
        return shape
    }

    override fun codec(): MapCodec<out HorizontalDirectionalBlock?> {
        return CODEC
    }

    public override fun rotate(state: BlockState, rotation: Rotation): BlockState {
        return state.setValue<Direction?, Direction?>(
            FACING,
            rotation.rotate(state.getValue(FACING))
        ) as BlockState
    }

    public override fun mirror(state: BlockState, mirror: Mirror): BlockState {
        return state.rotate(mirror.getRotation(state.getValue(FACING)))
    }

    public override fun updateShape(
        state: BlockState,
        direction: Direction,
        neighborState: BlockState,
        level: LevelAccessor,
        pos: BlockPos,
        neighborPos: BlockPos
    ): BlockState {
        return if (direction == state.getValue(FACING) && !state.canSurvive(
                level,
                pos
            )
        ) Blocks.AIR.defaultBlockState() else super.updateShape(
            state,
            direction,
            neighborState,
            level,
            pos,
            neighborPos
        )
    }

    public override fun useWithoutItem(
        state: BlockState,
        level: Level,
        pos: BlockPos,
        player: Player,
        hit: BlockHitResult
    ): InteractionResult {
        if (state.getValue(AGE) != MAX_AGE) {
            return super.useWithoutItem(state, level, pos, player, hit)
        }

        doHarvest(level, state, pos, player)
        return InteractionResult.SUCCESS
    }

    override fun getCloneItemStack(levelReader: LevelReader, blockPos: BlockPos, blockState: BlockState): ItemStack {
        return ItemStack(apricorn.item)
    }

    override fun isValidBonemealTarget(level: LevelReader, pos: BlockPos, state: BlockState): Boolean {
        return state.getValue(AGE) < MAX_AGE
    }

    override fun isBonemealSuccess(level: Level, random: RandomSource, pos: BlockPos, state: BlockState): Boolean {
        return true
    }

    override fun performBonemeal(level: ServerLevel, random: RandomSource, pos: BlockPos, state: BlockState) {
        level.setBlock(pos, state.setValue(AGE, state.getValue(AGE) + 1), 2)
    }

    override fun attack(blockState: BlockState, level: Level, blockPos: BlockPos, player: Player) {
        if (blockState.getValue(AGE) != MAX_AGE) {
            super.attack(blockState, level, blockPos, player)
            return
        }

        doHarvest(level, blockState, blockPos, player)
    }

    fun harvest(world: Level, state: BlockState, pos: BlockPos): BlockState {
        dropResources(state, world, pos)
        // Don't use default as we want to keep the facing
        val resetState = state.setValue(AGE, MIN_AGE)
        world.setBlock(pos, resetState, UPDATE_CLIENTS)
        return resetState
    }

    private fun doHarvest(world: Level, state: BlockState, pos: BlockPos, player: Player?) {
        val resetState = this.harvest(world, state, pos)
        world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, resetState))

        if (!world.isClientSide) {
            world.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 0.7f, 1.4f)
        }
    }

    override fun attemptShear(
        world: Level,
        state: BlockState,
        pos: BlockPos,
        successCallback: () -> Unit
    ): Boolean {
        if (state.getValue(AGE) != MAX_AGE) {
            return false
        }
        world.playSound(null, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1f, 1f)
        this.harvest(world, state, pos)
        successCallback.invoke()
        world.gameEvent(null, GameEvent.SHEAR, pos)
        return true
    }

    init {
        this.registerDefaultState(
            this.defaultBlockState().setValue(AGE, MIN_AGE)
                .setValue(FACING, Direction.NORTH)
        )
        this.apricorn = apricorn
    }

    companion object {
        val CODEC: MapCodec<GravelmonApricornBlock> = RecordCodecBuilder.mapCodec { it.group(
            propertiesCodec(),
            GravelmonApricorns.CODEC.fieldOf("apricorn").forGetter(GravelmonApricornBlock::apricorn)
        ).apply(it, { properties, apricorn -> GravelmonApricornBlock(properties, apricorn!!) }) }
        var AGE: IntegerProperty
        var MAX_AGE: Int
        var MIN_AGE: Int
        private val NORTH_AABB: Array<VoxelShape>
        private val SOUTH_AABB: Array<VoxelShape>
        private val EAST_AABB: Array<VoxelShape>
        private val WEST_AABB: Array<VoxelShape>

        init {
            AGE = BlockStateProperties.AGE_3
            MAX_AGE = BlockStateProperties.MAX_AGE_3
            MIN_AGE = 0

            // North
            // Stage 0
            val NORTH_STAGE_0 = Shapes.box(0.40625, 0.5, 0.0, 0.59375, 0.6875, 0.1875)
            val NORTH_CAP_STAGE_0 = Shapes.box(0.4375, 0.65625, 0.03125, 0.5625, 0.71875, 0.15625)
            // Stage 1
            val NORTH_STAGE_1 = Shapes.box(0.375, 0.40625, 0.0, 0.625, 0.65625, 0.25)
            val NORTH_CAP_STAGE_1 = Shapes.box(0.40625, 0.625, 0.03125, 0.59375, 0.6875, 0.21875)
            // Stage 2
            val NORTH_STAGE_2 = Shapes.box(0.34375, 0.296875, 0.0, 0.65625, 0.609375, 0.3125)
            val NORTH_CAP_STAGE_2 = Shapes.box(0.375, 0.59375, 0.03125, 0.625, 0.65625, 0.28125)
            // Stage 3 - Full Fruit
            val NORTH_STAGE_3 = Shapes.box(0.3125, 0.1875, 0.0, 0.6875, 0.5625, 0.375)
            val NORTH_CAP_STAGE_3 = Shapes.box(0.375, 0.5625, 0.0625, 0.625, 0.625, 0.3125)
            NORTH_AABB = arrayOf<VoxelShape>(
                Shapes.or(NORTH_STAGE_0, NORTH_CAP_STAGE_0),
                Shapes.or(NORTH_STAGE_1, NORTH_CAP_STAGE_1),
                Shapes.or(NORTH_STAGE_2, NORTH_CAP_STAGE_2),
                Shapes.or(NORTH_STAGE_3, NORTH_CAP_STAGE_3)
            )

            // South
            // Stage 0
            val SOUTH_STAGE_0 = Shapes.box(0.40625, 0.5, 0.8125, 0.59375, 0.6875, 1.0)
            val SOUTH_CAP_STAGE_0 = Shapes.box(0.4375, 0.65625, 0.84375, 0.5625, 0.71875, 0.96875)
            // Stage 1
            val SOUTH_STAGE_1 = Shapes.box(0.375, 0.40625, 0.75, 0.625, 0.65625, 1.0)
            val SOUTH_CAP_STAGE_1 = Shapes.box(0.40625, 0.625, 0.78125, 0.59375, 0.6875, 0.96875)
            // Stage 2
            val SOUTH_STAGE_2 = Shapes.box(0.34375, 0.296875, 0.6875, 0.65625, 0.609375, 1.0)
            val SOUTH_CAP_STAGE_2 = Shapes.box(0.375, 0.59375, 0.71875, 0.625, 0.65625, 0.96875)
            // Stage 3 - Full Fruit
            val SOUTH_STAGE_3 = Shapes.box(0.3125, 0.1875, 0.625, 0.6875, 0.5625, 1.0)
            val SOUTH_CAP_STAGE_3 = Shapes.box(0.375, 0.5625, 0.6875, 0.625, 0.625, 0.9375)
            SOUTH_AABB = arrayOf<VoxelShape>(
                Shapes.or(SOUTH_STAGE_0, SOUTH_CAP_STAGE_0),
                Shapes.or(SOUTH_STAGE_1, SOUTH_CAP_STAGE_1),
                Shapes.or(SOUTH_STAGE_2, SOUTH_CAP_STAGE_2),
                Shapes.or(SOUTH_STAGE_3, SOUTH_CAP_STAGE_3)
            )

            // East
            // Stage 0
            val EAST_STAGE_0 = Shapes.box(0.8125, 0.5, 0.40625, 1.0, 0.6875, 0.59375)
            val EAST_CAP_STAGE_0 = Shapes.box(0.84375, 0.65625, 0.4375, 0.96875, 0.71875, 0.5625)

            // Stage 1
            val EAST_STAGE_1 = Shapes.box(0.75, 0.40625, 0.375, 1.0, 0.65625, 0.625)
            val EAST_CAP_STAGE_1 = Shapes.box(0.78125, 0.625, 0.40625, 0.96875, 0.6875, 0.59375)

            // Stage 2
            val EAST_STAGE_2 = Shapes.box(0.6875, 0.296875, 0.34375, 1.0, 0.609375, 0.65625)
            val EAST_CAP_STAGE_2 = Shapes.box(0.71875, 0.59375, 0.375, 0.96875, 0.65625, 0.625)

            // Stage 3 - Full Fruit
            val EAST_STAGE_3 = Shapes.box(0.625, 0.1875, 0.3125, 1.0, 0.5625, 0.6875)
            val EAST_CAP_STAGE_3 = Shapes.box(0.6875, 0.5625, 0.375, 0.9375, 0.625, 0.625)

            EAST_AABB = arrayOf<VoxelShape>(
                Shapes.or(EAST_STAGE_0, EAST_CAP_STAGE_0),
                Shapes.or(EAST_STAGE_1, EAST_CAP_STAGE_1),
                Shapes.or(EAST_STAGE_2, EAST_CAP_STAGE_2),
                Shapes.or(EAST_STAGE_3, EAST_CAP_STAGE_3)
            )

            // West
            // Stage 0
            val WEST_STAGE_0 = Shapes.box(0.0, 0.5, 0.40625, 0.1875, 0.6875, 0.59375)
            val WEST_CAP_STAGE_0 = Shapes.box(0.03125, 0.65625, 0.4375, 0.15625, 0.71875, 0.5625)
            // Stage 1
            val WEST_STAGE_1 = Shapes.box(0.0, 0.40625, 0.375, 0.25, 0.65625, 0.625)
            val WEST_CAP_STAGE_1 = Shapes.box(0.03125, 0.625, 0.40625, 0.21875, 0.6875, 0.59375)
            // Stage 2
            val WEST_STAGE_2 = Shapes.box(0.0, 0.296875, 0.34375, 0.3125, 0.609375, 0.65625)
            val WEST_CAP_STAGE_2 = Shapes.box(0.03125, 0.59375, 0.375, 0.28125, 0.65625, 0.625)
            // Stage 3 - Full Fruit
            val WEST_STAGE_3 = Shapes.box(0.0, 0.1875, 0.3125, 0.375, 0.5625, 0.6875)
            val WEST_CAP_STAGE_3 = Shapes.box(0.0625, 0.5625, 0.375, 0.3125, 0.625, 0.625)

            WEST_AABB = arrayOf<VoxelShape>(
                Shapes.or(WEST_STAGE_0, WEST_CAP_STAGE_0),
                Shapes.or(WEST_STAGE_1, WEST_CAP_STAGE_1),
                Shapes.or(WEST_STAGE_2, WEST_CAP_STAGE_2),
                Shapes.or(WEST_STAGE_3, WEST_CAP_STAGE_3)
            )
        }
    }
}