package drai.dev.gravelmon.mega

/**
 * Every mega stone item the mod registers. A stone is registered whatever the player's selection is, so client and server always have the same
 * item registry; which stones are *offered* is decided by `data/gravelmon/mega_evolutions.json` of the downloaded pack, built from the site for the
 * Pokemon that exist (see [GravelmonMegas]). A new stone needs a mod release: add its name here, and the site checks that every stone it names is in this list.
 */
object MegaStoneNames {
    val NAMES: List<String> = listOf(
        "regalientite", "epochtwo_absolite", "ayreian_lucarionite", "nuclear_baariettite", "ayreian_fearowite",
        "delta_venusaurite", "poliwrathite", "epoch_metagrossite", "armiran_garchompite", "nuclear_gyaradosite",
        "epochtwo_grimmsnarlite", "delta_typhlosionite", "steelixite_fire", "epoch_venusaurite", "epoch_gigalithite",
        "ayreian_flygonite", "epoch_ursalunanite", "chambrawlite", "cryogonalite", "delta_bisharpite", "zebstrikanite",
        "epoch_xatuite", "raikouite", "delta_cameruptite", "epoch_furretite", "epoch_sandacondanite", "epoch_seismitoadite",
        "rushotite", "crawdauntite", "ayreian_galladite", "luxrayite", "skeledeepite", "epoch_abomasnowite",
        "epoch_gyaradosite", "ayreian_altarianite", "delta_girafarigite", "epoch_vespiquenite", "shadow_mewtwonite",
        "starmite_p", "jirachite", "kiricornite", "phoenanite", "epoch_wigglytuffite", "reuniclusite", "ayreian_charizardite",
        "epoch_medichamite", "epoch_electrodite", "delta_ruin_metagrossite", "epoch_dragonitite", "maidnitite",
        "epochtwo_whimsicottite", "razorvilite", "bisharpite", "epoch_minunite", "epochtwo_ursalunanite", "arcaninite_x",
        "epoch_heracrossite", "zoroarkite", "arcaninite_p", "epoch_hatterenite", "gandolphite", "fevestanite",
        "epochtwo_gothitellite", "epoch_empoleonite", "feraligatrite_i", "epochtwo_charizardite", "delta_galladite",
        "delta_scizorite", "epochtwo_altarianite", "epoch_dugtrionite", "froslassite_i", "epoch_mamoswinite", "rupsenite",
        "inflagetahite", "enteite", "epoch_aerodactylite", "epoch_barbaraclite", "monstunite", "epoch_falinksite",
        "epoch_butterfrite", "s51anite", "epoch_beheeyemite", "epoch_gardevoirite", "meganiumite_i", "delta_sableyite",
        "blastoisite_d", "epoch_lopunnyite", "wolverizite", "lophugite", "epoch_chandelurite", "epoch_garchompite",
        "epoch_beartite", "delta_charizardite", "yanpaowite", "phantomailite", "epoch_sawsbuckite", "epoch_banettite",
        "weavilite", "ayreian_relicanthite", "lilligantite", "epoch_glalite", "epoch_swampertite", "armiran_sceptilite",
        "delta_milotite", "typhlosionite", "epoch_pidgeotite", "epochtwo_wyrdeerite", "bellossomite", "epoch_centiskorchite",
        "ayreian_venusaurite", "epoch_exploudite", "epoch_sharpedonite", "metalynxite", "delta_blastoisite",
        "epoch_dragapultite", "milotite_d", "milotite_i", "syrentidite", "delta_mawilite", "epoch_wobbuffetite", "damasoarite",
        "nuclear_arbokite", "gothitellite", "cofagrigusite", "epoch_tsareenanite", "hydromedaryite", "auroraite", "ekiamanite",
        "elestompite", "jayzurite", "epoch_golurkite", "magcargonite", "emporeelite", "epoch_blisseyite", "epoch_mismagiusite",
        "epoch_raichuite", "morphiasite", "epoch_ampharosite", "epoch_emolganite", "geckonite", "eevite", "epoch_beedrillite",
        "rampardosite", "epoch_dodrionite", "stunfiskite", "epoch_tyranitarite", "mienshaonite", "epoch_blazikenite",
        "crystoxite", "dramsamanite", "epoch_ninetalesite", "epoch_toxtricityite", "caramelixite", "helioliskite",
        "baariettite", "epoch_gengarite", "strikezallite", "epoch_avaluggite", "cacturnite", "slymanderite", "whimsicottite",
        "shiftryite_x", "leonitite", "suicunite", "miltankite", "epoch_hippowdonite", "delta_froslassite", "chatotite",
        "parabowite", "ayreian_gardevoirite", "epoch_starmite", "werehidite", "epoch_slowkingite", "epoch_infernapite",
        "epochtwo_cacturnite", "venusaurite_d", "politoedite", "epoch_blastoisite", "epoch_chimechonite", "epoch_pluslite",
        "drilgannite", "epoch_arbokite", "epoch_donphanite", "delta_pidgeotite", "epoch_aggronite", "nawalite",
        "sudowoodonite", "epoch_corviknightite", "epoch_coalossalite", "epoch_torterranite", "shiftryite_i",
        "epoch_rapidashite", "epochtwo_swampertite", "flearoite", "chloradisite", "epoch_gliscorite", "epochtwo_sableyite",
        "epoch_gothitellite", "epoch_sceptilite", "dinopionite", "cryodragonite", "epoch_charizardite", "salaslamite",
        "epoch_garbodorite", "archillesite", "hydreigonite", "epoch_sableyite", "forelkite", "armiran_tyranitarite",
        "delta_lucarionite", "epoch_salamencite", "esteritite", "ayreian_blastoisite", "electruxonite", "flygonite",
        "delta_sunfloranite", "epochtwo_masquerainite", "delta_glalite", "epoch_grapploctite", "epoch_garganaclite",
        "spiritombite", "epochtwo_jumpluffite", "crystal_fragment", "epoch_froslassite", "epoch_drednawite", "smaquanite",
        "girafarigite", "epochtwo_gigalithite", "mountrite", "epoch_sudowoodonite", "marowakite", "delta_spider_metagrossite",
        "epoch_cofagrigusite", "epoch_kingdranite", "raizodonite", "epoch_galladite", "delta_medichamite", "epoch_absolite",
        "epoch_manectrite", "haxorusite", "delta_gardevoirite", "arbokite", "epoch_houndoomite", "epoch_machampite",
        "epoch_altarianite", "ayreian_aerodactylite", "sunfloranite", "lavenrinanite", "ayreian_absolite", "epoch_steelixite",
        "delta_lopunnyite", "epoch_tentacruelite",
    )
}
