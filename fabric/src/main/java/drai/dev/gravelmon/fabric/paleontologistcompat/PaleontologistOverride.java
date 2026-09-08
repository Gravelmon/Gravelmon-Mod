package drai.dev.gravelmon.fabric.paleontologistcompat;

import com.cobblemon.mod.common.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.object.builder.v1.trade.*;
import net.minecraft.world.entity.npc.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.trading.*;
import org.spongepowered.asm.mixin.injection.callback.*;

public class PaleontologistOverride {
    public static void addGravelmonFossils(VillagerProfession paleontologist, CallbackInfo ci) {
        GravelmonItems.registerLate(() -> {
            TradeOfferHelper.registerVillagerOffers(paleontologist, 1, factories -> {
                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 16),
                        new ItemStack(CobblemonItems.FOSSIL_ANALYZER), 3, 6, 0.04f
                ));

                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 16),
                        new ItemStack(CobblemonItems.RESTORATION_TANK), 3, 6, 0.04f
                ));

                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 16),
                        new ItemStack(CobblemonItems.MONITOR), 3, 6, 0.04f
                ));

                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(CobblemonItems.REVIVAL_HERB, 8),
                        new ItemStack(Items.EMERALD, 1), 24, 6, 0.04f
                ));
            });

            TradeOfferHelper.registerVillagerOffers(paleontologist, 2, factories -> {
                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 8),
                        new ItemStack(Items.BRUSH), 3, 4, 0.04f
                ));
                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 12),
                        new ItemStack(Items.IRON_SHOVEL), 3, 6, 0.04f
                ));
                factories.add((entity, random) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 8),
                        new ItemStack(Items.IRON_PICKAXE), 4, 6, 0.04f
                ));
            });

            addGravelmonFossils(paleontologist, 3);
            addGravelmonFossils(paleontologist, 4);
            addGravelmonFossils(paleontologist, 5);
        });
        ci.cancel();
    }

    private static void addGravelmonFossils(VillagerProfession paleontologist, int i) {
        TradeOfferHelper.registerVillagerOffers(paleontologist, i, factories -> {
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(CobblemonItems.FOSSILIZED_BIRD), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(CobblemonItems.FOSSILIZED_DINO), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(CobblemonItems.FOSSILIZED_DRAKE), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(CobblemonItems.FOSSILIZED_FISH), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.ARMOR_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.CLAW_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.COVER_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.DOME_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.HELIX_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.JAW_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.OLD_AMBER_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.PLUME_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.ROOT_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.SAIL_FOSSIL), 3, 10, 0.05f
            ));
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(CobblemonItems.SKULL_FOSSIL), 3, 10, 0.05f
            ));
            Gravelmon.getAllowedFossils().forEach(fossil-> factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(fossil), 3, 10, 0.05f
            )));
        });

    }
}
