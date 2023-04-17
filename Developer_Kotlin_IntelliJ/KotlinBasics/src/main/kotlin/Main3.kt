fun main() {
//    var rocks: Int = null
    var marbles: Int? = null

//    var fishFoodTreats = 6
//    if (fishFoodTreats != null) {
//        fishFoodTreats = fishFoodTreats.dec()
//    }

    var fishFoodTreats: Int? = 6
    fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    val s: String? = "Null test"
    val len = s!!.length
}