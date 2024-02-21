package three.generics

open class ThreeWaterSupply(var needsProcessing: Boolean)

class ThreeTapWater : ThreeWaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class ThreeFishStoreWater : ThreeWaterSupply(false)

class ThreeLakeWater : ThreeWaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class ThreeAquarium<T: ThreeWaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}