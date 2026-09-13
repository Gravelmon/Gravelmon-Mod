package drai.dev.gravelmon.mixin.accessors;

import com.cobblemon.mod.common.api.pokeball.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import net.minecraft.resources.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.*;

import java.util.*;

@Mixin(PokeBall.class)
public interface PokeBallAccessor {
    @Mutable
    @Accessor("item")
    public PokeBallItem getItem();

    @Accessor("item")
    public void setItem(PokeBallItem item);
}
