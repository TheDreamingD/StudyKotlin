package five.example

fun main() {
    fishExamples()
}

fun fishExamples() {
    val fish = FiveFish("Splashy")
    with (fish.name) {
        this.capitalize()
    }
}