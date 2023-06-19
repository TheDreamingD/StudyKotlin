import java.util.*

fun main() {
    // Step 1: Create a default value for a parameter
    swim()
    swim("slow")
    swim(speed = "turtle-like")

    // Step 2: Add required parameters
    feedTheFish2()
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun feedTheFish2() {
    val day = randomDay2()
    val food = fishFood2(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${ shouldChangeWater(day) }")
}

fun randomDay2(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood2(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}