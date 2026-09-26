{
    name: "Cryogonalite",
    spritenum: 620,
    megaStone: { "Cryogonal": "Cryogonal-mega"},
    itemUser: ["Cryogonal"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10038,
    gen: 6,
    isNonstandard: "Past"
}
