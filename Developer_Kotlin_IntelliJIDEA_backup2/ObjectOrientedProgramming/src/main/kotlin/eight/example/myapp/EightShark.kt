package eight.example.myapp

class EightShark : EightFishAction, EightFishColor {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}