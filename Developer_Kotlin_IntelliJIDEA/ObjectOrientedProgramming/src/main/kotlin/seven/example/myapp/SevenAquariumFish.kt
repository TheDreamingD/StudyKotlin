package seven.example.myapp

abstract class SevenAquariumFish : SevenFishAction {
    abstract val color: String
    override fun eat() = println("yum")
}