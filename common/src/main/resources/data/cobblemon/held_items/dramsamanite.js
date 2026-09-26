{
    name: "Dramsamanite",
    spritenum: 620,
    megaStone: { "Dramsama": "Dramsama-mega"},
    itemUser: ["Dramsama"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10093,
    gen: 6,
    isNonstandard: "Past"
}
