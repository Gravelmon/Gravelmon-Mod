{
    name: "Epoch exploudite",
    spritenum: 620,
    megaStone: { "Exploud-Epoch": "Exploud-mega_epoch"},
    itemUser: ["Exploud-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10161,
    gen: 6,
    isNonstandard: "Past"
}
