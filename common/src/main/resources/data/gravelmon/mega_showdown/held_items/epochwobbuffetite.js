{
    name: "Epoch wobbuffetite",
    spritenum: 620,
    megaStone: { "Wobbuffet-Epoch": "Wobbuffet-mega_epoch"},
    itemUser: ["Wobbuffet-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10167,
    gen: 6,
    isNonstandard: "Past"
}
