package four.example

interface FourCleaner<in T: FourWaterSupply> {
    fun clean(waterSupply: T)
}