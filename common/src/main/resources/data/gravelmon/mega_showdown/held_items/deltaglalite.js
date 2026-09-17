{
    name: "Delta glalite",
    spritenum: 620,
    megaStone: { "Glalie-Delta": "Glalie-mega_delta"},
    itemUser: ["Glalie-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10151,
    gen: 6,
    isNonstandard: "Past"
}
