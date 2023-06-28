package two.example

fun main(args: Array<String>) {
}

fun genericsExample() {
    val aquarium = TwoAquarium<TwoTapWater>(TwoTapWater())
    aquarium.waterSupply.addChemicalCleaners()
}