package two.generics

fun main() {
}

fun genericsExample() {
    val aquarium = TwoAquarium<TwoTapWater>(TwoTapWater())
    aquarium.waterSupply.addChemicalCleaners()
}