{
    name: "Feraligatrite i",
    spritenum: 620,
    megaStone: { "Feraligatr": "Feraligatr-mega_i"},
    itemUser: ["Feraligatr"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10082,
    gen: 6,
    isNonstandard: "Past"
}
