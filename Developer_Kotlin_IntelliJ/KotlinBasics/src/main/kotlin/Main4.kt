fun main() {
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList.remove("shark"))
    println(myList)

    val school2 = arrayOf("shark", "salmon", "minnow");
    println(java.util.Arrays.toString(school2))

    val mix = arrayOf("fish", 2)
    println(java.util.Arrays.toString(mix))

    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers4, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
}