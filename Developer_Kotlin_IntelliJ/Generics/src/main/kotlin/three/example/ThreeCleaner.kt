package three.example

interface ThreeCleaner<in T: ThreeWaterSupply> {
    fun clean(waterSupply: T)
}