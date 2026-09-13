package drai.dev.gravelmon.mixin.client;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.molang.*;
import com.cobblemon.mod.common.client.render.*;
import com.cobblemon.mod.common.client.render.models.blockbench.repository.VaryingModelRepository;
import com.cobblemon.mod.common.util.adapters.*;
import com.google.gson.*;
import drai.dev.gravelmon.placeholders.*;
import drai.dev.gravelmon.utils.*;
import net.minecraft.resources.*;
import net.minecraft.server.packs.resources.*;
import org.joml.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.*;
import java.nio.charset.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

import static drai.dev.gravelmon.placeholders.GravelmonVaryingModelRepositoryOverrides.registerVariations;

@Mixin(VaryingModelRepository.class)
public abstract class VaryingRenderableResolverMixin {

    @Unique
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(ResourceLocation.class, IdentifierAdapter.INSTANCE)
            .registerTypeAdapter(Vector3f.class, Vector3fAdapter.INSTANCE)
            .registerTypeAdapter(Vector4f.class, Vector4fAdapter.INSTANCE)
            .registerTypeAdapter(ModelTextureSupplier.class, ModelTextureSupplierAdapter.INSTANCE)
            .registerTypeAdapter(ExpressionLike.class, ExpressionLikeAdapter.INSTANCE)
            .registerTypeAdapter(SpriteType.class, SpriteTypeAdapter.INSTANCE)
            .disableHtmlEscaping()
            .setLenient()
            .create();

    @Inject(
            method = "registerVariations",
            at = @At("HEAD"),
            cancellable = true
    )
    private void initialize(
            ResourceManager resourceManager, CallbackInfo ci
    ) {

        VaryingModelRepository self = (VaryingModelRepository) (Object) this;

        registerVariations(resourceManager, self);
        ci.cancel();
    }

//    self.repository = repository;
//        self.getPosers().clear();
//        self.getAllModels().forEach(identifier -> {
//        Bone model;
//        if (identifier.getPath().startsWith(MODEL_PREFIX)) {
//            model = GravelmonPlaceholderModels.createModel(identifier);
//            if (model == null) {
//                throw new IllegalStateException("Unable to create placeholder model " + identifier);
//            }
//        } else {
//            model = repository.getTexturedModels().get(identifier);
//            if (model == null) {
//                throw new IllegalStateException("Unable to load model " + identifier + " for " + self.getName());
//            }
//        }
//        self.getModels().put(identifier, model);
//        GravelmonPlaceholderModels.registerPoser(repository, identifier);
//    });
}