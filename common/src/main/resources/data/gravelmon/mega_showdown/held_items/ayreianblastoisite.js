{
    name: "Ayreian blastoisite",
    spritenum: 620,
    megaStone: { "Blastoise-Ayreian": "Blastoise-mega_ayreian"},
    itemUser: ["Blastoise-Ayreian"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10136,
    gen: 6,
    isNonstandard: "Past"
}
