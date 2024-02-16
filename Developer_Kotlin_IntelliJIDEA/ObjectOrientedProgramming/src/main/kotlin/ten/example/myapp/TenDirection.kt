package ten.example.myapp

enum class TenDirection(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(TenDirection.EAST.name)
    println(TenDirection.EAST.ordinal)
    println(TenDirection.EAST.degrees)
}