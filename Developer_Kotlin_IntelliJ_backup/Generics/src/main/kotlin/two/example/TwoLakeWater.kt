package two.example

class TwoLakeWater : TwoWaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}