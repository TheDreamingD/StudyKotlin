package seven

fun main() {
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    println(updateDirty(30, waterFilter))

    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23 }
    println(dirtyLevel)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1
