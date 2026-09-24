{
    name: "Epoch dodrionite",
    spritenum: 620,
    megaStone: { "Dodrio-Epoch": "Dodrio-mega_epoch"},
    itemUser: ["Dodrio-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10222,
    gen: 6,
    isNonstandard: "Past"
}
