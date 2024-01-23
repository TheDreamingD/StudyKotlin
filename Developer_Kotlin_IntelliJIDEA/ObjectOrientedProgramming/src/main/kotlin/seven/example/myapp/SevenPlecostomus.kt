package seven.example.myapp

class SevenPlecostomus : SevenAquariumFish() {
    override val color = "gold"

    override fun eat() {
        println("eat algae")
    }
}