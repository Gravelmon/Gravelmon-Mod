{
    name: "Delta spider metagrossite",
    spritenum: 620,
    megaStone: { "Metagross-Delta spider": "Metagross-mega_delta_spider"},
    itemUser: ["Metagross-Delta spider"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10239,
    gen: 6,
    isNonstandard: "Past"
}
