package eight.example.myapp

class EightPlecostomus : EightFishAction, EightFishColor by EightGoldColor {

    override fun eat() {
        println("eat algae")
    }
}