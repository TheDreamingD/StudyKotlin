fun main() {
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val temperature2 = 10
    val message = "The water temperature is ${if (temperature2 > 50) "too warm" else "OK"}"
    println(message)
}