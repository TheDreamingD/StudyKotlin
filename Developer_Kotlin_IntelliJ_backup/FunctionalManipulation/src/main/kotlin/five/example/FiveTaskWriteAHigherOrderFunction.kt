package five.example

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = FiveFish("Splashy")
    myWith(fish.name) {
        println(capitalize())
    }

    println(fish.run { name })

    val fish2 = FiveFish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }.let { it + "fish" }.let { it.length }.let { it + 31 })
    println(fish)
}