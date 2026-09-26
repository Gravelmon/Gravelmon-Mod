{
    name: "Epoch coalossalite",
    spritenum: 620,
    megaStone: { "Coalossal-Epoch": "Coalossal-mega_epoch"},
    itemUser: ["Coalossal-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10095,
    gen: 6,
    isNonstandard: "Past"
}
