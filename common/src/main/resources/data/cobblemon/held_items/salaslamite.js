{
    name: "Salaslamite",
    spritenum: 620,
    megaStone: { "Salaslam": "Salaslam-mega"},
    itemUser: ["Salaslam"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10019,
    gen: 6,
    isNonstandard: "Past"
}
