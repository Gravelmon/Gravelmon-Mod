{
    name: "Blastoisite d",
    spritenum: 620,
    megaStone: { "Blastoise": "Blastoise-mega_d"},
    itemUser: ["Blastoise"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10134,
    gen: 6,
    isNonstandard: "Past"
}
