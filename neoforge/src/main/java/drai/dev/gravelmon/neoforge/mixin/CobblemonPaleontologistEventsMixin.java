package drai.dev.gravelmon.neoforge.mixin;

import drai.dev.gravelmon.neoforge.paleontologistcompat.*;
import net.hana.cobblemon_paleontologist.event.*;
import net.neoforged.neoforge.event.village.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import static net.hana.cobblemon_paleontologist.villager.ModVillagers.PALEONTOLOGIST;

@Mixin(ModEvents.class)
public class CobblemonPaleontologistEventsMixin {
    @Inject(
            method = "addCustomTrades",
            at = @At(value = "HEAD"), // First return in the method
            cancellable = true,
            remap = false
    )
    private static void afterGetPokemon(VillagerTradesEvent event, CallbackInfo ci) {
        PaleontologistOverride.addGravelmonFossils(PALEONTOLOGIST.value(), event, ci);
    }
}
