fun main() {
    println("Does it have spaces?".hasSpaces())
}

fun String.hasSpaces() = find { it == ' ' } != null

class FiveAquariumPlant(val color: String, private val size: Int)

fun FiveAquariumPlant.isRed() = color == "red"
//fun FiveAquariumPlant.isBig() = size > 50