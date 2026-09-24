{
    name: "Epoch beedrillite",
    spritenum: 620,
    megaStone: { "Beedrill-Epoch": "Beedrill-mega_epoch"},
    itemUser: ["Beedrill-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10002,
    gen: 6,
    isNonstandard: "Past"
}
