fun main() {
    // Step 1: Learn about nullability
//    var rocks: Int = null
    var marbles: Int? = null

    // Step 2: Learn about the ? and ?: operators
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

//    fishFoodTreats = fishFoodTreats?.dec()

    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    // A point about null pointers
//    val len = s!!.length
}