{
    name: "Epoch hippowdonite",
    spritenum: 620,
    megaStone: { "Hippowdon-Epoch": "Hippowdon-mega_epoch"},
    itemUser: ["Hippowdon-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10191,
    gen: 6,
    isNonstandard: "Past"
}
