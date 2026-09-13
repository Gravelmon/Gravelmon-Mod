{
    name: "Epoch corviknightite",
    spritenum: 620,
    megaStone: { "Corviknight-Epoch": "Corviknight-mega_epoch"},
    itemUser: ["Corviknight-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10182,
    gen: 6,
    isNonstandard: "Past"
}
