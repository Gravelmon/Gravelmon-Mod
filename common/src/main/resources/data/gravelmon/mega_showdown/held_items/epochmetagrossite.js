{
    name: "Epoch metagrossite",
    spritenum: 620,
    megaStone: { "Metagross-Epoch": "Metagross-mega_epoch"},
    itemUser: ["Metagross-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10242,
    gen: 6,
    isNonstandard: "Past"
}
