{
    name: "Epochtwo ursalunanite",
    spritenum: 620,
    megaStone: { "Ursaluna-Epochtwo": "Ursaluna-mega_epochtwo"},
    itemUser: ["Ursaluna-Epochtwo"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10158,
    gen: 6,
    isNonstandard: "Past"
}
