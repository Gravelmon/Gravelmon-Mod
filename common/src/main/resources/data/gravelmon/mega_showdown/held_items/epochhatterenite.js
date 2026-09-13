{
    name: "Epoch hatterenite",
    spritenum: 620,
    megaStone: { "Hatterene-Epoch": "Hatterene-mega_epoch"},
    itemUser: ["Hatterene-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10184,
    gen: 6,
    isNonstandard: "Past"
}
