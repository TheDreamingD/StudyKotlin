package two.example

fun main(args: Array<String>) {
    genericsExample()
}

fun genericsExample() {
    val aquarium = TwoAquarium<TwoTapWater>(TwoTapWater())
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")

//    val aquarium2 = TwoAquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = TwoAquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

    val aquarium4 = TwoAquarium(TwoLakeWater())
    aquarium4.addWater()
}