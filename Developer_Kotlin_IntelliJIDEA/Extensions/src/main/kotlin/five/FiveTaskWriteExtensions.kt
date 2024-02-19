package five

fun main() {
    println("Does it have spaces?".hasSpaces())
}

fun String.hasSpaces() = find { it == ' ' } != null