fun main() {
    val trafficLightColor = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }

    val x = 4

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }

    val xx: Any = 20

    when (xx) {
        2, 3, 5, 7 -> println("xx is a prime number between 1 and 10.")
        in 1..10 -> println("xx is a number between 1 and 10, but not a prime number.")
        is Int -> println("xx is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)

    val message2 = when (trafficLightColor) {
        "Red" -> "Go"
        "Yellow" -> "slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }

    println(message2)
}