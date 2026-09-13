{
    name: "Poliwrathite",
    spritenum: 620,
    megaStone: { "Poliwrath": "Poliwrath-mega"},
    itemUser: ["Poliwrath"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10025,
    gen: 6,
    isNonstandard: "Past"
}
