{
    name: "Epoch gardevoirite",
    spritenum: 620,
    megaStone: { "Gardevoir-Epoch": "Gardevoir-mega_epoch"},
    itemUser: ["Gardevoir-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10103,
    gen: 6,
    isNonstandard: "Past"
}
