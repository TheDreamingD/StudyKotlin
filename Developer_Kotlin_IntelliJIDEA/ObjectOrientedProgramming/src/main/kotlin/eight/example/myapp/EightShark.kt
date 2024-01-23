package eight.example.myapp

class EightShark : EightAquariumFish() {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}