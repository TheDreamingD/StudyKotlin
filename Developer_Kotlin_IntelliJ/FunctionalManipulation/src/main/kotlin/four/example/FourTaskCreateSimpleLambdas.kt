package four.example

fun main() {
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(30))

    val myFish = listOf(FourFish("Flipper"), FourFish("Moby Dick"), FourFish("Dory"))
    println(myFish.filter { it.name.contains("i") })
}