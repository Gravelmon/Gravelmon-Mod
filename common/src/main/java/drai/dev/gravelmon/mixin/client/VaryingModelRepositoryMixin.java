package drai.dev.gravelmon.mixin.client;

import com.cobblemon.mod.common.client.render.models.blockbench.pose.*;
import com.cobblemon.mod.common.client.render.models.blockbench.repository.VaryingModelRepository;
import drai.dev.gravelmon.placeholders.*;
import net.minecraft.server.packs.resources.ResourceManager;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.*;

@Mixin(VaryingModelRepository.class)
public class VaryingModelRepositoryMixin {

    @Shadow
    private static Map<String, Bone> texturedModels;

    @Inject(
            method = "reload",
            at = @At("RETURN")
    )
    private void afterReload(ResourceManager resourceManager, CallbackInfo ci) {
        GravelmonPlaceholderModels.onModelsReloaded(resourceManager, texturedModels);
    }
}