{
    name: "Epoch wigglytuffite",
    spritenum: 620,
    megaStone: { "Wigglytuff-Epoch": "Wigglytuff-mega_epoch"},
    itemUser: ["Wigglytuff-Epoch"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10041,
    gen: 6,
    isNonstandard: "Past"
}
