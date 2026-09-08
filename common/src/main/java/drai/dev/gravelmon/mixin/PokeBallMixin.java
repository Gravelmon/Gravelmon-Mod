package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import drai.dev.gravelmon.pokeballs.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(PokeBall.class)
public abstract class PokeBallMixin {

    @Shadow public PokeBallItem item;

    @Inject(method = "item", at =@At("HEAD"), remap = false, cancellable = true)
    private void itemInject(CallbackInfoReturnable<PokeBallItem> cir){
        if(((PokeBall)(Object)this) instanceof GravelmonPokeBall){
           cir.setReturnValue(((GravelmonPokeBall)(Object)this).getPokeBallItem());
           cir.cancel();
        }
    }
}
