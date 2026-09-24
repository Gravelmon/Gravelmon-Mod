package drai.dev.gravelmon.registries

import com.cobblemon.mod.common.item.PokeBallItem
import com.cobblemon.mod.common.platform.PlatformRegistry
import com.cobblemon.mod.common.pokeball.PokeBall
import com.cobblemon.mod.common.pokemon.helditem.CobblemonHeldItemManager
import drai.dev.gravelmon.apricorn.GravelmonApricornSeedItem
import drai.dev.gravelmon.mega.GravelmonMegas
import drai.dev.gravelmon.mixin.accessors.PokeBallAccessor
import drai.dev.gravelmon.pokeball.GravelmonPokeBalls
import drai.dev.gravelsextendedbattles.fossils.GEBLootPoolManager
import drai.dev.gravelsextendedbattles.gravelmonResource
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import java.util.*

@Suppress("SameParameterValue", "MemberVisibilityCanBePrivate", "unused")
object GravelmonItems : PlatformRegistry<Registry<Item>, ResourceKey<Registry<Item>>, Item>() {
    override val registry: Registry<Item> = BuiltInRegistries.ITEM
    override val resourceKey: ResourceKey<Registry<Item>> = Registries.ITEM

    //Evolution Items
    var VARIA_STONE = create(gravelmonResource("varia_stone"), Item(Item.Properties()))
    var ASTRAL_STONE = create(gravelmonResource("astral_stone"), Item(Item.Properties()))
    var AIR_STONE = create(gravelmonResource("air_stone"), Item(Item.Properties()))
    var MYSTIC_STONE = create(gravelmonResource("mystic_stone"), Item(Item.Properties()))
    var SOLID_STONE = create(gravelmonResource("solid_stone"), Item(Item.Properties()))
    var XENOLITH = create(gravelmonResource("xenolith"), Item(Item.Properties()))
    var QUANTUM_UPGRADE = create(gravelmonResource("quantum_upgrade"), Item(Item.Properties()))
    var KALEIDOSCOPE = create(gravelmonResource("kaleidoscope"), Item(Item.Properties()))
    var CORRUPTED_DISC = create(gravelmonResource("corrupted_disc"), Item(Item.Properties()))
    var WES_UPDATE = create(gravelmonResource("wes_update"), Item(Item.Properties()))
    var MURKY_CLAW = create(gravelmonResource("murky_claw"), Item(Item.Properties()))
    var SILVER_SCALE = create(gravelmonResource("silver_scale"), Item(Item.Properties()))
    var ANCIENT_GLYPH = create(gravelmonResource("ancient_glyph"), Item(Item.Properties()))

    //    public static RegistrySupplier<Item> VOIDIX = create(gravelmonResource("voidix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> ELECTRIX = create(gravelmonResource("electrix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> BURIX = create(gravelmonResource("burix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> AQUIX = create(gravelmonResource("aquix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> VERDIX = create(gravelmonResource("verdix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> ZERIX = create(gravelmonResource("zerix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> PATHIX = create(gravelmonResource("pathix"), Item(Item.Properties()));
    //    public static RegistrySupplier<Item> PIXIX = create(gravelmonResource("pixix"), Item(Item.Properties()));
    var SLOWPOKE_TAIL = create(gravelmonResource("slowpoke_tail"), Item(Item.Properties()))
    var DREAD_PENDANT = create(gravelmonResource("dread_pendant"), Item(Item.Properties()))
    var SPARE_PARTS = create(gravelmonResource("spare_parts"), Item(Item.Properties()))
    var MAGIC_COOKIE = create(gravelmonResource("magic_cookie"), Item(Item.Properties()))
    var TERRESTRIAL_RING = create(gravelmonResource("terrestrial_ring"), Item(Item.Properties()))
    var XENOVERSAL_RING = create(gravelmonResource("xenoversal_ring"), Item(Item.Properties()))
    var INDUCTIVE_RING = create(gravelmonResource("inductive_ring"), Item(Item.Properties()))

    var GOLDEN_FEATHER = create(gravelmonResource("golden_feather"), Item(Item.Properties()))
    var PIXIE_DUST = create(gravelmonResource("pixie_dust"), Item(Item.Properties()))
    var OCARINA = create(gravelmonResource("ocarina"), Item(Item.Properties()))
    var ROYAL_JELLY = create(gravelmonResource("royal_jelly"), Item(Item.Properties()))
    var COCONUT_MILK = create(gravelmonResource("coconut_milk"), Item(Item.Properties()))
    var CARROT_WINE = create(gravelmonResource("carrot_wine"), Item(Item.Properties()))
    var URANIUM_CORE = create(gravelmonResource("uranium_core"), Item(Item.Properties()))
    var PREADITE = create(gravelmonResource("preadite"), Item(Item.Properties()))
    var EMPTY_SKULL = create(gravelmonResource("empty_skull"), Item(Item.Properties()))
    var FOREIGN_HAT = create(gravelmonResource("foreign_hat"), Item(Item.Properties()))
    var PRIM_SHEARS = create(gravelmonResource("prim_shears"), Item(Item.Properties()))
    var HAIR_TONIC = create(gravelmonResource("hair_tonic"), Item(Item.Properties()))
    var GROWTH_MULCH = create(gravelmonResource("growth_mulch"), Item(Item.Properties()))

    //    public static RegistrySupplier<Item> ABYSSAL_STONE = item("abyssal_stone");
    //Held Items
    //Sage
    var LONG_CLUB = heldItem(gravelmonResource("long_club"), Item(Item.Properties()))
    var X_RAY_SPECS = heldItem(gravelmonResource("x_ray_specs"), Item(Item.Properties()))
    var FOUL_ROCK = heldItem(gravelmonResource("foul_rock"), Item(Item.Properties()))
    var RAGGED_PEBBLE = heldItem(gravelmonResource("ragged_pebble"), Item(Item.Properties()))
    var POLISHED_SPHERE = heldItem(gravelmonResource("polished_sphere"), Item(Item.Properties()))
    var CORRUPTED_SEED = heldItem(gravelmonResource("corrupted_seed"), Item(Item.Properties()))
    var BOLT_ORB = heldItem(gravelmonResource("bolt_orb"), Item(Item.Properties()))
    var IVEOLITE = heldItem(gravelmonResource("iveolite"), Item(Item.Properties()))

    //Xenoverse
    var ICE_SHARD = heldItem(gravelmonResource("ice_shard"), Item(Item.Properties()))
    var MOSS_SHARD = heldItem(gravelmonResource("moss_shard"), Item(Item.Properties()))
    var PRETTY_RIBBON = heldItem(gravelmonResource("pretty_ribbon"), Item(Item.Properties()))
    var HAFLI_BERRY = heldItem(gravelmonResource("hafli_berry"), Item(Item.Properties()))

    //insurgence
    var DARK_ROCK = heldItem(gravelmonResource("dark_rock"), Item(Item.Properties()))
    var CRYSTAL_PIECE = heldItem(gravelmonResource("crystal_piece"), Item(Item.Properties()))

    //Pokeballs
    val POKE_BALLS: MutableList<PokeBallItem> = ArrayList()
    val MAUVE_BALL = pokeballItem("mauve_ball", GravelmonPokeBalls.MAUVE_BALL);
    val CORAL_BALL = pokeballItem("coral_ball", GravelmonPokeBalls.CORAL_BALL);
    val LUSTER_BALL = pokeballItem("luster_ball", GravelmonPokeBalls.LUSTER_BALL);
    val SUN_BALL = pokeballItem("sun_ball", GravelmonPokeBalls.SUN_BALL);
    val DAWN_BALL = pokeballItem("dawn_ball", GravelmonPokeBalls.DAWN_BALL);
    val FEATHER_BALL = pokeballItem("feather_ball", GravelmonPokeBalls.FEATHER_BALL);
    val NUCLEAR_BALL = pokeballItem("nuclear_ball", GravelmonPokeBalls.NUCLEAR_BALL);
    val ATOM_BALL = pokeballItem("atom_ball", GravelmonPokeBalls.ATOM_BALL);
    val DELTA_BALL = pokeballItem("delta_ball", GravelmonPokeBalls.DELTA_BALL);
    val XENO_BALL = pokeballItem("xeno_ball", GravelmonPokeBalls.XENO_BALL);
    val ANCIENT_BALL = pokeballItem("ancient_ball", GravelmonPokeBalls.ANCIENT_BALL);
    val SHINY_BALL = pokeballItem("shiny_ball", GravelmonPokeBalls.SHINY_BALL);
    val NUZLOCKE_BALL = pokeballItem("nuzlocke_ball", GravelmonPokeBalls.NUZLOCKE_BALL);
    val SNORE_BALL = pokeballItem("snore_ball", GravelmonPokeBalls.SNORE_BALL);
    val ARK_BALL = pokeballItem("ark_ball", GravelmonPokeBalls.ARK_BALL);
    val LIME_BALL = pokeballItem("lime_ball", GravelmonPokeBalls.LIME_BALL);
    //Ancient Pokeballs
    val ANCIENT_MAUVE_BALL = pokeballItem("ancient_mauve_ball", GravelmonPokeBalls.ANCIENT_MAUVE_BALL);
    val ANCIENT_CORAL_BALL = pokeballItem("ancient_coral_ball", GravelmonPokeBalls.ANCIENT_CORAL_BALL);
    //Team Rocket Poke balls
    val ROCKET_BALL = pokeballItem("rocket_ball", GravelmonPokeBalls.ROCKET_BALL);
    val GREAT_ROCKET_BALL = pokeballItem("great_rocket_ball", GravelmonPokeBalls.GREAT_ROCKET_BALL);
    val ULTRA_ROCKET_BALL = pokeballItem("ultra_rocket_ball", GravelmonPokeBalls.ULTRA_ROCKET_BALL);
    //Official Game Poke balls
    val TYPING_BALL = pokeballItem("typing_ball", GravelmonPokeBalls.TYPING_BALL);
    val GS_BALL = pokeballItem("gs_ball", GravelmonPokeBalls.GS_BALL);
    val GEN2_LURE_BALL = pokeballItem("gen2_lure_ball", GravelmonPokeBalls.GEN2_LURE_BALL);
    //Anime Poke balls
    val LAKE_BALL = pokeballItem("lake_ball", GravelmonPokeBalls.LAKE_BALL);
    val ANIME_SAFARI_BALL = pokeballItem("anime_safari_ball", GravelmonPokeBalls.ANIME_SAFARI_BALL);
    val ANNIE_BALL = pokeballItem("annie_ball", GravelmonPokeBalls.ANNIE_BALL);
    val OAKLEY_BALL = pokeballItem("oakley_ball", GravelmonPokeBalls.OAKLEY_BALL);
    val FISHING_BALL = pokeballItem("fishing_ball", GravelmonPokeBalls.FISHING_BALL);
    val ANIME_GS_BALL = pokeballItem("anime_gs_ball", GravelmonPokeBalls.ANIME_GS_BALL);
    //Manga Poke balls
    val MANGA_SAFARI_BALL = pokeballItem("manga_safari_ball", GravelmonPokeBalls.MANGA_SAFARI_BALL);
    //LGBTQ+ balls
    val GAY_BALL = pokeballItem("gay_ball", GravelmonPokeBalls.GAY_BALL);
    val LESBIAN_BALL = pokeballItem("lesbian_ball", GravelmonPokeBalls.LESBIAN_BALL);
    val BI_BALL = pokeballItem("bi_ball", GravelmonPokeBalls.BI_BALL);
    val PAN_BALL = pokeballItem("pan_ball", GravelmonPokeBalls.PAN_BALL);
    val TRANS_BALL = pokeballItem("trans_ball", GravelmonPokeBalls.TRANS_BALL);
    val NON_BINARY_BALL = pokeballItem("non_binary_ball", GravelmonPokeBalls.NON_BINARY_BALL);
    val ACE_BALL = pokeballItem("ace_ball", GravelmonPokeBalls.ACE_BALL);
    val ARO_BALL = pokeballItem("aro_ball", GravelmonPokeBalls.ARO_BALL);

    //Block Items
    var ASTRAL_STONE_ORE = blockItem("astral_stone_ore", GravelmonBlocks.ASTRAL_STONE_ORE)
    var DEEPSLATE_ASTRAL_STONE_ORE = blockItem("deepslate_astral_stone_ore", GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE)
    var ASTRAL_STONE_BLOCK = blockItem("astral_stone_block", GravelmonBlocks.ASTRAL_STONE_BLOCK)
    var AIR_STONE_ORE = blockItem("air_stone_ore", GravelmonBlocks.AIR_STONE_ORE)
    var DEEPSLATE_AIR_STONE_ORE = blockItem("deepslate_air_stone_ore", GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE)
    var AIR_STONE_BLOCK = blockItem("air_stone_block", GravelmonBlocks.AIR_STONE_BLOCK)
    var MYSTIC_STONE_ORE = blockItem("mystic_stone_ore", GravelmonBlocks.MYSTIC_STONE_ORE)
    var DEEPSLATE_MYSTIC_STONE_ORE = blockItem("deepslate_mystic_stone_ore", GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE)
    var MYSTIC_STONE_BLOCK = blockItem("mystic_stone_block", GravelmonBlocks.MYSTIC_STONE_BLOCK)
    var SOLID_STONE_ORE = blockItem("solid_stone_ore", GravelmonBlocks.SOLID_STONE_ORE)
    var DEEPSLATE_SOLID_STONE_ORE = blockItem("deepslate_solid_stone_ore", GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE)
    var SOLID_STONE_BLOCK = blockItem("solid_stone_block", GravelmonBlocks.SOLID_STONE_BLOCK)
    var VARIA_STONE_BLOCK = blockItem("varia_stone_block", GravelmonBlocks.VARIA_STONE_BLOCK)


    var PURPLE_APRICORN = create(gravelmonResource("purple_apricorn"), Item(Item.Properties()))
    var ORANGE_APRICORN = create(gravelmonResource("orange_apricorn"), Item(Item.Properties()))

    var PURPLE_APRICORN_SEED = create(
        gravelmonResource("purple_apricorn_seed"),
        GravelmonApricornSeedItem(
        GravelmonBlocks.PURPLE_APRICORN_SAPLING,
        GravelmonBlocks.PURPLE_APRICORN,
            Item.Properties()
        )
    )
    var ORANGE_APRICORN_SEED = create(
        gravelmonResource("orange_apricorn_seed"),
        GravelmonApricornSeedItem(
            GravelmonBlocks.ORANGE_APRICORN_SAPLING,
            GravelmonBlocks.ORANGE_APRICORN,
            Item.Properties()
        )
    )

    fun pokeballItem(name: String, pokeBall: PokeBall): PokeBallItem {
        val item = create(gravelmonResource(name), PokeBallItem(pokeBall))
        POKE_BALLS.add(item)
        (pokeBall as Any as PokeBallAccessor).item = item
        return item
    }

    fun blockItem(name: String, block: Block): BlockItem {
        val item = create(gravelmonResource(name), BlockItem(block, Item.Properties()))
        return item
    }

    private fun heldItem(name: ResourceLocation, item: Item): Item = create(name, item).also {
        CobblemonHeldItemManager.registerRemap(it, name.path.lowercase().replace("_",""))
    }

    fun fossilItem(
        lootTables: List<ResourceLocation>,
        itemName: String,
        speciesName: String
    ): Item {
        val item = create(gravelmonResource(itemName), Item(Item.Properties()))
        lootTables.forEach { GEBLootPoolManager.addUncommonItemToLootPool(it, item) }
        GravelmonFossilItems.FOSSIL_MAP[itemName] = speciesName.lowercase(Locale.getDefault())
        GravelmonFossilItems.FOSSIL_ITEM_MAP[itemName] = item
        return item
    }

    override fun register(consumer: (ResourceLocation, Item) -> Unit) {
        super.register(consumer)
        lateRunnables.forEach { it.run() }
    }

    fun touch() {
        GravelmonMegas
    }

    val lateRunnables = mutableListOf<Runnable>()
    @JvmStatic
    fun registerLate(runnable: Runnable) {
        lateRunnables.add(runnable)
    }
}