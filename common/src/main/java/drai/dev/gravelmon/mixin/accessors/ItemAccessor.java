package drai.dev.gravelmon.mixin.accessors;

import net.minecraft.core.component.*;
import net.minecraft.world.item.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.*;

@Mixin(Item.class)
public interface ItemAccessor {
    @Mutable
    @Accessor("components")
    public DataComponentMap getComponents();

}
