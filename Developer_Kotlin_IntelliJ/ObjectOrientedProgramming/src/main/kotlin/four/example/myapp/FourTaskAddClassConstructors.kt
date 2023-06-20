package four.example.myapp

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    // Step 1: Create a constructor
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
    println("Volume: ${ aquarium6.width * aquarium6.length * aquarium6.height / 1000 } l")
}