{
    name: "Cryodragonite",
    spritenum: 620,
    megaStone: { "Cryodrago": "Cryodrago-mega"},
    itemUser: ["Cryodrago"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10212,
    gen: 6,
    isNonstandard: "Past"
}
