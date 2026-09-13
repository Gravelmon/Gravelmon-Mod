{
    name: "Typhlosionite",
    spritenum: 620,
    megaStone: { "Typhlosion": "Typhlosion-mega"},
    itemUser: ["Typhlosion"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10072,
    gen: 6,
    isNonstandard: "Past"
}
