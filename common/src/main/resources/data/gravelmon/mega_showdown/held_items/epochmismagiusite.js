{
    name: "Epoch mismagiusite",
    spritenum: 620,
    megaStone: { "Mismagius-Epoch": "Mismagius-mega_epoch"},
    itemUser: ["Mismagius-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10131,
    gen: 6,
    isNonstandard: "Past"
}
