package drai.dev.gravelmon.apricorn

import net.minecraft.world.level.block.SaplingBlock

class GravelmonApricornSaplingBlock(properties: Properties, apricorn: GravelmonApricorns) :
    SaplingBlock(GravelmonApricornTreeGrower(apricorn), properties)