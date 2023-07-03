package four.example

class FourLakeWater : FourWaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}