package eight.example.myapp

class EightPlecostomus : EightAquariumFish() {
    override val color = "gold"

    override fun eat() {
        println("eat algae")
    }
}