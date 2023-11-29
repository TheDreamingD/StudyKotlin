package four.example

class FourAquarium<out T: FourWaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: FourCleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}