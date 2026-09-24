{
    name: "Epoch butterfrite",
    spritenum: 620,
    megaStone: { "Butterfree-Epoch": "Butterfree-mega_epoch"},
    itemUser: ["Butterfree-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10131,
    gen: 6,
    isNonstandard: "Past"
}
