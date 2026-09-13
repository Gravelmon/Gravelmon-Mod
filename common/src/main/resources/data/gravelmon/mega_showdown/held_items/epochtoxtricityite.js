{
    name: "Epoch toxtricityite",
    spritenum: 620,
    megaStone: { "Toxtricity-Epoch": "Toxtricity-mega_epoch"},
    itemUser: ["Toxtricity-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10117,
    gen: 6,
    isNonstandard: "Past"
}
