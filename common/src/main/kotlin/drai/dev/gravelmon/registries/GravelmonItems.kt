package drai.dev.gravelmon.registries

import com.cobblemon.mod.common.item.PokeBallItem
import com.cobblemon.mod.common.platform.PlatformRegistry
import com.cobblemon.mod.common.pokeball.PokeBall
import drai.dev.gravelmon.mixin.accessors.PokeBallAccessor
import drai.dev.gravelmon.pokeball.GravelmonPokeBalls
import drai.dev.gravelsextendedbattles.gravelmonResource
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item

object GravelmonItems : PlatformRegistry<Registry<Item>, ResourceKey<Registry<Item>>, Item>() {
    override val registry: Registry<Item> = BuiltInRegistries.ITEM
    override val resourceKey: ResourceKey<Registry<Item>> = Registries.ITEM
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

    fun pokeballItem(name: String, pokeBall: PokeBall): PokeBallItem {
        val item = create(gravelmonResource(name), PokeBallItem(pokeBall))
        POKE_BALLS.add(item)
        (pokeBall as Any as PokeBallAccessor).item = item
        return item
    }
}