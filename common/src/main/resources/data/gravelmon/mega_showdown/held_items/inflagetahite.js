{
    name: "Inflagetahite",
    spritenum: 620,
    megaStone: { "Inflagetah": "Inflagetah-mega"},
    itemUser: ["Inflagetah"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10189,
    gen: 6,
    isNonstandard: "Past"
}
