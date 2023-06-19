fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // Step 1: Create a filter
    println(decorations.filter { it[0] == 'p' })

    // Step 2: Compare eager and lazy filters
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("------")
    println("first: ${ lazyMap.first() }")
    println("------")
    println("all: ${ lazyMap.toList() }")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("------")
    println("filtered: ${ lazyMap2.toList() }")
}