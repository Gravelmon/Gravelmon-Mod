{
    name: "Epoch donphanite",
    spritenum: 620,
    megaStone: { "Donphan-Epoch": "Donphan-mega_epoch"},
    itemUser: ["Donphan-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10064,
    gen: 6,
    isNonstandard: "Past"
}
