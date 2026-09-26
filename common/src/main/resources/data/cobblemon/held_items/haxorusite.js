{
    name: "Haxorusite",
    spritenum: 620,
    megaStone: { "Haxorus": "Haxorus-mega"},
    itemUser: ["Haxorus"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10170,
    gen: 6,
    isNonstandard: "Past"
}
