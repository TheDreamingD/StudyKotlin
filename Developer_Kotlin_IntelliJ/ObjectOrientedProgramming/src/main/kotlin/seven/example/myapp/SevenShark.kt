package seven.example.myapp

class SevenShark : SevenAquariumFish(), SevenFishAction {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}