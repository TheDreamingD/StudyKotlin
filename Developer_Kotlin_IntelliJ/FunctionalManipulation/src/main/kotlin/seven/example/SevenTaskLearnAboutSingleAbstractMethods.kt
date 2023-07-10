package seven.example

fun main() {
    runExample()
}

fun runExample() {
    JavaRun.runNow({
        println("Passing a lambda as a Runnable")
    })
}