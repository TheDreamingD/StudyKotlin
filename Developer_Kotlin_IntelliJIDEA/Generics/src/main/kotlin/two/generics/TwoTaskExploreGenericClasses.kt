package two.generics

fun main() {
    genericsExample()
}

fun genericsExample() {
    val aquarium = TwoAquarium(TwoTapWater())
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")
}