package four.example

class FourTapWaterCleaner : FourCleaner<FourTapWater> {
    override fun clean(waterSupply: FourTapWater) = waterSupply.addChemicalCleaners()
}