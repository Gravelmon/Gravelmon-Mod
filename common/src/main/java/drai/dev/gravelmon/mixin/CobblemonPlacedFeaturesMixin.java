package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.world.feature.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.world.level.levelgen.placement.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(CobblemonPlacedFeatures.class)
public class CobblemonPlacedFeaturesMixin {

    @Inject(method = "of", at =@At("HEAD"), remap = false, cancellable = true)
    private void ofReplacement(String id, CallbackInfoReturnable<ResourceKey<PlacedFeature>> cir){
        if(id.equals("apricorn_trees")){
            cir.setReturnValue(ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath("gravelmon",id)));
            cir.cancel();
        }
    }
}
