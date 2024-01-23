package eight.example.myapp

fun main() {
    makeFish()
}

fun makeFish() {
    val shark = EightShark()
    val pleco = EightPlecostomus()

    println("Shark: ${ shark.color }")
    shark.eat()
    println("Plecostomus: ${ pleco.color }")
    pleco.eat()
}