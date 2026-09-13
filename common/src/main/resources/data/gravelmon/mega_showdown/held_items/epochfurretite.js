{
    name: "Epoch furretite",
    spritenum: 620,
    megaStone: { "Furret-Epoch": "Furret-mega_epoch"},
    itemUser: ["Furret-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10081,
    gen: 6,
    isNonstandard: "Past"
}
