{
    name: "Reuniclusite",
    spritenum: 620,
    megaStone: { "Reuniclus": "Reuniclus-mega"},
    itemUser: ["Reuniclus"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10156,
    gen: 6,
    isNonstandard: "Past"
}
