package seven.example.myapp

class SevenPlecostomus : SevenAquariumFish(), SevenFishAction {
    override val color = "gold"

    override fun eat() {
        println("eat algae")
    }
}