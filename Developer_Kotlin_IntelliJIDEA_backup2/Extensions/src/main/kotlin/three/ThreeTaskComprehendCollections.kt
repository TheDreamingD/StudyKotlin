package three

fun main() {
    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sum()) // error
    println(list2.sumBy { it.length })

    for (s in list2.listIterator()) {
        print("$s ")
    }
    println()

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["red sores"])
    println(cures["scale loss"])

    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    println(cures.getOrElse("bloating") { "No cure for this" })

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}