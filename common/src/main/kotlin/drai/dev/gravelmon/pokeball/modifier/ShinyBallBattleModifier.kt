package drai.dev.gravelmon.pokeball.modifier

import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier
import com.cobblemon.mod.common.pokemon.Pokemon
import net.minecraft.world.entity.LivingEntity

class ShinyBallBattleModifier : CatchRateModifier {
    override fun value(thrower: LivingEntity, pokemon: Pokemon): Float {
        if (pokemon.shiny) return 255f
        return 1f
    }

    override fun behavior(thrower: LivingEntity, pokemon: Pokemon): CatchRateModifier.Behavior {
        return CatchRateModifier.Behavior.MULTIPLY
    }

    override fun isValid(thrower: LivingEntity, pokemon: Pokemon): Boolean {
        return pokemon.shiny
    }

    override fun modifyCatchRate(currentCatchRate: Float, thrower: LivingEntity, pokemon: Pokemon): Float {
        return this.behavior(thrower, pokemon).mutator.invoke(currentCatchRate, this.value(thrower, pokemon))
    }

    override fun isGuaranteed(): Boolean {
        return true
    }
}