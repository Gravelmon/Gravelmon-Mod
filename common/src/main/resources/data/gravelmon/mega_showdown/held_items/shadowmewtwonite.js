{
    name: "Shadow mewtwonite",
    spritenum: 620,
    megaStone: { "Mewtwo-Shadow": "Mewtwo-mega_shadow"},
    itemUser: ["Mewtwo-Shadow"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10221,
    gen: 6,
    isNonstandard: "Past"
}
