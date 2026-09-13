{
    name: "Geckonite",
    spritenum: 620,
    megaStone: { "Geckone": "Geckone-mega"},
    itemUser: ["Geckone"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10029,
    gen: 6,
    isNonstandard: "Past"
}
