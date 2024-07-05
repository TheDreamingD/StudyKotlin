package seven.example.myapp

class SevenShark : SevenAquariumFish() {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}