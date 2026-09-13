{
    name: "Epoch torterranite",
    spritenum: 620,
    megaStone: { "Torterra-Epoch": "Torterra-mega_epoch"},
    itemUser: ["Torterra-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10246,
    gen: 6,
    isNonstandard: "Past"
}
