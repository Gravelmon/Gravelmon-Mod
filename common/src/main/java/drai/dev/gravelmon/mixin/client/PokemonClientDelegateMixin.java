package drai.dev.gravelmon.mixin.client;

import com.cobblemon.mod.common.client.entity.*;
import com.cobblemon.mod.common.client.render.models.blockbench.*;
import com.cobblemon.mod.common.entity.pokemon.*;
import net.minecraft.network.syncher.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(PokemonClientDelegate.class)
public abstract class PokemonClientDelegateMixin extends PosableState {
    @Shadow public PokemonEntity currentEntity;

    @Inject(
            method = "onSyncedDataUpdated",
            at = @At(
                    value = "INVOKE",
                    target = "Ljava/util/Set;contains(Ljava/lang/Object;)Z",
                    shift = At.Shift.AFTER
            ),
            remap = false
    )
    public void inject(EntityDataAccessor<?> data, CallbackInfo ci){
        var currentAspects = currentEntity.getAspects();
        var pokemon = currentEntity.getPokemon();
        pokemon.setForcedAspects(currentAspects);
        pokemon.updateForm();
        currentEntity.refreshDimensions();
    }
}