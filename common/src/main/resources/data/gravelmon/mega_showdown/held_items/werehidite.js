{
    name: "Werehidite",
    spritenum: 620,
    megaStone: { "Werehide": "Werehide-mega"},
    itemUser: ["Werehide"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10079,
    gen: 6,
    isNonstandard: "Past"
}
