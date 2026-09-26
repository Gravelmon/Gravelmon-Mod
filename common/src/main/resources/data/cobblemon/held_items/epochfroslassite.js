{
    name: "Epoch froslassite",
    spritenum: 620,
    megaStone: { "Froslass-Epoch": "Froslass-mega_epoch"},
    itemUser: ["Froslass-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10061,
    gen: 6,
    isNonstandard: "Past"
}
