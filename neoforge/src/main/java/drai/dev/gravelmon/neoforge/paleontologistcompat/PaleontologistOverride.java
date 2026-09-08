package drai.dev.gravelmon.neoforge.paleontologistcompat;

import com.cobblemon.mod.common.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import it.unimi.dsi.fastutil.ints.*;
import net.hana.cobblemon_paleontologist.villager.*;
import net.minecraft.world.entity.npc.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.trading.*;
import net.neoforged.neoforge.event.village.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import java.util.*;

public class PaleontologistOverride {
    public static void addGravelmonFossils(VillagerProfession paleontologist, VillagerTradesEvent event, CallbackInfo ci) {
        GravelmonItems.registerLate(() -> {
            if (event.getType() == ModVillagers.PALEONTOLOGIST.value()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                //lvl 1
                trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 10),
                        new ItemStack(CobblemonItems.FOSSIL_ANALYZER, 1), 3, 10, 0.04f));
                trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 16),
                        new ItemStack(CobblemonItems.RESTORATION_TANK, 1), 3, 10, 0.04f));
                trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 16),
                        new ItemStack(CobblemonItems.MONITOR, 1), 3, 10, 0.04f));
                trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(CobblemonItems.REVIVAL_HERB, 12),
                        new ItemStack(Items.EMERALD, 2), 32, 4, 0.1f));

                //lvl 2
                trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 4),
                        new ItemStack(Items.BRUSH, 1), 3, 6, 0.04f));
                trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 6),
                        new ItemStack(Items.IRON_SHOVEL, 1), 3, 6, 0.04f));
                trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                        new ItemCost(Items.EMERALD, 6),
                        new ItemStack(Items.IRON_PICKAXE, 1), 3, 6, 0.04f));

                //lvls 3-5
                addGravelmonFossils(trades.get(3));
                addGravelmonFossils(trades.get(4));
                addGravelmonFossils(trades.get(5));
            }
        });
        ci.cancel();
    }

    private static void addGravelmonFossils(List<VillagerTrades.ItemListing> itemListings) {
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(CobblemonItems.FOSSILIZED_BIRD, 1), 3, 10, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(CobblemonItems.FOSSILIZED_DINO, 1), 3, 10, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(CobblemonItems.FOSSILIZED_DRAKE, 1), 3, 10, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(CobblemonItems.FOSSILIZED_FISH, 1), 5, 10, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.ARMOR_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.CLAW_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.COVER_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.DOME_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.HELIX_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.JAW_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.OLD_AMBER_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.PLUME_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.ROOT_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.SAIL_FOSSIL, 1), 3, 20, 0.05f));
        itemListings.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 32),
                new ItemStack(CobblemonItems.SKULL_FOSSIL, 1), 3, 20, 0.05f));
        Gravelmon.getAllowedFossils().forEach(fossil-> {
            itemListings.add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    new ItemStack(fossil, 1), 3, 20, 0.05f));
        });
    }
}
