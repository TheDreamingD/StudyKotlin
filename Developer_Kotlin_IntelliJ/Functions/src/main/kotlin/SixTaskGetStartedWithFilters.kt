val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    // Step 1: Create a filter
    println(decorations.filter { it[0] == 'p' })
}