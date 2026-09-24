{
    name: "Epoch glalite",
    spritenum: 620,
    megaStone: { "Glalie-Epoch": "Glalie-mega_epoch"},
    itemUser: ["Glalie-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10153,
    gen: 6,
    isNonstandard: "Past"
}
