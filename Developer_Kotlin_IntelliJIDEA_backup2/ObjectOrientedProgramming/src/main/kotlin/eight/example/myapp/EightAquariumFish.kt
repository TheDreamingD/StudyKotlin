package eight.example.myapp

abstract class EightAquariumFish : EightFishAction {
    abstract val color: String
    override fun eat() = println("yum")
}