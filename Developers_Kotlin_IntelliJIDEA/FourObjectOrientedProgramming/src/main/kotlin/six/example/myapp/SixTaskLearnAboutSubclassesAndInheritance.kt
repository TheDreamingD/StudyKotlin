package six.example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium1 = SixAquarium()
    aquarium1.printSize()
    val aquarium2 = SixAquarium(width = 25)
    aquarium2.printSize()
    val aquarium3 = SixAquarium(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = SixAquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = SixAquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}
