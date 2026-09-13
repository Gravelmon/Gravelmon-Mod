{
    name: "Epoch sceptilite",
    spritenum: 620,
    megaStone: { "Sceptile-Epoch": "Sceptile-mega_epoch"},
    itemUser: ["Sceptile-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10217,
    gen: 6,
    isNonstandard: "Past"
}
