fun main() {
    println("Does it have spaces?".hasSpaces())

    val plant = FiveGreenLeafyPlant(size = 18)
    plant.print()
    println("\n")
    val aquariumPlant: FiveAquariumPlant = plant
    aquariumPlant.print()

    println(aquariumPlant.isGreen)

    val plant2: FiveAquariumPlant? = null
    plant2.pull()
}

fun String.hasSpaces() = find { it == ' ' } != null

open class FiveAquariumPlant(val color: String, private val size: Int)

class FiveGreenLeafyPlant(size: Int) : FiveAquariumPlant("green", size)

fun FiveAquariumPlant.print() = println("FiveAquariumPlant")
fun FiveGreenLeafyPlant.print() = println("FiveGreenLeafyPlant")

fun FiveAquariumPlant.isRed() = color == "red"
//fun FiveAquariumPlant.isBig() = size > 50

val FiveAquariumPlant.isGreen: Boolean
    get() = color == "green"

fun FiveAquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}