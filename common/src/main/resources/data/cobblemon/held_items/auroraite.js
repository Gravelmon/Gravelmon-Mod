{
    name: "Auroraite",
    spritenum: 620,
    megaStone: { "Aurorai": "Aurorai-mega"},
    itemUser: ["Aurorai"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10040,
    gen: 6,
    isNonstandard: "Past"
}
