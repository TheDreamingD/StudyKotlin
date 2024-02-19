package five

open class FiveAquariumPlant(val color: String, private val size: Int)
class FiveGreenLeafyPlant(size: Int) : FiveAquariumPlant("green", size)

val FiveAquariumPlant.isGreen: Boolean
    get() = color == "green"

fun FiveAquariumPlant.print() = println("AquariumPlant")
fun FiveGreenLeafyPlant.print() = println("GreenLeafyPlant")

fun FiveAquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}