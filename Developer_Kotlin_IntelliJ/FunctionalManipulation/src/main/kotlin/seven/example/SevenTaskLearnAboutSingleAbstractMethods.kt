package seven.example

fun main() {
    runExample()
}

fun runExample() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
    JavaRun.runNow(runnable)
}