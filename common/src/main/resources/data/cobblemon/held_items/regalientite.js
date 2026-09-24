{
    name: "Regalientite",
    spritenum: 620,
    megaStone: { "Regalient": "Regalient-mega"},
    itemUser: ["Regalient"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 10105,
    gen: 6,
    isNonstandard: "Past"
}
