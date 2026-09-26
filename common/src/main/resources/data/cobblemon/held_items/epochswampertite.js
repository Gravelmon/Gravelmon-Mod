{
    name: "Epoch swampertite",
    spritenum: 620,
    megaStone: { "Swampert-Epoch": "Swampert-mega_epoch"},
    itemUser: ["Swampert-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10049,
    gen: 6,
    isNonstandard: "Past"
}
