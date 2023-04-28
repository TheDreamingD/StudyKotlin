fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }

    println(updateDirty(30, waterFilter2))

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel2 = 19
    dirtyLevel2 = updateDirty(dirtyLevel2) { dirtyLevel2 -> dirtyLevel2 + 23 }
    println(dirtyLevel2)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1