package drai.dev.gravelmon.mixin.client;

import com.cobblemon.mod.common.client.gui.summary.widgets.*;
import com.cobblemon.mod.common.pokemon.*;
import drai.dev.gravelmon.*;
import kotlin.jvm.internal.*;
import org.joml.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ModelWidget.class)
public class ModelWidgetMixin {

    @Shadow private float rotationY;
    @Mutable
    @Final
    @Shadow private Vector3f rotationVector;

    @Inject(method =
            "<init>(IIIILcom/cobblemon/mod/common/pokemon/RenderablePokemon;FFDZZI)V",
            at =@At("TAIL"), remap = false)
    private void modifyRotation(int pX, int pY, int pWidth, int pHeight, RenderablePokemon pokemon, float baseScale, float rotationY, double offsetY, boolean playCryOnClick, boolean shouldFollowCursor, int blockLight, CallbackInfo ci){
        rotationY = GravelmonUtils.modelWidgetCorrection(pokemon, rotationY);
        rotationVector = new Vector3f(0F, rotationY, 0F);
    }
}