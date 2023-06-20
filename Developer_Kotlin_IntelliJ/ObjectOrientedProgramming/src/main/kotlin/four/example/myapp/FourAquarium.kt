package four.example.myapp

class FourAquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1

        height = (tank / (length * width)).toInt()
    }

    // Step 2: Add init blocks
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${ width * length * height / 1000 } l")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm")
    }
}