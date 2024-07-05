package four.example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = FourAquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    val aquarium1 = FourAquarium()
    aquarium1.printSize()
    val aquarium2 = FourAquarium(width = 25)
    aquarium2.printSize()
    val aquarium3 = FourAquarium(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = FourAquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = FourAquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}