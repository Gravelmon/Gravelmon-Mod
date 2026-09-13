{
    name: "Delta charizardite",
    spritenum: 620,
    megaStone: { "Charizard-Delta": "Charizard-mega_delta"},
    itemUser: ["Charizard-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10043,
    gen: 6,
    isNonstandard: "Past"
}
