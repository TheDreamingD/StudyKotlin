package four.example.myapp

class FourAquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    var length: Int = length
    var width: Int = width
    var height: Int = height

    fun printSize() {
        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
    }
}