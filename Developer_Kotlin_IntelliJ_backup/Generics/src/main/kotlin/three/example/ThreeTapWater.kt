package three.example

class ThreeTapWater : ThreeWaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}