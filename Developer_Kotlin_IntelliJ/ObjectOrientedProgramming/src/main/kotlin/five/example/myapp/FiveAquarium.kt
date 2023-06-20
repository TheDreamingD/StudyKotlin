package five.example.myapp

class FiveAquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1

        height = (tank / (length * width)).toInt()
    }

    init {
        println("aquarium initializing")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm")

        println("Volume: $volume l")
    }
}