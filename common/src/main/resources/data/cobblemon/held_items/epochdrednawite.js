{
    name: "Epoch drednawite",
    spritenum: 620,
    megaStone: { "Drednaw-Epoch": "Drednaw-mega_epoch"},
    itemUser: ["Drednaw-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10051,
    gen: 6,
    isNonstandard: "Past"
}
