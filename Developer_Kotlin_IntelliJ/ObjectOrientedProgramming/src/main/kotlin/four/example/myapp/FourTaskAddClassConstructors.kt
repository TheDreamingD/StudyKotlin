package four.example.myapp

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = FourAquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}