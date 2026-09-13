{
    name: "Epoch mamoswinite",
    spritenum: 620,
    megaStone: { "Mamoswine-Epoch": "Mamoswine-mega_epoch"},
    itemUser: ["Mamoswine-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10249,
    gen: 6,
    isNonstandard: "Past"
}
