package drai.dev.gravelmon.fabric.mixin;

import drai.dev.gravelmon.fabric.paleontologistcompat.*;
import net.hana.cobblemon_paleontologist.villager.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import static net.hana.cobblemon_paleontologist.villager.ModVillagers.PALEONTOLOGIST;

@Mixin(ModTrades.class)
public class CobblemonPaleontologistMixin {

    @Inject(
            method = "registerCustomTrades",
            at = @At(value = "HEAD"), // First return in the method
            cancellable = true,
            remap = false
    )
    private static void afterGetPokemon(CallbackInfo ci) {
        PaleontologistOverride.addGravelmonFossils(PALEONTOLOGIST, ci);
    }
}
