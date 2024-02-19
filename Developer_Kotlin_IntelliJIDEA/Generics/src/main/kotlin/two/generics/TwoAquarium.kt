package two.generics

open class TwoWaterSupply(var needsProcessing: Boolean)

class TwoTapWater : TwoWaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class TwoFishStoreWater : TwoWaterSupply(false)

class TwoLakeWater : TwoWaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}