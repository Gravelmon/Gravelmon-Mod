package drai.dev.gravelmon.registries

import com.cobblemon.mod.common.platform.PlatformRegistry
import drai.dev.gravelmon.apricorn.GravelmonApricornBlock
import drai.dev.gravelmon.apricorn.GravelmonApricornSaplingBlock
import drai.dev.gravelmon.apricorn.GravelmonApricorns
import drai.dev.gravelsextendedbattles.gravelmonResource
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.util.valueproviders.UniformInt
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.DropExperienceBlock
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import net.minecraft.world.level.material.PushReaction

@Suppress("SameParameterValue", "HasPlatformType", "MemberVisibilityCanBePrivate", "unused")
object GravelmonBlocks : PlatformRegistry<Registry<Block>, ResourceKey<Registry<Block>>, Block>() {

    override val registry: Registry<Block> = BuiltInRegistries.BLOCK
    override val resourceKey: ResourceKey<Registry<Block>> = Registries.BLOCK

    private val PLANT_PROPERTIES: BlockBehaviour.Properties = BlockBehaviour.Properties.of().mapColor(MapColor.PLANT)
        .noCollission().dynamicShape().randomTicks().instabreak().sound(SoundType.GRASS)
        .pushReaction(PushReaction.DESTROY)

    var ASTRAL_STONE_ORE: Block = evolutionStoneOre("astral_stone_ore")
    var DEEPSLATE_ASTRAL_STONE_ORE: Block = deepslateEvolutionStoneOre("deepslate_astral_stone_ore")
    var ASTRAL_STONE_BLOCK: Block = storageBlock("astral_stone_block")
    var AIR_STONE_ORE: Block = evolutionStoneOre("air_stone_ore")
    var DEEPSLATE_AIR_STONE_ORE: Block = deepslateEvolutionStoneOre("deepslate_air_stone_ore")
    var AIR_STONE_BLOCK: Block = storageBlock("air_stone_block")
    var MYSTIC_STONE_ORE: Block = evolutionStoneOre("mystic_stone_ore")
    var DEEPSLATE_MYSTIC_STONE_ORE: Block = deepslateEvolutionStoneOre("deepslate_mystic_stone_ore")
    var MYSTIC_STONE_BLOCK: Block = storageBlock("mystic_stone_block")
    var SOLID_STONE_ORE: Block = evolutionStoneOre("solid_stone_ore")
    var DEEPSLATE_SOLID_STONE_ORE: Block = deepslateEvolutionStoneOre("deepslate_solid_stone_ore")
    var SOLID_STONE_BLOCK: Block = storageBlock("solid_stone_block")
    var VARIA_STONE_BLOCK: Block = storageBlock("varia_stone_block")


    var PURPLE_APRICORN = apricornBlock("purple_apricorn", GravelmonApricorns.PURPLE)
    var ORANGE_APRICORN = apricornBlock("orange_apricorn", GravelmonApricorns.ORANGE)

    var PURPLE_APRICORN_SAPLING = apricornSapling("purple_apricorn_sapling", GravelmonApricorns.PURPLE)
    var ORANGE_APRICORN_SAPLING = apricornSapling("orange_apricorn_sapling", GravelmonApricorns.ORANGE)

    fun apricornBlock(name: String, apricorn: GravelmonApricorns): GravelmonApricornBlock {
        return create(
            gravelmonResource(name),
            GravelmonApricornBlock(
                BlockBehaviour.Properties.of()
                    .mapColor(apricorn.mapColor)
                    .randomTicks()
                    .strength(Blocks.OAK_LOG.defaultDestroyTime(), Blocks.OAK_LOG.getExplosionResistance())
                    .sound(SoundType.WOOD)
                    .noOcclusion().forceSolidOn(),
                apricorn
            )
        )
    }

    fun apricornSapling(
        name: String,
        apricorn: GravelmonApricorns
    ): GravelmonApricornSaplingBlock {
        return create(gravelmonResource(name),  GravelmonApricornSaplingBlock(PLANT_PROPERTIES, apricorn))
    }

    fun evolutionStoneOre(name: String): Block {
        return create(
            gravelmonResource(name),
            DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)))
    }

    fun storageBlock(name: String): Block {
        return create(gravelmonResource(name), Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)))
    }

    fun touch() {
        GravelmonFossilItems.touch()
    }

    fun deepslateEvolutionStoneOre(name: String): Block {
        return create(
            gravelmonResource(name),
                DropExperienceBlock(
                    UniformInt.of(1, 2),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)
                )
        )
    }

}