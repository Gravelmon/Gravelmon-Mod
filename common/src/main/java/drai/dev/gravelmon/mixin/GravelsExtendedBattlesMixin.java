package drai.dev.gravelmon.mixin;

import drai.dev.gravelmon.*;
import drai.dev.gravelsextendedbattles.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;


@Mixin(GravelsExtendedBattles.class)
public class GravelsExtendedBattlesMixin {

    @Inject(
            method = "initialize",
            at = @At(value = "TAIL") , remap = false
    )
    private static void afterGetPokemon(CallbackInfo ci) {
        Gravelmon.initialize();
    }
}
