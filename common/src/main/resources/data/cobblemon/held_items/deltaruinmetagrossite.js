{
    name: "Delta ruin metagrossite",
    spritenum: 620,
    megaStone: { "Metagross-Delta ruin": "Metagross-mega_delta_ruin"},
    itemUser: ["Metagross-Delta ruin"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10241,
    gen: 6,
    isNonstandard: "Past"
}
