package drai.dev.gravelmon.mixin.accessors;

import com.cobblemon.mod.common.api.pokeball.*;
import com.cobblemon.mod.common.pokeball.*;
import net.minecraft.resources.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.*;

import java.util.*;

@Mixin(PokeBalls.class)
public interface PokeBallsAccessor {
    @Mutable
    @Accessor("defaults")
    public HashMap<ResourceLocation, PokeBall> getDefaults();
}
