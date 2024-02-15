package eight.example.myapp

class EightPrintingFishAction(val food: String) : EightFishAction {

    override fun eat() {
        println(food)
    }
}