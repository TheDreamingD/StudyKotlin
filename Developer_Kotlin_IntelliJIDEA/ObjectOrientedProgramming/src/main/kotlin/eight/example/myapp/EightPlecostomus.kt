package eight.example.myapp

class EightPlecostomus : EightFishAction, EightFishColor {
    override val color = "gold"

    override fun eat() {
        println("eat algae")
    }
}