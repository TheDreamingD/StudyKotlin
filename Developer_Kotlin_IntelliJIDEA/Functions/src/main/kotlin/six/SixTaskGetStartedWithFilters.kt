package six

val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    println(decorations.filter { it[0] == 'p' })
}