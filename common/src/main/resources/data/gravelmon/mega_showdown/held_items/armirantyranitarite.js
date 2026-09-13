{
    name: "Armiran tyranitarite",
    spritenum: 620,
    megaStone: { "Tyranitar-Armiran": "Tyranitar-mega_armiran"},
    itemUser: ["Tyranitar-Armiran"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10208,
    gen: 6,
    isNonstandard: "Past"
}
