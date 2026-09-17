{
    name: "Elestompite",
    spritenum: 620,
    megaStone: { "Elestomp": "Elestomp-mega"},
    itemUser: ["Elestomp"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10209,
    gen: 6,
    isNonstandard: "Past"
}
