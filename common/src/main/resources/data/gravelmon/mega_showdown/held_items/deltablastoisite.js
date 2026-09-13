{
    name: "Delta blastoisite",
    spritenum: 620,
    megaStone: { "Blastoise-Delta": "Blastoise-mega_delta"},
    itemUser: ["Blastoise-Delta"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10135,
    gen: 6,
    isNonstandard: "Past"
}
