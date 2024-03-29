package three.generics

fun main() {
    genericsExample()
}

fun genericsExample() {
    val aquarium = ThreeAquarium(ThreeTapWater())
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")

//    val aquarium2 = ThreeAquarium("string")
//    println(aquarium2.waterSupply)
//
//    val aquarium3 = ThreeAquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

    val aquarium4 = ThreeAquarium(ThreeLakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}