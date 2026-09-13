{
    name: "Delta gardevoirite",
    spritenum: 620,
    megaStone: { "Gardevoir-Delta": "Gardevoir-mega_delta"},
    itemUser: ["Gardevoir-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10101,
    gen: 6,
    isNonstandard: "Past"
}
