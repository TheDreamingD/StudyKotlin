package three.example

class ThreeTapWaterCleaner : ThreeCleaner<ThreeTapWater> {
    override fun clean(waterSupply: ThreeTapWater) = waterSupply.addChemicalCleaners()
}