{
    name: "Rampardosite",
    spritenum: 620,
    megaStone: { "Rampardos": "Rampardos-mega"},
    itemUser: ["Rampardos"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10231,
    gen: 6,
    isNonstandard: "Past"
}
