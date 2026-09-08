package drai.dev.gravelmon;

import net.minecraft.resources.*;

public enum BaseCobblemonDigSites {
    BIRCH_TREE,
    DRIPSTONE_OASIS,
    ENHYDRO_AGATE,
    ERODED_PILLAR,
    FROZEN_POND,
    FROZEN_SPIKE,
    HYDROTHERMAL_VENTS,
    LUSH_DEN,
    MOSSY_POND,
    MUD_PIT,
    OAK_TREE,
    POWDERED_DEPOSIT,
    PRESERVED_SKELETON,
    ROOTED_PIT,
    SANDY_DEN,
    SPRUCE_TREE,
    SUBMERGED_IMPACT,
    SUBMERGED_SPIKE,
    SUNSCORCHED_DEN,
    SUNSCORCHED_REMAINS,
    SUSPICIOUS_MOUND,
    UNDERWATER_FISSURE,
    VIBRANT_HYDROTHERMAL_VENTS;

    public ResourceLocation common(){
        return ResourceLocation.fromNamespaceAndPath("cobblemon", "fossils/common/prehistoric_" + name().toLowerCase());
    }

    public ResourceLocation uncommon(){
        return ResourceLocation.fromNamespaceAndPath("cobblemon", "fossils/uncommon/prehistoric_" + name().toLowerCase());
    }

}