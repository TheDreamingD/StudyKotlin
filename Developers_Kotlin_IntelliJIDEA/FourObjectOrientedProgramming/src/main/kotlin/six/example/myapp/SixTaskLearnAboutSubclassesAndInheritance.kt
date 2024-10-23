package six.example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium6 = SixAquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}
