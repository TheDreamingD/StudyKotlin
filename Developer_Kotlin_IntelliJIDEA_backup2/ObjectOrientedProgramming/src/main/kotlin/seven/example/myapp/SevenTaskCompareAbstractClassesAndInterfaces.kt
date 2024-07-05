package seven.example.myapp

fun main() {
    makeFish()
}

fun makeFish() {
    val shark = SevenShark()
    val pleco = SevenPlecostomus()

    println("Shark: ${ shark.color }")
    shark.eat()
    println("Plecostomus: ${ pleco.color }")
    pleco.eat()
}