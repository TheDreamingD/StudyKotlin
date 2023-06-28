package two.example

fun main(args: Array<String>) {
}

fun genericsExample() {
    val aquarium = TwoAquarium(TwoTapWater())
    aquarium.waterSupply.addChemicalCleaners()
}