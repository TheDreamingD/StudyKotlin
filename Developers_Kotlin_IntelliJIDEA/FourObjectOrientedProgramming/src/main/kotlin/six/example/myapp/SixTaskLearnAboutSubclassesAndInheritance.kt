package six.example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = SixAquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = SixTowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
