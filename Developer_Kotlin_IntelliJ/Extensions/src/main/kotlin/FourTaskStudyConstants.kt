const val rocks = 3

//val value1 = complexFunctionCall() // O
//const val CONSTANT1 = complexFunctionCall() // X

fun main() {
    val foo = Constants.CONSTANT2
}

object Constants {
    const val CONSTANT2 = "object constant"
}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}