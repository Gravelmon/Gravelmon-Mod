{
    name: "Armiran sceptilite",
    spritenum: 620,
    megaStone: { "Sceptile-Armiran": "Sceptile-mega_armiran"},
    itemUser: ["Sceptile-Armiran"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10216,
    gen: 6,
    isNonstandard: "Past"
}
