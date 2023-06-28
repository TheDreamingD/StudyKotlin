package three.example

class ThreeLakeWater : ThreeWaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}