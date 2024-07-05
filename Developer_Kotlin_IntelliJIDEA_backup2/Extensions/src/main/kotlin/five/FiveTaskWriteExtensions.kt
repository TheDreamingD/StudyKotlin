package five

fun main() {
    println("Does it have spaces?".hasSpaces())

    val plant = FiveGreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: FiveAquariumPlant = plant
    aquariumPlant.print()

    println(aquariumPlant.isGreen)

    val plant2: FiveAquariumPlant? = null
    plant2.pull()
}

fun String.hasSpaces() = find { it == ' ' } != null