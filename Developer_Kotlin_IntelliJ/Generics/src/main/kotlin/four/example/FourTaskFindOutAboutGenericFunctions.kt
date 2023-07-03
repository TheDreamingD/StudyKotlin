package four.example

fun main(args: Array<String>) {
    genericsExample()
}

fun genericsExample() {
    val aquarium = FourAquarium<FourTapWater>(FourTapWater())
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${ aquarium.waterSupply.needsProcessing }")

//    val aquarium2 = FourAquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = FourAquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("waterSupply is null")
//    }

//    val aquarium4 = FourAquarium(FourLakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()

    val aquarium5 = FourAquarium(FourTapWater())
    addItemTo(aquarium5)

    val cleaner = FourTapWaterCleaner()
    val aquarium6 = FourAquarium(FourTapWater())
    aquarium6.addWater(cleaner)
}

fun addItemTo(aquarium: FourAquarium<FourWaterSupply>) = println("item added")

fun isWaterClean(aquarium: FourAquarium<FourWaterSupply>) {
    println("aquarium water is clean: ${ !aquarium.waterSupply.needsProcessing }")
}