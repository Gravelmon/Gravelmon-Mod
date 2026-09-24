{
    name: "Damasoarite",
    spritenum: 620,
    megaStone: { "Damasoar": "Damasoar-mega"},
    itemUser: ["Damasoar"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10183,
    gen: 6,
    isNonstandard: "Past"
}
