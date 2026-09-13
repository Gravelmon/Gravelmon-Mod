{
    name: "Chloradisite",
    spritenum: 620,
    megaStone: { "Chloradise": "Chloradise-mega"},
    itemUser: ["Chloradise"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10253,
    gen: 6,
    isNonstandard: "Past"
}
