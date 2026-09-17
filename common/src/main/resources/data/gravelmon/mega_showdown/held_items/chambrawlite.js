{
    name: "Chambrawlite",
    spritenum: 620,
    megaStone: { "Chambrawl": "Chambrawl-mega"},
    itemUser: ["Chambrawl"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10168,
    gen: 6,
    isNonstandard: "Past"
}
