package six.example.myapp

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium6 = SixAquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    val myTower = SixTowerTank(diameter = 25, height = 40)
    myTower.printSize()
}