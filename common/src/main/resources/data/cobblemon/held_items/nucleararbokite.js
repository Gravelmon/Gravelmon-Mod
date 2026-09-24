{
    name: "Nuclear arbokite",
    spritenum: 620,
    megaStone: { "Arbok-Nuclear": "Arbok-mega_nuclear"},
    itemUser: ["Arbok-Nuclear"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10054,
    gen: 6,
    isNonstandard: "Past"
}
