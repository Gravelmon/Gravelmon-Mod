{
    name: "Electruxonite",
    spritenum: 620,
    megaStone: { "Electruxo": "Electruxo-mega"},
    itemUser: ["Electruxo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10122,
    gen: 6,
    isNonstandard: "Past"
}
