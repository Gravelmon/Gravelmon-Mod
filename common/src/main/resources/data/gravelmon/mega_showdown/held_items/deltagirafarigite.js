{
    name: "Delta girafarigite",
    spritenum: 620,
    megaStone: { "Girafarig-Delta": "Girafarig-mega_delta"},
    itemUser: ["Girafarig-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10028,
    gen: 6,
    isNonstandard: "Past"
}
