package two.example

class TwoTapWater : TwoWaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}