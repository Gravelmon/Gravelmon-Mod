{
    name: "Epoch sawsbuckite",
    spritenum: 620,
    megaStone: { "Sawsbuck-Epoch": "Sawsbuck-mega_epoch"},
    itemUser: ["Sawsbuck-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10035,
    gen: 6,
    isNonstandard: "Past"
}
