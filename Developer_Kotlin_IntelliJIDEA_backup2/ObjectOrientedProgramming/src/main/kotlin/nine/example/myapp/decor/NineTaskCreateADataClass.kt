package nine.example.myapp.decor

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val decoration1 = NineDecoration("granite")
    println(decoration1)

    val decoration2 = NineDecoration("slate")
    println(decoration2)

    val decoration3 = NineDecoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    val d5 = NineDecoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}