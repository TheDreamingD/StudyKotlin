package five.example.myapp

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium1 = FiveAquarium()
    aquarium1.printSize()
    val aquarium2 = FiveAquarium(width = 25)
    aquarium2.printSize()
    val aquarium3 = FiveAquarium(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = FiveAquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = FiveAquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}