package three.example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = ThreeAquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}
