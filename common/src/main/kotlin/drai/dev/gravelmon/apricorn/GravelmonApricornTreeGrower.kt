package drai.dev.gravelmon.apricorn

import net.minecraft.world.level.block.grower.TreeGrower
import java.util.*

class GravelmonApricornTreeGrower(apricorn: GravelmonApricorns) : TreeGrower(
    apricorn.name.lowercase(Locale.ROOT), Optional.empty(),
    Optional.of(apricorn.configuredFeature),
    Optional.empty()
)