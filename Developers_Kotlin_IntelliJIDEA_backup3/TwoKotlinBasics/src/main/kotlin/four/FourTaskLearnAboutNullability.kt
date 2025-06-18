package four

fun main() {
//    var rocks: Int = null // error
    var marbles: Int? = null

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
//    fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

//    val len = s!!.length
}
