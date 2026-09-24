{
    name: "Epoch falinksite",
    spritenum: 620,
    megaStone: { "Falinks-Epoch": "Falinks-mega_epoch"},
    itemUser: ["Falinks-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10106,
    gen: 6,
    isNonstandard: "Past"
}
