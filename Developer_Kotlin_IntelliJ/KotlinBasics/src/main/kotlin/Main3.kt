fun main() {
    // Step 1: Learn about nullability
//    var rocks: Int = null
    var marbles: Int? = null

//    var fishFoodTreats = 6
//    if (fishFoodTreats != null) {
//        fishFoodTreats = fishFoodTreats.dec()
//    }

    // Step 2: Learn about the ? and ?: operators
    var fishFoodTreats: Int? = 6
    fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    val s: String? = "Null test"
    val len = s!!.length
}