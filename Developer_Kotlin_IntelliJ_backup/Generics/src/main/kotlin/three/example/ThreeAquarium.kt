package three.example

class ThreeAquarium<out T: ThreeWaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: ThreeCleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}