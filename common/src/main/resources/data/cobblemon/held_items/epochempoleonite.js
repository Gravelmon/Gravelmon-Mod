{
    name: "Epoch empoleonite",
    spritenum: 620,
    megaStone: { "Empoleon-Epoch": "Empoleon-mega_epoch"},
    itemUser: ["Empoleon-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10194,
    gen: 6,
    isNonstandard: "Past"
}
