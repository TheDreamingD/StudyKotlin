package five.example

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = FiveFish("Splashy")
    myWith(fish.name) {
        println(capitalize())
    }
}