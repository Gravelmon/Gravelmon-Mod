{
    name: "Epoch ninetalesite",
    spritenum: 620,
    megaStone: { "Ninetales-Epoch": "Ninetales-mega_epoch"},
    itemUser: ["Ninetales-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10198,
    gen: 6,
    isNonstandard: "Past"
}
