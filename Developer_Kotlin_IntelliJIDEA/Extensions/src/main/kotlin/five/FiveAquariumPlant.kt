package five

class FiveAquariumPlant(val color: String, private val size: Int)

fun FiveAquariumPlant.isRed() = color == "red"
//fun FiveAquariumPlant.isBig() = size > 50 // error