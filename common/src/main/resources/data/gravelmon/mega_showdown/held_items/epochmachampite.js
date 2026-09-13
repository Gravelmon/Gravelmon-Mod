{
    name: "Epoch machampite",
    spritenum: 620,
    megaStone: { "Machamp-Epoch": "Machamp-mega_epoch"},
    itemUser: ["Machamp-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10162,
    gen: 6,
    isNonstandard: "Past"
}
