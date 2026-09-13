{
    name: "Spiritombite",
    spritenum: 620,
    megaStone: { "Spiritomb": "Spiritomb-mega"},
    itemUser: ["Spiritomb"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10076,
    gen: 6,
    isNonstandard: "Past"
}
