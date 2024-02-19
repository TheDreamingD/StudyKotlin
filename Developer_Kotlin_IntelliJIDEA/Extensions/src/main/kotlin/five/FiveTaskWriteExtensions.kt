package five

fun main() {
    println("Does it have spaces?".hasSpaces())
}

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}